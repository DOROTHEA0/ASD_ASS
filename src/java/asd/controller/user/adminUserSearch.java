/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asd.controller.user;

import asd.model.dao.UserDao;
import asd.model.entity.User;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author komei
 */
@WebServlet("/manager/adminUserSearch")
public class adminUserSearch extends HttpServlet {
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
        String Keywords = request.getParameter("keywords");
        
        ArrayList<User> users = new ArrayList<User>();
        
        if(Keywords != null){
            users.add(UserDao.findUserbyEmail(Keywords));
            
        }else{
            users = UserDao.findAllUsers();
        }
        
        request.setAttribute("users", users);
        request.getRequestDispatcher("/manager/admin_user.jsp").forward(request, response);
    }
}
