/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import java.sql.Connection;

/**
 *
 * @author gusta
 */
public class ProdutoDAO {
    
    private Connection c;
    
    public ProdutoDAO() {
        this.c = ConnectionFactory.getConnection("jdbc:mysql://localhost/farmacia", username, password);
    }
    
}