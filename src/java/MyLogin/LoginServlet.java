/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyLogin;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 684243
 */
@WebServlet(name = "LoginServlet", urlPatterns = {"/LoginServlet"})
public class LoginServlet extends HttpServlet {


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
           String logout = request.getParameter("action");
        if(logout == null){
            System.out.println(logout);
            getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
        }else {
                        request.setAttribute("a", "You have logged out.");
                        request.setAttribute("login", "");
                        request.getSession().setAttribute("login", null);
            getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);

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
        
        String login = request.getParameter("login");
        String password = request.getParameter("password");
        String rememberMe = request.getParameter("remember"); 
        
      
                    
        request.getSession().setAttribute("login", login);      
         
            
        if(UserService.validate(login, password) == true){
            
            request.setAttribute("login", login);
          
            response.sendRedirect("Home");
            }else {
            
             request.setAttribute("login", login);
             request.setAttribute("password", password);
             if(login.compareTo("") == 0 || password.compareTo("") ==0){
                 request.setAttribute("a", "Please fill in both fields!");
             }else{
             request.setAttribute("a", "Wrong password or username please try again");
             }
             
             getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request,response);

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
