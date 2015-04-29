/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udea.dao;

import com.udea.model.Vehiculo;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author jorgel.diaz <jlditru@gmail.com>
 */
@Stateless
public class VehiculoDAO implements VehiculoDAOLocal {
    @PersistenceContext(unitName = "Lab2ArqSoftPU")
    private EntityManager em;
    
    
    @Override
    public void addVehiculo(Vehiculo vehiculo) {
        em.persist(vehiculo);
    }

    @Override
    public void editVehiculo(Vehiculo vehiculo) {
        em.merge(vehiculo);
    }

    @Override
    public void deleteVehiculo(int idVehiculo) {
        em.remove(getVehiculo(idVehiculo));
    }

    @Override
    public Vehiculo getVehiculo(int idVehiculo) {
        return em.find(Vehiculo.class, idVehiculo);
    }

    @Override
    public List<Vehiculo> getAllVehiculos() {
        return em.createNamedQuery("Vehiculo.getAll").getResultList();
    }

    public void persist(Object object) {
        em.persist(object);
    }

    
    
    
    
}
