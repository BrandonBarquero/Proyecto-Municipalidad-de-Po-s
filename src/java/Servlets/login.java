package Servlets;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Dao.BitacoraDAO;
import Dao.LoginDAO;
import Dao.UsuarioDAO;
import Entidades.Bitacora;
import Entidades.Usuario;
import Services.Loginsv;
import Services.UsuarioService;
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
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
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
            throws ServletException, IOException, SQLException, ClassNotFoundException, Exception {
     // variables
     
      String la_cedula=request.getParameter("txtCedula2");
      String la_contrasenaTraidaDelInput=request.getParameter("txtContrasena2");
      Loginsv lo_objetoOperaciones= new Loginsv();
      UsuarioService lo_usuariodao = new UsuarioService();
      Usuario lo_usuario = new Usuario(la_cedula, la_contrasenaTraidaDelInput);
      HttpSession session=request.getSession();
      
      BitacoraDAO dao = new BitacoraDAO();
      
      
      
      
      Date date = new Date();
//Caso 3: obtenerhora y fecha y salida por pantalla con formato:
DateFormat hourdateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss ");
String fecha=hourdateFormat.format(date);

      
      
      String action="Inicio de Sesion";
     
      
      
      
      
      Bitacora bitacora = new Bitacora(fecha,lo_usuariodao.selecionarNombre(la_cedula),action,action);
      switch(lo_objetoOperaciones.validarLogin(lo_usuario)){
          
      case 1:{
          dao.insertar(bitacora);
      session.setAttribute("user",la_cedula);
      session.setAttribute("nivel","1");
      String Nombreusuario=lo_usuariodao.selecionarNombre(la_cedula);
      session.setAttribute("user5",Nombreusuario);
      response.sendRedirect("home.jsp");
      break;}
      
      case 2:{ 
           dao.insertar(bitacora);
      session.setAttribute("user2",la_cedula);
      session.setAttribute("nivel","2");
      String Nombreusuario=lo_usuariodao.selecionarNombre(la_cedula);
      session.setAttribute("user6",Nombreusuario);
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
        } catch (Exception ex) {
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
        } catch (Exception ex) {
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
