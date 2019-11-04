/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
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
@WebServlet(urlPatterns = {"/ModificarTipoProducto"})
public class ModificarTipoProducto extends HttpServlet {

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
            throws ServletException, IOException, ClassNotFoundException, SQLException {
     String lc_id=request.getParameter("id");
            String lc_nombre=request.getParameter("nombre");
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
         Connection lu_con= DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=inventario","test","root");
         PreparedStatement lu_ps;
         ResultSet lu_rs;
       
         lu_ps=lu_con.prepareStatement("select * from Tipo_Producto where Id_Tipo_Producto="+lc_id);
         lu_rs=lu_ps.executeQuery();
            
            int r;
            try{
                
                if(lc_nombre!=null&&lc_id!=null){
                
                 lu_ps= lu_con.prepareStatement("update Tipo_Producto set "
                         + "Nombre_Tipo_Producto='"+lc_nombre
                      
                         
                                 + " where Id_Tipo_Producto="+lc_id+"");
                lu_ps.executeUpdate();
                response.sendRedirect("ListarTipoProducto.jsp");
                
                
                }
                
            }catch(Exception lu_e){
            out.println("Error"+lu_e.getMessage());
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
            Logger.getLogger(ModificarTipoProducto.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ModificarTipoProducto.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(ModificarTipoProducto.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ModificarTipoProducto.class.getName()).log(Level.SEVERE, null, ex);
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
