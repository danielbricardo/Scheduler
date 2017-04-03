/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.scheduler.entity;

import com.scheduler.util.Enumerators;
import java.util.Calendar;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;

/**
 *
 * @author danie
 */
@Entity
@Table(name="tb_pessoaf")
public class PessoaFisica extends Pessoa{
    
    @Column(name="nr_cpf")
    private String cpf;
    
    @Column(name="nm_pessoa")
    private String nome;
        
    @Temporal(javax.persistence.TemporalType.DATE)
    @Column(name="dt_nascto")
    private Date dataNascto;
    
    public PessoaFisica(){
        this.setTipo(Enumerators.TipoPessoa.PessoaFisica);
        this.setDataCadastro(Calendar.getInstance().getTime());
    }

    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public Date getDataNascto() {
        return dataNascto;
    }
    public void setDataNascto(Date dataNascto) {
        this.dataNascto = dataNascto;
    }
    
}
