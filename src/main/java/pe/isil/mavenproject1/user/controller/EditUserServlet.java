/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package pe.isil.mavenproject1.user.controller;

import java.io.IOException;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import pe.isil.mavenproject1.user.dao.UserDao;
import pe.isil.mavenproject1.user.model.User;

/**
 *
 * @author edu
 */
@WebServlet(name = "EditUserServlet", urlPatterns = {"/EditUserServlet"})
public class EditUserServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         RequestDispatcher dispatcher = request.getRequestDispatcher("/edit.jsp");
        dispatcher.forward(request, response);
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        
        UserDao userDao = new UserDao();
        String mensaje="";
        
        String name = request.getParameter("name");
        String lastname = request.getParameter("lastname");
        String username = request.getParameter("username");
        String pass = request.getParameter("pass");
        String tipDoc = request.getParameter("tipDoc");
        String nroDoc = request.getParameter("nroDoc");
        String enable = request.getParameter("enable");
        String email = request.getParameter("email");
        
        User user = new User();   
        user.setName(name);
        user.setLastname(lastname);
        user.setUsername(username);
        user.setPass(pass);
        user.setTipDoc(tipDoc);
        user.setNroDoc(nroDoc);
        user.setEnable(Integer.parseInt(enable) );
        user.setEmail(email);
        
        try{
            mensaje = userDao.updateUser(user);
        }catch(Exception e){
            mensaje=e.toString();
            e.printStackTrace();
        }
        
  
        RequestDispatcher dispatcher = request.getRequestDispatcher("/success.jsp");
        request.setAttribute("message",mensaje );
        dispatcher.forward(request,response);
        
        
        
    }

   
}
