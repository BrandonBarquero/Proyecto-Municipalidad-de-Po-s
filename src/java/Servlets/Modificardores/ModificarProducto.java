package Servlets.Modificardores;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Dao.ProductoDAO;
import Entidades.Producto;
import Services.ProductoService;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
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
 * @author Allan
 */
@WebServlet(name="ModificarProducto", urlPatterns = {"/ModificarProducto"})
public class ModificarProducto extends HttpServlet {

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
     
        
            String la_codigoPresupuestario=request.getParameter("Codigo_P");
            String la_codigoProducto=request.getParameter("Codigo");
            String la_nombreProducto=request.getParameter("Nombre");
            String la_unidad=request.getParameter("Unidad");
            String la_descripcion=request.getParameter("Descripcion");
            String la_precioProducto=request.getParameter("Precio");
            String la_marcaProducto=request.getParameter("Marca");
            String la_fecha=request.getParameter("Fecha");
            String la_entrada=request.getParameter("Entrada");
            String la_ubicacion=request.getParameter("Ubicacion");
            String la_tipo=request.getParameter("Tipo");
            String la_proveedor=request.getParameter("Proveedor");
          Producto lo_producto = new Producto
        (la_codigoPresupuestario,  la_codigoProducto,  la_nombreProducto,  la_unidad,  la_descripcion,  la_precioProducto, 
                   la_marcaProducto,  la_entrada,  la_ubicacion,  la_tipo,  la_fecha,  la_proveedor); 
        
          ProductoService lo_productodao = new ProductoService();
          int ln_var=lo_productodao.actualizar(lo_producto);
           if(ln_var>=1){
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
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ModificarProducto.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ModificarProducto.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(ModificarProducto.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(ModificarProducto.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ModificarProducto.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(ModificarProducto.class.getName()).log(Level.SEVERE, null, ex);
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
