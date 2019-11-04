/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Dao.Operaciones;
import Entidades.Usuario;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import java.sql.SQLException;
import java.util.Calendar;
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
@WebServlet(urlPatterns = {"/login"})
public class login extends HttpServlet {

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
            throws ServletException, IOException, SQLException, ClassNotFoundException {
     
      String lc_nombretraidodelinput=request.getParameter("txtCedula2");
      String lc_contrasenatraidadelinput=request.getParameter("txtContrasena2");
        response.setContentType("text/html;charset=UTF-8");
     
      Operaciones go_objetooperaciones= new Operaciones();
       
      Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
         Connection lu_con= DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=inventario","test","root");
        
         PreparedStatement lu_ps2;
        PreparedStatement lu_ps = null;
        
         ResultSet lu_rs;
         ResultSet lu_rs2;
       
         String lc_x= null;
          String lc_x2= null;

      Usuario usuario = new Usuario(lc_nombretraidodelinput, lc_contrasenatraidadelinput);
       HttpSession sesion=request.getSession();
      switch(go_objetooperaciones.loguear(usuario)){
      case 1:{
      sesion.setAttribute("user",lc_nombretraidodelinput);
      sesion.setAttribute("nivel","1");
      
   
     
         
          lu_ps2=lu_con.prepareStatement("select Nombre from Usuario where Cedula='"+lc_nombretraidodelinput+"'");
         lu_rs2=lu_ps2.executeQuery();
          while(lu_rs2.next()){ 
           lc_x=  lu_rs2.getString("Nombre");
          }
      
      
     
               
          
             
          
          
          
          
              sesion.setAttribute("user5",lc_x);
      
      
      
      
      
      
      
      
      response.sendRedirect("home.jsp");
      break;}
      case 2:{
          
          
          
      sesion.setAttribute("user2",lc_nombretraidodelinput);
      sesion.setAttribute("nivel","2");
      
        lu_ps2=lu_con.prepareStatement("select Nombre from Usuario where Cedula='"+lc_nombretraidodelinput+"'");
         lu_rs2=lu_ps2.executeQuery();
          while(lu_rs2.next()){ 
           lc_x2=  lu_rs2.getString("Nombre");
          }
      
      
     
               
          
             
          
          
          
          
              sesion.setAttribute("user6",lc_x2);
      
      
      
      
      response.sendRedirect("homeBodeguero.jsp");
      break;}
      default:{
   
      
       response.sendRedirect("Error");
             
       

       
      break;
      }
      }
      
      if(request.getParameter("cerrar")!=null){
     
      
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
        } catch (SQLException ex) {
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
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
        } catch (SQLException ex) {
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
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
