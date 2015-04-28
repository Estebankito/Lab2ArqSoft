/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udea.dao;

import javax.ejb.Local;
import com.udea.model.Cliente;
import java.util.List;
/**
 *
 * @author jorgel.diaz <jlditru@gmail.com>
 */

@Local
public interface ClienteDAOLocal {

    void addCliente(Cliente cliente);

    void editCliente(Cliente cliente);

    void deleteCliente(int idCliente);

    Cliente getCliente(int idCliente);

    List<Cliente> getAllClientes();
    
}
