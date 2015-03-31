/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Persona.PersonaDAO;
import Persona.PersonaDTO;
import Usuarios.UsuarioDAO;
import Usuarios.UsuarioDTO;
import Utilidades.myException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Mr.Canchila
 */
public class Sigemed extends HttpServlet {

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
            throws IOException, myException {
        response.setContentType("text/html;charset=UTF-8");
         request.setCharacterEncoding("UTF-8");
        PrintWriter out = response.getWriter();
        
        try {
            if (request.getParameter("btnIniciarsesion") != null && request.getParameter("rSesion") != null) {

                String username = request.getParameter("txtUsuario").trim();
                String userpass = request.getParameter("txtPassword").trim();

                UsuarioDAO udao = new UsuarioDAO();
                UsuarioDTO udto = new UsuarioDTO();

                udto = udao.validarUsuario(username, userpass);

                if (udto.getUsuario() != "") {
                    HttpSession miSesion = request.getSession(true);
                    miSesion.setAttribute("usuario", udto);
                    
                        response.sendRedirect("Pages/Spanish/Bandeja/bandeja.jsp");
                } else {
                    String mensaje = "Usuario No existe!!";
                    response.sendRedirect("iniciarsesion.jsp?sal=" + mensaje);
                }

            } else if (request.getParameter("RegistrarP") != null && request.getParameter("oRegper") != null) {
                Persona.PersonaDTO pdto = new PersonaDTO();

                pdto.setIdPersona(Integer.parseInt(request.getParameter("txtCedula")));
                pdto.setTpdoc(Integer.parseInt(request.getParameter("txtDocumento")));
                pdto.setNom1(request.getParameter("txtNombre1"));
                pdto.setNom2(request.getParameter("txtNombre2"));
                pdto.setApe1(request.getParameter("txtApellido1"));
                pdto.setApe2(request.getParameter("txtApellido2"));
                pdto.setCorreo(request.getParameter("txtCorreo"));

                PersonaDAO pdao = new PersonaDAO();
                String mensaje = pdao.registrarPersona(pdto);
                response.sendRedirect("index.jsp?sal=" + mensaje);

            } else {
                /* TODO output your page here. You may use following sample code. */
                out.println("<!DOCTYPE html>");
                out.println("<html>");
                out.println("<head>");
                out.println("<title>Servlet Sigemed</title>");
                out.println("</head>");
                out.println("<body>");
                out.println("<h1>Servlet Sigemed at " + request.getContextPath() + "</h1>");
                out.println("</body>");
                out.println("</html>");
            }
        } finally {
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

        } catch (myException ex) {
            Logger.getLogger(Sigemed.class
                    .getName()).log(Level.SEVERE, null, ex);
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

        } catch (myException ex) {
            Logger.getLogger(Sigemed.class
                    .getName()).log(Level.SEVERE, null, ex);
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
