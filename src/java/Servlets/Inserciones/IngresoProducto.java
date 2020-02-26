package Servlets.Inserciones;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Dao.ProductoDAO;
import Dao.UsuarioDAO;
import Entidades.Entrada_Productos;
import Entidades.Producto;
import Services.ProductoService;
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
import javax.servlet.http.HttpSession;

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
            HttpSession session= request.getSession(true);
            
             
            String la_codigoProducto=request.getParameter("Codigo_Producto");
            String la_codigoPresupuestario=request.getParameter("Presupuestario");
            String la_nombre=request.getParameter("nombre");
            String la_unidad=request.getParameter("Unidad");
            String la_descripcion=request.getParameter("Descripcion");
            String la_precio=request.getParameter("Precio");
            String la_cantidad=request.getParameter("Cantidad");
            String la_marca=request.getParameter("Marca");
            String ld_fechaEntrada=request.getParameter("Fecha");
            String la_ubicacion=request.getParameter("Ubicacion");
            String la_tipoProducto=request.getParameter("Tipo");
            String la_garantia=request.getParameter("Garantia");
            String la_proveedor=request.getParameter("Proveedor");
             String lc_Usuario2=request.getParameter("Responsable");
            
            Producto lo_producto = new Producto(la_codigoProducto,la_codigoPresupuestario,la_nombre,la_unidad,la_descripcion,la_precio
                    ,la_cantidad,la_marca,ld_fechaEntrada,la_ubicacion,la_tipoProducto,la_garantia,la_proveedor);
            
             ProductoService lo_productodao =new ProductoService();
             
             Entrada_Productos entrada= new Entrada_Productos(la_codigoPresupuestario,la_nombre,la_cantidad,ld_fechaEntrada,lc_Usuario2);
             
               ProductoService lo_productodao2 =new ProductoService();
             
            
             int ln_var=lo_productodao.insertar(lo_producto);
            
               lo_productodao2.insertar2(entrada);
               
                if(ln_var>=1){
                        String as="hola";
                     request.setAttribute("subscribed",as);
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
