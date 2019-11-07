/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.Pais;
import modelo.Traduccion;

/**
 *
 * @author Sebastian :3
 */
@WebServlet(urlPatterns = {"/NewServlet"})
public class NewServlet extends HttpServlet {
    
    Pais pais = new Pais();
    Traduccion t = new Traduccion();

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
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet NewServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet NewServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
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
            response.setContentType("text/html");
            PrintWriter out = response.getWriter();
            out.println("<html>");
            out.println("<body>");
            out.println("<h1> Nombre del pais</h1>");
           
            String rta = request.getParameter("respuesta2");
        switch (request.getParameter("respuesta")) {
            case "argelia":
                out.println("Nombre del Pais:  "+pais.buscarNombre("argelia"));
                out.println("Nombre de la Moneda:  "+pais.buscarMoneda("argelia"));
                out.println("Gentilicio:  "+pais.buscarGentilico("argelia"));
                out.println("Nombre de la Capital:  "+pais.buscarCapital("argelia"));
                out.println("conversion: "+t.convertidor(0.036, 10000) );
                out.println("traduccion: "+t.traductor("arabe","computador") );
                break;
            case "marruecos":
                out.println("Nombre del Pais:  "+pais.buscarNombre("marruecos"));
                out.println("Nombre de la Moneda:  "+pais.buscarMoneda("marruecos"));
                out.println("Gentilicio:  "+pais.buscarGentilico("marruecos"));
                out.println("Nombre de la Capital:  "+pais.buscarCapital("marruecos"));
                out.println("conversion: "+t.convertidor(0.0029, 10000) );
                out.println("traduccion: "+t.traductor("arabe","computador") );
                break;
            case "camerun":
                out.println("Nombre del Pais:  "+pais.buscarNombre("camerun"));
                out.println("Nombre de la Moneda:  "+pais.buscarMoneda("camerun"));
                out.println("Gentilicio:  "+pais.buscarGentilico("camerun"));
                out.println("Nombre de la Capital:  "+pais.buscarCapital("camerun"));
                out.println("conversion: "+t.convertidor(0.17877, 10000) );
                out.println("traduccion: "+t.traductor("frances","hola") );
                break;
            case "benin":
                out.println("Nombre del Pais:  "+pais.buscarNombre("benin"));
                out.println("Nombre de la Moneda:  "+pais.buscarMoneda("benin"));
                out.println("Gentilicio:  "+pais.buscarGentilico("benin"));
                out.println("Nombre de la Capital:  "+pais.buscarCapital("benin"));
                 out.println("conversion: "+t.convertidor(0.17877, 10000) );
                out.println("traduccion: "+t.traductor("frances","hola") );
                break;
            case "egipto":
                out.println("Nombre del Pais:  "+pais.buscarNombre("egipto"));
                out.println("Nombre de la Moneda:  "+pais.buscarMoneda("egipto"));
                out.println("Gentilicio:  "+pais.buscarGentilico("egipto"));
                out.println("Nombre de la Capital:  "+pais.buscarCapital("egipto"));
               out.println("conversion: "+t.convertidor(0.0048600, 10000) );
               out.println("traduccion: "+t.traductor("arabe","hola") );
                break;
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
