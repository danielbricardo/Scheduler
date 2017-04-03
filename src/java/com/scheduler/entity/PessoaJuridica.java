/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.scheduler.entity;

import com.scheduler.util.Enumerators;
import java.util.Calendar;

/**
 *
 * @author daniel
 */
public class PessoaJuridica extends Pessoa {
    
    private String cnpj;
    private String razaSocial;
    private String InscEstadual;
    private String InscMunicipal;
    
    public String getCnpj() {
        return cnpj;
    }
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getRazaSocial() {
        return razaSocial;
    }
    public void setRazaSocial(String razaSocial) {
        this.razaSocial = razaSocial;
    }

    public String getInscEstadual() {
        return InscEstadual;
    }
    public void setInscEstadual(String InscEstadual) {
        this.InscEstadual = InscEstadual;
    }

    public String getInscMunicipal() {
        return InscMunicipal;
    }
    public void setInscMunicipal(String InscMunicipal) {
        this.InscMunicipal = InscMunicipal;
    }
    
    public PessoaJuridica(){
        this.setTipo(Enumerators.TipoPessoa.PessoaJuridica);
        this.setDataCadastro(Calendar.getInstance().getTime());
    }
}
