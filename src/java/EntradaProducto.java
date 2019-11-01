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
@WebServlet(urlPatterns = {"/EntradaProducto"})
public class EntradaProducto extends HttpServlet {

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
                PreparedStatement lu_ps= lu_con.prepareStatement("insert into Devoluciones(Fecha_Devolucion,Motivo,Cantidad,Responsable,Codigo_Producto,Departamento)values(?,?,?,?,?,?)");
                
          
          PreparedStatement lu_ps1;
      PreparedStatement lu_ps2;
           ResultSet lu_rs1;
           ResultSet lu_rs2;
          lu_ps1=lu_con.prepareStatement("select * from Departamento");
         lu_rs1=lu_ps1.executeQuery();
           int ln_r1;
          
          
          
          
            String codigo=request.getParameter("codigo");
            String mot=request.getParameter("mot");
            String date=request.getParameter("date");
            String dep=request.getParameter("dep");
            String res=request.getParameter("res");
            
            String cantidad1=request.getParameter("cantidad1");

            
            
            
            
            
            
            int ln_r;
            try{
                
               
                
                lu_ps.setString(1,date);
                lu_ps.setString(2,mot);
                lu_ps.setString(3,cantidad1);
                lu_ps.setString(4,res);
                lu_ps.setString(5,codigo);
                 lu_ps.setString(6,dep);
               ln_r=lu_ps.executeUpdate();
                if(ln_r>=1){
               response.sendRedirect("ListarProductos.jsp");
                
                }else {
                out.println("<h1> Error</h1>");
                }
                
            }catch(Exception lu_e){
            out.println("Error"+lu_e.getMessage());
            }
            






              String lc_sum=request.getParameter("cantidad2");
            String lc_Codigo=request.getParameter("codigo");
            
            
           
            try{
                
                if(lc_sum!=null&&lc_Codigo!=null){
                
                 lu_ps1= lu_con.prepareStatement("update producto set " + 
                        
                        
                         "Cantidad="+lc_sum+
                         "where Codigo_Producto="+lc_Codigo+"");
                lu_ps1.executeUpdate();
                response.sendRedirect("ListarProductos.jsp");
                
                
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
            Logger.getLogger(EntradaProducto.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(EntradaProducto.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(EntradaProducto.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(EntradaProducto.class.getName()).log(Level.SEVERE, null, ex);
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
