package com.scheduler.entity;

import com.scheduler.util.Enumerators;
import java.util.Calendar;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author daniel
 */
@Entity
@Table(name="tb_pessoajur")
public class PessoaJuridica extends Pessoa {
    
    @Column(name="nr_cnpj")
    private String cnpj;
    
    @Column(name="nm_razaosocial")
    private String razaSocial;
    
    @Column(name="nm_fantasia")
    private String Fantasia;
    
    @Column(name="nr_ie")
    private String InscEstadual;
    
    @Column(name="nr_im")
    private String InscMunicipal;
    
    /*** Construtor ***/
    public PessoaJuridica(){
        this.setTipo(Enumerators.TipoPessoa.PessoaJuridica);
        this.setDataCadastro(Calendar.getInstance().getTime());
    }
    
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
    
    public String getFantasia() {
        return Fantasia;
    }
    public void setFantasia(String Fantasia) {
        this.Fantasia = Fantasia;
    }
}
