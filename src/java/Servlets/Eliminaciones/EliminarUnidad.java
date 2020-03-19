/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets.Eliminaciones;

import Dao.BitacoraDAO;
import Entidades.Bitacora;
import Services.UnidadService;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
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
 * @author srami
 */
@WebServlet(name = "EliminarUnidad", urlPatterns = {"/EliminarUnidad"})
public class EliminarUnidad extends HttpServlet {

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
        
        int ln_idUnidad=Integer.parseInt(request.getParameter("Id_Unidad"));
        UnidadService lo_unidaddao =new UnidadService();
            
        int ln_var=lo_unidaddao.eliminarUnidad(ln_idUnidad);
        
        String Nombre = request.getParameter("Nombre");
        
        
        
           HttpSession session=request.getSession();
              String la_Usuario2=(String) session.getAttribute("user5");
             
             
             
             
             
             
               BitacoraDAO dao = new BitacoraDAO();
      
      
      
      
      Date date = new Date();
//Caso 3: obtenerhora y fecha y salida por pantalla con formato:
DateFormat hourdateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss ");
String fecha=hourdateFormat.format(date);

      
      
      String action="EliminacionUnidad";
     
      
      
      
      
      Bitacora bitacora = new Bitacora(fecha,la_Usuario2,action,Nombre);
             
             
             dao.insertar(bitacora);
             
             
             
             
        
        
        
        
        
        if(ln_var>=1){
            response.sendRedirect("ListarUnidades.jsp");
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
            Logger.getLogger(EliminarUnidad.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(EliminarUnidad.class.getName()).log(Level.SEVERE, null, ex);
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
