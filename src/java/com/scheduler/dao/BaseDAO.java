/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.scheduler.dao;

import com.scheduler.entity.Pessoa;
import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Order;
import javax.persistence.criteria.Root;

/**
 *
 * @author daniel
 * @param <T>
 * @param <PK>
 */
public class BaseDAO <T, PK extends Serializable> implements IGenericDAO<T, PK> {
    
    protected Class<T> entityClass;

    @PersistenceContext
    protected EntityManagerFactory emf; 
    
    protected BaseDAO(){
        ParameterizedType genericSuperclass = (ParameterizedType) getClass().getGenericSuperclass();
        this.entityClass = (Class<T>) genericSuperclass.getActualTypeArguments()[0];
        this.emf = Persistence.createEntityManagerFactory("SchedulerPU");
    }
  
    protected BaseDAO(Class<T> t) {
        //this();
        this.entityClass = t;
        this.emf = Persistence.createEntityManagerFactory("SchedulerPU");
    }

    public EntityManager getEntityManager(){
        return emf.createEntityManager();
    }

    @Override
    public T save(T t) {
        EntityTransaction transaction = this.getEntityManager().getTransaction();
        transaction.begin();
        this.getEntityManager().persist(t); //Cria novo objeto
        //this.getEntityManager().merge(t); //Atualiza
        this.getEntityManager().flush();
        transaction.commit();
        return t;
    }

    @Override
    public T getById(PK id) {
        return this.getEntityManager().find(entityClass, id);
    }

    @Override
    public void delete(T t) {
        EntityTransaction transaction = this.getEntityManager().getTransaction();
        transaction.begin();
        T mergedEntity = this.getEntityManager().merge(t);
        this.getEntityManager().remove(mergedEntity);
        this.getEntityManager().flush();
        transaction.commit();
    }

    @Override
    public List<T> getList() {
        CriteriaBuilder builder = this.getEntityManager().getCriteriaBuilder();
        CriteriaQuery<T> query = builder.createQuery(entityClass);
        query.from(entityClass);
        //return getEntityManager().createQuery(query).getResultList();
        
        return this.getEntityManager().createQuery("select o from " + this.entityClass.getClass().getSimpleName() + " o").getResultList();
    }
    
    public List<T> getList(Order order, String... propertiesOrder) {
        CriteriaBuilder builder = this.getEntityManager().getCriteriaBuilder();
        CriteriaQuery<T> query = builder.createQuery(entityClass);
        Root<T> root = query.from(this.entityClass);
        
        List<javax.persistence.criteria.Order> orders = new ArrayList<>();
        for (String propertyOrder : propertiesOrder) {
            if (order.isAscending()) {
                orders.add(builder.asc(root.get(propertyOrder)));
            } else {
                orders.add(builder.desc(root.get(propertyOrder)));
            }
        }
        query.orderBy(orders);
 
        return this.getEntityManager().createQuery(query).getResultList();
}

    @Override
    public void delete(PK id) {
        T t = this.getById(id);
        if (t != null){
            this.delete(t);
        }
    }
}
