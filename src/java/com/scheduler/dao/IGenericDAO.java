/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.scheduler.dao;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author danie
 * @param <T>
 * @param <PK>
 */
public interface IGenericDAO <T, PK extends Serializable> {

    T save(T t);
    T getById(PK id);
    List<T> getList();
    //T update(T t);
    void delete(T t);
    void delete(PK id);

}
