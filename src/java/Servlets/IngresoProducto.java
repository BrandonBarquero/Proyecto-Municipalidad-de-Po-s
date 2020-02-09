package Servlets;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Dao.ProductoDAO;
import Dao.UsuarioDAO;
import Entidades.Producto;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
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
            throws ServletException, IOException, Exception {
            PrintWriter out = response.getWriter();
            
            String Codigo_Producto=request.getParameter("Codigo_Producto");
            String Codigo_Presupuestario=request.getParameter("Presupuestario");
            String Nombre=request.getParameter("nombre");
            String Unidad=request.getParameter("Unidad");
            String Descripcion=request.getParameter("Descripcion");
            String Precio=request.getParameter("Precio");
            String Cantidad=request.getParameter("Cantidad");
            String Marca=request.getParameter("Marca");
            String Fecha_Entrada=request.getParameter("Fecha");
            String Ubicacion=request.getParameter("Ubicacion");
            String Tipo_Producto=request.getParameter("Tipo");
            String Garantia=request.getParameter("Garantia");
            String Proveedor=request.getParameter("Proveedor");
            
            Producto producto = new Producto(Codigo_Producto,Codigo_Presupuestario,Nombre,Unidad,Descripcion,Precio
                    ,Cantidad,Marca,Fecha_Entrada,Ubicacion,Tipo_Producto,Garantia,Proveedor);
            
             ProductoDAO Productodao =new ProductoDAO();
            
             int ln_r=Productodao.insertar(producto);
            
               
               
                if(ln_r>=1){
                response.sendRedirect("ListarProductos.jsp");
                
                }else {
                out.println("<h1> Error</h1>");
                            response.sendRedirect("PaginaError.jsp");
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
        try {
            processRequest(request, response);
        } catch (Exception ex) {
            Logger.getLogger(IngresoProducto.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        try {
            processRequest(request, response);
        } catch (Exception ex) {
            Logger.getLogger(IngresoProducto.class.getName()).log(Level.SEVERE, null, ex);
        }
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
