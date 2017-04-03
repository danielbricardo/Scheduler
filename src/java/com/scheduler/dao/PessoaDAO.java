/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.scheduler.dao;

import com.scheduler.entity.Pessoa;

/**
 *
 * @author daniel
 */
public class PessoaDAO extends BaseDAO <Pessoa, Long> {
    
    public PessoaDAO(){
        super(Pessoa.class);
    }
    
}
