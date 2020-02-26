package Servlets;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Dao.ProductoDAO;
import Dao.SalidaProductoDAO;
import Entidades.SalidaProducto;
import Services.ProductoService;
import Services.SalidaProductoService;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author barqu
 */
@WebServlet(urlPatterns = {"/SalidaProductoBodeguero"})
public class SalidaProductoBodeguero extends HttpServlet {

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
      
            String la_suma=request.getParameter("suma");
            String ln_codigoProducto=request.getParameter("codigoProducto");
            String la_resta=request.getParameter("responsable");
            String ld_date=request.getParameter("date");
            String la_departamento=request.getParameter("departamento");
            String la_nuevaCantidad=request.getParameter("cantidadRetirar");
        
          int ln_numero = Integer.parseInt(la_suma);
          
           SalidaProducto lo_salidaProducto = new SalidaProducto(ld_date,la_departamento,ln_numero,ln_codigoProducto,la_resta);
            
             SalidaProductoService lo_salidaProductodao =new SalidaProductoService();
             ProductoService lo_productodao =new ProductoService();
             int ln_var=lo_salidaProductodao.insertar(lo_salidaProducto);



             
            String ln_codigo=request.getParameter("codigoProducto");
            
            
           
               
                if(la_nuevaCantidad!=null&&ln_codigo!=null){
                int ln_p=lo_productodao.actualizarCantidad(la_suma, ln_codigoProducto);
                 
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
            Logger.getLogger(SalidaProductoBodeguero.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(SalidaProductoBodeguero.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(SalidaProductoBodeguero.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(SalidaProductoBodeguero.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(SalidaProductoBodeguero.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(SalidaProductoBodeguero.class.getName()).log(Level.SEVERE, null, ex);
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
