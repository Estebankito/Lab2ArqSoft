/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udea.dao;

import com.udea.model.Vehiculo;
import java.util.List;
import javax.ejb.Stateless;

/**
 *
 * @author jorgel.diaz <jlditru@gmail.com>
 */
@Stateless
public class VehiculoDAO implements VehiculoDAOLocal {

    @Override
    public void addVehiculo(Vehiculo vehiculo) {
    }

    @Override
    public void editVehiculo(Vehiculo vehiculo) {
    }

    @Override
    public void deleteVehiculo(int idVehiculo) {
    }

    @Override
    public Vehiculo getVehiculo(int idVehiculo) {
        return null;
    }

    @Override
    public List<Vehiculo> getAllVehiculos() {
        return null;
    }

    
    
    
    
}
