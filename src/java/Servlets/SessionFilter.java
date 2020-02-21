/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
* Servlet Filter implementation class SessionFilter
*/
@WebFilter("/asistente/*")
public class SessionFilter implements Filter {
public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

HttpServletRequest peticion=(HttpServletRequest)request;
HttpSession session = peticion.getSession(false);

HttpServletResponse respuesta=(HttpServletResponse)response;

if(session != null) {
chain.doFilter(request, response);
} else {
respuesta.sendRedirect("../index.html");
}

}

@Override
public void destroy() {
// TODO Auto-generated method stub

}

@Override
public void init(FilterConfig arg0) throws ServletException {
// TODO Auto-generated method stub

}



}