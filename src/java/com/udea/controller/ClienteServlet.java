/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udea.controller;

import com.udea.dao.ClienteDAOLocal;
import java.io.IOException;
import java.io.InputStream;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

/**
 *
 * @author usuario
 */
public class ClienteServlet extends HttpServlet {
    @EJB
    private ClienteDAOLocal clienteDAO;   
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        String texto;
        String nombres = "";
        String apellidos = "";
        String correo = "";
        int telefono = 0;
        int identificacion = 0;
        
        String action = request.getParameter("accion");
        
        texto = request.getParameter("identificacion");        
        if (Validacion.validarNumero(texto)==true) {
               identificacion = Integer.parseInt(texto);               
        }
        
       texto = request.getParameter("nombres");
        if (Validacion.validarString(texto)==true) {
            nombres = texto;            
        }
        
        texto = request.getParameter("apellidos");
        if (Validacion.validarString(texto)==true) {
            apellidos = texto;
        }       
        
        correo = request.getParameter("correo");
        
        texto = request.getParameter("telefono");               
        if (Validacion.validarNumero(texto)==true) {
            telefono = Integer.parseInt(texto);
        }
        
       
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
