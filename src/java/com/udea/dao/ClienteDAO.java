/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udea.dao;

import com.udea.model.Cliente;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author jorgel.diaz <jlditru@gmail.com>
 */
@Stateless
public class ClienteDAO implements ClienteDAOLocal {
    @PersistenceContext(unitName = "Lab2ArqSoftPU")
    private EntityManager em;
   
          

    @Override
    public void addCliente(Cliente cliente) {
        em.persist(cliente);
    }    

    @Override
    public void editCliente(Cliente cliente) {
        em.merge(cliente);
    }

    @Override
    public void deleteCliente(int idCliente) {
        em.remove(getCliente(idCliente));
                
    }

    @Override
    public Cliente getCliente(int idCliente) {
        return em.find(Cliente.class, idCliente);
    }

    @Override
    public List<Cliente> getAllClientes() {
        return em.createNamedQuery("Cliente.getAll").getResultList();
    }

    public void persist(Object object) {
        em.persist(object);
    }

    public void persist1(Object object) {
        em.persist(object);
    }
    
}
