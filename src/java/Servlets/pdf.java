/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import Dao.SalidaProductoDAO;
import Entidades.Departamento;
import Services.DepartamentoService;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
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
@WebServlet(name = "pdf", urlPatterns = {"/pdf"})
public class pdf extends HttpServlet {

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
        response.setContentType("application/pdf");
        
        
 DepartamentoService lo_departamentoService = new DepartamentoService();
 ArrayList<Departamento> lo_departamento = lo_departamentoService.listaDepartamentos();
 
 String Inicio=request.getParameter("Inicio");
 String Final=request.getParameter("Final");
 
 SalidaProductoDAO lo_productoService = new SalidaProductoDAO();
  ArrayList<Entidades.SalidaProducto> lo_producto = null;
  int saldo=0;
  
        
        OutputStream out = response.getOutputStream();
        try{
        try{
            Document documento = new Document();
            PdfWriter.getInstance(documento, out);
            
            documento.open();
            //titulo
   
            
            
           Image imagenes = Image.getInstance("http://poasdigital.go.cr/images/logo2.png");
           imagenes.scaleAbsolute(300f, 100f);
           imagenes.setAlignment(Element.HEADER);
           documento.add(imagenes);
           
           
                    Paragraph par1 = new Paragraph();
            Font fonttitulo = new Font(Font.FontFamily.TIMES_ROMAN,16,Font.BOLD,BaseColor.BLACK);
            par1.add(new Phrase("Reporte de Gastos por departamento",fonttitulo));
            par1.setAlignment(Element.ALIGN_CENTER);//alinear al centro
            par1.add(new Phrase (Chunk.NEWLINE));//salto de linea
            par1.add(new Phrase (Chunk.NEWLINE));
            documento.add(par1);
            

            
       SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
String fechaComoCadena = sdf.format(new Date());
   
         
            
                            Paragraph par2 = new Paragraph();
            Font xyz = new Font(Font.FontFamily.TIMES_ROMAN,12,Font.BOLD,BaseColor.BLACK);
             par2.add(new Phrase("Fecha de consulta: ",xyz));
             par2.add(new Phrase(fechaComoCadena,xyz));
            par2.add(new Phrase (Chunk.NEWLINE));
            par2.setAlignment(Element.ALIGN_RIGHT);//alinear al centro
            par2.add(new Phrase (Chunk.NEWLINE));//salto de linea
            par2.add(new Phrase (Chunk.NEWLINE));
            documento.add(par2);
            
             PdfPTable tabla = new PdfPTable(2);
            
             PdfPCell celda1= new PdfPCell(new Paragraph("Departamento",FontFactory.getFont("Arial", 12, Font.BOLD, BaseColor.BLACK)));
            PdfPCell celda2= new PdfPCell(new Paragraph("Gasto total en colones",FontFactory.getFont("Arial", 12, Font.BOLD, BaseColor.BLACK)));
            tabla.addCell(celda1);
            tabla.addCell(celda2);
            
            
            
            Paragraph paragraph_2 = new Paragraph();
 paragraph_2.setFont(new Font(FontFactory.getFont("Courier", 12, Font.BOLD, BaseColor.ORANGE)));
 paragraph_2.add("Ultima linea del documento");
 paragraph_2.setAlignment(Paragraph.ALIGN_LEFT);
            
            
//documento.add(paragraph_2);
            
            
               for(int x=0; x<lo_departamento.size();x++){
             
lo_producto=lo_productoService.listaSalidaProductosFiltrado(lo_departamento.get(x).getNombreD(),Inicio,Final);
 
 for(int t=0; t<lo_producto.size();t++){
 saldo+= lo_producto.get(t).getCantidadSalida()*Integer.valueOf(lo_producto.get(t).getPa_Precio());

 }
       tabla.addCell(lo_departamento.get(x).getNombreD());
  tabla.addCell(Integer.toString(saldo));                 
                                        
 saldo=0;
 }
            
           
           
 
           
            
            documento.add(tabla);
            
            documento.close();
        }catch(Exception ex){
        ex.getMessage();}
        
        } finally{
        out.close();
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
            Logger.getLogger(pdf.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(pdf.class.getName()).log(Level.SEVERE, null, ex);
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
