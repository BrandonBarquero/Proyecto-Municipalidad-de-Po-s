/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
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
@WebServlet(urlPatterns = {"/IngresoUsuario"})
public class IngresoUsuario extends HttpServlet {

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
      
            String lc_cedulaTraidadelInput=request.getParameter("Cedula");
            String lc_nombreTraidadelInput=request.getParameter("Nombre");
            String lc_contrasenaTraidadelInput=request.getParameter("Contrasena");
            String lc_CorreoTraidadelInput=request.getParameter("correo");
            String lc_RolTraidadelInput=request.getParameter("Rol");
            String lc_TelefonoTraidadelInput=request.getParameter("Telefono");
            
            int ln_r;
            try{
                
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                Connection lu_con= DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=inventario","test","root");
                PreparedStatement lu_ps= lu_con.prepareStatement("insert into Usuario(Cedula,Nombre,Correo,Telefono,Rol,Contrasena)values(?,?,?,?,?,?)");
                
                
                lu_ps.setString(1,lc_cedulaTraidadelInput);
                lu_ps.setString(2,lc_nombreTraidadelInput);
                lu_ps.setString(3,lc_CorreoTraidadelInput);
                lu_ps.setString(4,lc_TelefonoTraidadelInput);
                lu_ps.setString(5,lc_RolTraidadelInput);
                lu_ps.setString(6,lc_contrasenaTraidadelInput);
                ln_r=lu_ps.executeUpdate();
                if(ln_r>=1){
                response.sendRedirect("ListarUsuarios.jsp");
                
                }else {
                out.println("<h1> Error</h1>");
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
