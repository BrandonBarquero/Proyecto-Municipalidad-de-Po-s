/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
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
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();
            String lc_Codigo_Presupuestario=request.getParameter("Presupuestario");
            String lc_Nombre=request.getParameter("nombre");
            String lc_Unidad=request.getParameter("Unidad");
            String lc_Descripcion=request.getParameter("Descripcion");
            String lc_Precio=request.getParameter("Precio");
            String lc_cantidad=request.getParameter("Cantidad");
            String lc_marca=request.getParameter("Marca");
            String lc_Fecha_Entrada=request.getParameter("Fecha");
            String lc_Ubicacion=request.getParameter("Ubicacion");
            String lc_Tipo=request.getParameter("Tipo");
            String lc_Tipo2=request.getParameter("Proveedor");
            String lc_Tipo3=request.getParameter("Garantia");
            
            int ln_r;
            try{
                
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                Connection lu_con= DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=inventario","test","root");
                PreparedStatement lu_ps= lu_con.prepareStatement("insert into producto(Codigo_Presupuestario,Nombre,Unidad,Descripcion,Precio,cantidad,marca,Fecha_Entrada,Ubicacion,Estado,Tipo_Producto,Proveedor,Garantia)values(?,?,?,?,?,?,?,?,?,?,?,?,?)");
                
                
                
                lu_ps.setString(1,lc_Codigo_Presupuestario);
                lu_ps.setString(2,lc_Nombre);
                lu_ps.setString(3,lc_Unidad);
                lu_ps.setString(4,lc_Descripcion);
                lu_ps.setString(5,lc_Precio);
                lu_ps.setString(6,lc_cantidad);             
                lu_ps.setString(7,lc_marca);
                lu_ps.setString(8,lc_Fecha_Entrada);
                lu_ps.setString(9,lc_Ubicacion);
                  lu_ps.setString(10,"Activo");
                  lu_ps.setString(11,lc_Tipo);
                   lu_ps.setString(12,lc_Tipo2);
                    lu_ps.setString(13,lc_Tipo3);
                ln_r=lu_ps.executeUpdate();
                if(ln_r>=1){
               response.sendRedirect("ListarProductos.jsp");
                
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
