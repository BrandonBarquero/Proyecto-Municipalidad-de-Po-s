package Servlets;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Dao.ProductoDAO;
import Dao.Salida_ProductoDAO;
import Entidades.Producto;
import Entidades.Salida_Producto;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
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
@WebServlet(urlPatterns = {"/SalidaProducto"})
public class SalidaProducto extends HttpServlet {

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
            throws ServletException, IOException, ClassNotFoundException, SQLException, Exception {
               PrintWriter lu_out = response.getWriter(); 

            String sum=request.getParameter("sum");
            String codigo=request.getParameter("codigo");
            String res=request.getParameter("res");
            String date=request.getParameter("date");
            String dep=request.getParameter("dep");
            String nuevo=request.getParameter("nuevo");
        
          int entero = Integer.parseInt(sum);
          
           Salida_Producto salida_producto = new Salida_Producto(date,dep,entero,codigo,res);
            
             Salida_ProductoDAO Salida_Productodao =new Salida_ProductoDAO();
             ProductoDAO productodao =new ProductoDAO();
             int ln_r=Salida_Productodao.insertar(salida_producto);



             
            String lc_Codigo=request.getParameter("codigo");
            
            
           
               
                if(nuevo!=null&&lc_Codigo!=null){
                int p=productodao.Actualizar_Cantidad(sum, codigo);
                 
                response.sendRedirect("ListarProductos.jsp");
                
                
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
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SalidaProducto.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(SalidaProducto.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(SalidaProducto.class.getName()).log(Level.SEVERE, null, ex);
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
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SalidaProducto.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(SalidaProducto.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(SalidaProducto.class.getName()).log(Level.SEVERE, null, ex);
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
