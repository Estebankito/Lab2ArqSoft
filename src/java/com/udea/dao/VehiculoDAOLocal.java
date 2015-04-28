/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udea.dao;

import com.udea.model.Vehiculo;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author jorgel.diaz <jlditru@gmail.com>
 */
@Local
public interface VehiculoDAOLocal {

    void addVehiculo(Vehiculo vehiculo);

    void editVehiculo(Vehiculo vehiculo);

    void deleteVehiculo(int idVehiculo);

    Vehiculo getVehiculo(int idVehiculo);

    List<Vehiculo> getAllVehiculos();
    
}
