/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udea.controller;

import com.udea.dao.VehiculoDAOLocal;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
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
public class VehiculoServlet extends HttpServlet {

    @EJB
    private VehiculoDAOLocal vehiculoDAO;

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

        String texto;
        String matricula;
        String color;
        int cantidad = 0;
        int modelo = 0;
        Double precio;
        InputStream inputStream = null;
           //FOTO*************************************

        matricula = request.getParameter("matricula");

        texto = request.getParameter("modelo");
        if (Validacion.validarNumero(texto)) {
            modelo = Integer.parseInt(texto);
        }

        texto = request.getParameter("color");
        if (Validacion.validarString(texto)) {
            color = texto;            
        }
        
        texto = request.getParameter("cantidad");
        if (Validacion.validarNumero(texto)) {
            cantidad = Integer.parseInt(texto);
        }
        
        texto = request.getParameter("precio");
        if (Validacion.validarPrecio(texto)) {
            precio = Double.parseDouble(texto);
        }
       

        // Obtener el archivo en partes a traves de una petición Multipart
        Part filePart = request.getPart("foto");

        if (filePart != null) {

            // Información para Debug
            System.out.println(filePart.getName());
            System.out.println(filePart.getSize());
            System.out.println(filePart.getContentType());

            // Obtener el InputStream del Archivo Subido
            inputStream = filePart.getInputStream();
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
