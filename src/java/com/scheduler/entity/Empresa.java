/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.scheduler.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author daniel
 */
@Entity
@Table(name="tb_empresa")
public class Empresa extends PessoaJuridica {
    
    @Column(name="id_matriz")
    private int idMatriz;
    
    @Column(name="cd_cnae")
    private int cdCNAE;
    
    @Column(name="vl_fap")
    private float vlFAP;
    
    @Column(name="pe_rat")
    private float peRAT;

    public int getIdMatriz() {
        return idMatriz;
    }
    public void setIdMatriz(int idMatriz) {
        this.idMatriz = idMatriz;
    }

    public int getCdCNAE() {
        return cdCNAE;
    }
    public void setCdCNAE(int cdCNAE) {
        this.cdCNAE = cdCNAE;
    }

    public float getVlFAP() {
        return vlFAP;
    }
    public void setVlFAP(float vlFAP) {
        this.vlFAP = vlFAP;
    }

    public float getPeRAT() {
        return peRAT;
    }
    public void setPeRAT(float peRAT) {
        this.peRAT = peRAT;
    }
}
