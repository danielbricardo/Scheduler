package com.scheduler.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author daniel
 */
@Entity
@Table(name="tb_cliente")
public class Cliente extends Pessoa{
    
    @Column(name="id_empresa")
    
    @ManyToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="id", nullable=false, updatable=false)
    private Empresa empresa;

    public Cliente(){
        
    }
    
    public Empresa getEmpresa() {
        return empresa;
    }
    public void setIdEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }
    
}
