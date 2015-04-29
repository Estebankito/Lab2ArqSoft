/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udea.dao;

import com.udea.model.Venta;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author jorgel.diaz <jlditru@gmail.com>
 */
@Local
public interface VentaDAOLocal {

    void addVenta(Venta venta);

    List<Venta> getAllVentas();

    void editVenta(Venta iventa);

    void deleteVenta(int idVenta);

    Venta getVenta(int idVenta);
    
}
