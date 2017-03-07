/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador.servletUsuario;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.sql.Date;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Entidades.Usuario;
import model.dao.UsuarioDao;
import org.codehaus.jackson.map.DeserializationConfig;
import org.codehaus.jackson.map.ObjectMapper;
/**
 *
 * @author User
 */
//@WebServlet(name = "RegistroUsuario", urlPatterns = {"/RegistroUsuario"})
@WebServlet("/ServRegistroUsuario")
public class ServRegistroUsuario extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
        try  {
             
            ObjectMapper mapper = new ObjectMapper();
            BufferedReader br = new BufferedReader(new InputStreamReader(request.getInputStream()));
            String json = "";
            json = br.readLine();
            mapper.configure(DeserializationConfig.Feature.FAIL_ON_UNKNOWN_PROPERTIES, false);
            Usuario user = mapper.readValue(json, Usuario.class);
           
            
           // System.out.println(nombre_usu+id_usua);
            UsuarioDao objUsuario = new UsuarioDao();
           objUsuario.insertUser(user);
           String idUser=objUsuario.EncontrarElId(user.getEmail());
           response.setContentType("application/json");
           mapper.writeValue(response.getOutputStream(), idUser);
            
            
      	     
           
        } catch (SQLException ex) {
            Logger.getLogger(ServRegistroUsuario.class.getName()).log(Level.SEVERE, null, ex);
            
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
