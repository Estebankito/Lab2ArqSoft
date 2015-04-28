/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udea.dao;

import com.udea.model.Cliente;
import java.util.List;
import javax.ejb.Stateless;

/**
 *
 * @author jorgel.diaz <jlditru@gmail.com>
 */
@Stateless
public class ClienteDAO implements ClienteDAOLocal {

    @Override
    public void addCliente(Cliente cliente) {
    }    

    @Override
    public void editCliente(Cliente cliente) {
    }

    @Override
    public void deleteCliente(int idCliente) {
    }

    @Override
    public Cliente getCliente(int idCliente) {
        return null;
    }

    @Override
    public List<Cliente> getAllClientes() {
        return null;
    }
    
}
