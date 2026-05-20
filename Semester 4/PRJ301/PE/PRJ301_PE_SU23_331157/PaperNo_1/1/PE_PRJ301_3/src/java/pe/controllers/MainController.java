/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.controllers;

import dao.DAO;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Fashion;

/**
 *
 * @author hd
 */
public class MainController extends HttpServlet {

    private static final String LOGIN_PAGE = "login.jsp";

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        DAO dao = new DAO();

        String url = LOGIN_PAGE;
        try {
            String action = request.getParameter("action");
            if (action == null) {
                url = LOGIN_PAGE;
            } else if (action.equalsIgnoreCase("login")) {
                String UserID = request.getParameter("UserID");
                String pass = request.getParameter("password");
                if (dao.checkUserValid(UserID, pass) != null) {
                    List<Fashion> lf = dao.getFashion();
                    request.setAttribute("lf", lf);
                    request.getRequestDispatcher("fashionList.jsp").forward(request, response);
                } else {
                    request.setAttribute("loginFail", "Username or password incorrect");
                    request.getRequestDispatcher("login.jsp").forward(request, response);
                }
            } else if (action.equalsIgnoreCase("update")) {
                String ID = request.getParameter("id");
                Fashion f = dao.getFashionById(ID);
                request.setAttribute("lf", f);
                request.getRequestDispatcher("update.jsp").forward(request, response);
            } else if (action.equalsIgnoreCase("delete")) {
                String ID = request.getParameter("id");
                dao.deleteFashion(ID);
                List<Fashion> lf = dao.getFashion();
                request.setAttribute("lf", lf);
                request.getRequestDispatcher("fashionList.jsp").forward(request, response);
            }

        } catch (Exception e) {
            log("Error at MainController: " + e.toString());
        } finally {
            request.getRequestDispatcher(url).forward(request, response);
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
