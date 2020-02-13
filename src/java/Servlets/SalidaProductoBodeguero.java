package Servlets;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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
            throws ServletException, IOException, ClassNotFoundException, SQLException {
       Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                Connection lu_con= DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=inventario","test","root");
                PreparedStatement lu_ps= lu_con.prepareStatement("insert into Salida_Producto(Fecha_Salida,Departamento,Cantidad_Salida,Codigo_Producto,Responsable)values(?,?,?,?,?)");
               PrintWriter out = response.getWriter(); 
          
          PreparedStatement lu_ps1;
      PreparedStatement lu_ps2;
           ResultSet lu_rs1;
           ResultSet lu_rs2;
          lu_ps1=lu_con.prepareStatement("select * from Departamento");
         lu_rs1=lu_ps1.executeQuery();
           int ln_r1;
          
          
          
          
            String lc_sum=request.getParameter("sum");
            String lc_codigo=request.getParameter("codigo");
            String lc_res=request.getParameter("res");
            String lc_date=request.getParameter("date");
            String lc_dep=request.getParameter("dep");
            

            
             String lc_nuevo=request.getParameter("nuevo");
            
            
            
            
            int ln_r;
            try{
                
               
                
                lu_ps.setString(1,lc_date);
                lu_ps.setString(2,lc_dep);
                lu_ps.setString(3,lc_nuevo);
                lu_ps.setString(4,lc_codigo);
                lu_ps.setString(5,lc_res);
               ln_r=lu_ps.executeUpdate();
                if(ln_r>=1){
               response.sendRedirect("ListarProductosBodeguero.jsp");
                
                }else {
                out.println("<h1> Error</h1>");
                }
                
            }catch(Exception lu_e){
            out.println("Error"+lu_e.getMessage());
            }
            






             
            String lc_Codigo=request.getParameter("codigo");
            
            
           
            try{
                
                if(lc_nuevo!=null&&lc_Codigo!=null){
                
                 lu_ps1= lu_con.prepareStatement("update producto set " + 
                        
                        
                         "Cantidad="+lc_sum+
                         "where Codigo_Producto="+lc_Codigo+"");
                lu_ps1.executeUpdate();
                response.sendRedirect("ListarProductosBodeguero.jsp");
                
                
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
            Logger.getLogger(SalidaProductoBodeguero.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
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
