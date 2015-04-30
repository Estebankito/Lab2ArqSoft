/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udea.controller;

import com.udea.dao.VentaDAOLocal;
import com.udea.model.Venta;
import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author usuario
 */
public class VentaServlet extends HttpServlet {
    @EJB
    private VentaDAOLocal ventaDAO;
    

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        String accion;
        String texto;
        String nroFactura="";
        int idCliente=0;
        String idVehiculo="";
        int cantidad=0;
        Double precioTotal=0.0;
        
        accion = request.getParameter("accion");
        
        texto = request.getParameter("nroFactura");
        if (Validacion.validarString(texto) == true) {
            nroFactura = texto;            
        }
        
        texto = request.getParameter("idCliente");
        if (Validacion.validarNumero(texto) == true) {
            idCliente = Integer.parseInt(texto);            
        }
        
        texto = request.getParameter("idVehiculo");
        if (Validacion.validarString(texto)) {
            idVehiculo = texto;            
        }
        
        texto = request.getParameter("cantidad");
        if (Validacion.validarNumero(texto)) {
            cantidad = Integer.parseInt(texto);            
        }
        
        texto = request.getParameter("precioTotal");
        if (Validacion.validarPrecio(texto)) {
            precioTotal = Double.parseDouble(texto);            
        }
        
        Venta venta = new Venta(nroFactura, idCliente, idVehiculo, cantidad, precioTotal);
        
        if ("Add".equalsIgnoreCase(accion)) {
            ventaDAO.addVenta(venta);
        }else if ("Edit".equalsIgnoreCase(accion)) {
            ventaDAO.editVenta(venta);            
        }else if ("Delete".equalsIgnoreCase(accion)) {
            ventaDAO.deleteVenta(nroFactura);            
        }else if ("Search".equalsIgnoreCase(accion)) {
            ventaDAO.getVenta(nroFactura);
        }
        
        request.setAttribute("venta", venta);
        request.setAttribute("AllVentas", ventaDAO.getAllVentas());
        
        // CAMBIAR PARAMETRO POR jsp CORRESPONDIENTE
        request.getRequestDispatcher("ABCDEF.jsp").forward(request, response);
        
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
