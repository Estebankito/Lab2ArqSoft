/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udea.dao;

import com.udea.model.Venta;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author jorgel.diaz <jlditru@gmail.com>
 */
@Stateless
public class VentaDAO implements VentaDAOLocal {
    @PersistenceContext(unitName = "Lab2ArqSoftPU")
    private EntityManager em;
    

    @Override
    public void addVenta(Venta venta) {
        em.persist(venta);
    }

    @Override
    public List<Venta> getAllVentas() {
        return em.createNamedQuery("Venta.getAll").getResultList();
    }

    @Override
    public void editVenta(Venta iventa) {
        em.merge(iventa);
    }

    @Override
    public void deleteVenta(String idVenta) {
        em.remove(getVenta(idVenta));
    }

    @Override
    public Venta getVenta(String idVenta) {
        return em.find(Venta.class, idVenta);
    }

    public void persist(Object object) {
        em.persist(object);
    }
    
}
