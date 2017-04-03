/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.scheduler.entity;

import com.scheduler.util.Enumerators.TipoPessoa;
import java.util.Calendar;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;

/**
 *
 * @author daniel
 */
@Entity
@Table(name="tb_pessoa")
public class Pessoa extends BaseEntity {
    
    @Column(name="tp_pessoa")
    private TipoPessoa tipo;
    
    @Column(name="dt_cadastro")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataCadastro;

    public Pessoa(){
        dataCadastro = Calendar.getInstance().getTime();
    }
    
    public TipoPessoa getTipo() {
        return tipo;
    }
    public void setTipo(TipoPessoa tipo) {
        this.tipo = tipo;
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }
    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }
    
}
