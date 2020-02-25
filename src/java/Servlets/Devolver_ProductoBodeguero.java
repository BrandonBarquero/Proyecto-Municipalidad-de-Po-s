package Servlets;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Dao.DevolucionesDAO;
import Dao.ProductoDAO;
import Entidades.Devoluciones;
import Services.DevolucionesService;
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
 * @author barqu
 */
@WebServlet(urlPatterns = {"/EntradaProductoBodeguero"})
public class Devolver_ProductoBodeguero extends HttpServlet {

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
         
        
            String ln_codigoProducto=request.getParameter("codigo");
            String la_motivo=request.getParameter("motivo");
            String ld_fecha=request.getParameter("date");
            String la_departamento=request.getParameter("departamento");
            String la_responsable=request.getParameter("responsable");
            String ln_cantidadIngreso=request.getParameter("cantidadIngreso");
            int ln_cantidad = Integer.parseInt(ln_cantidadIngreso);
            
            Devoluciones lo_devolucion= new Devoluciones(ld_fecha,la_motivo,ln_cantidad,la_responsable,ln_codigoProducto,la_departamento);
           
            DevolucionesService lo_devolucionesdao=new DevolucionesService();
            int ln_numero=lo_devolucionesdao.insertar(lo_devolucion);
          

            String la_suma=request.getParameter("cantidadFinal");
            String lc_codigo=request.getParameter("codigo");
            
            
           
                
            if(la_suma!=null&&lc_codigo!=null){

            ProductoDAO lo_productodao =new ProductoDAO();
            
            lo_productodao.Actualizar_Cantidad(la_suma,lc_codigo);
                
                }

                if(ln_numero>=1){
                response.sendRedirect("ListarProductosBodeguero.jsp");
                
                }else {
                out.println("<h1> Error</h1>");
                            response.sendRedirect("PaginaErrorBodeguero.jsp");
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
            Logger.getLogger(Devolver_ProductoBodeguero.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Devolver_ProductoBodeguero.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(Devolver_ProductoBodeguero.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(Devolver_ProductoBodeguero.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Devolver_ProductoBodeguero.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(Devolver_ProductoBodeguero.class.getName()).log(Level.SEVERE, null, ex);
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
