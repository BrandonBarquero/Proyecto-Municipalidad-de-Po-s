package Servlets;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Entidades.Producto;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Allan
 */
@WebServlet(urlPatterns = {"/IngresoProducto"})
public class IngresoProducto extends HttpServlet {

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
        PrintWriter out = response.getWriter();
            String lc_Codigo_Presupuestario=request.getParameter("Presupuestario");
            String lc_Nombre=request.getParameter("nombre");
            String lc_Unidad=request.getParameter("Unidad");
            String lc_Descripcion=request.getParameter("Descripcion");
            String lc_Precio=request.getParameter("Precio");
            String lc_cantidad=request.getParameter("Cantidad");
            String lc_marca=request.getParameter("Marca");
            String lc_Fecha_Entrada=request.getParameter("Fecha");
            String lc_Ubicacion=request.getParameter("Ubicacion");
            String lc_Tipo=request.getParameter("Tipo");
            String lc_Tipo2=request.getParameter("Proveedor");
            String lc_Tipo3=request.getParameter("Garantia");
            
            Producto producto = new Producto();
            
            
            int ln_r;
               
               
                if(ln_r>=1){
                response.sendRedirect("ListarProductos.jsp");
                
                }else {
                out.println("<h1> Error</h1>");
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
