/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udea.dao;

import com.udea.model.Venta;
import java.util.List;
import javax.ejb.Stateless;

/**
 *
 * @author jorgel.diaz <jlditru@gmail.com>
 */
@Stateless
public class VentaDAO implements VentaDAOLocal {

    @Override
    public void addVenta(Venta venta) {
    }

    @Override
    public List<Venta> getAllVentas() {
        return null;
    }
    
}
