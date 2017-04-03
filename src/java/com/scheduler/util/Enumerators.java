/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.scheduler.util;

/**
 *
 * @author daniel
 */
public class Enumerators {
    
    public enum TipoPessoa{
        PessoaFisica("PF"),
        PessoaJuridica("PJ");
        
        private String tipo;
        private final String descricao;
        
        TipoPessoa(String tipo){
            if (tipo.equals("PF")){
                this.descricao = "Pessoa Física";
            }
            else{
                this.descricao = "Pessoa Jurídica";
            }
        }
        
        public String getTipo(){
            return this.tipo;
        }
        public String getDescricao(){
            return this.descricao;
        }
    }
}