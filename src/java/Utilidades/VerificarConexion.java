/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilidades;

//import Autorizaciones.AutorizacionDAO;
//import Autorizaciones.AutorizacionDTO;
import Persona.PersonaDAO;
import Persona.PersonaDTO;
import Usuarios.UsuarioDAO;
import Usuarios.UsuarioDTO;
//import Usuarios.UsuarioDAO;
//import Usuarios.UsuarioDTO;
//import Usuarios.UsuarioDAO;
//import Usuarios.UsuarioDTO;
//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.util.ArrayList;

/**
 *
 * @author SONY
 */
public class VerificarConexion {
    
    public static void main(String[] arg) {

//        UsuarioDTO userDTO = new UsuarioDTO();
//        UsuarioDAO userDAO = new UsuarioDAO();
////        
////        userDTO.setIdusuario(3);
////        userDTO.setIdpersona(101923444);
//        userDTO.setUsuario("ambalanta");
//        userDTO.setClave("ambalanta2014");
////        
//        System.out.println(userDAO.registrarUsuario(userDTO));
        
        PersonaDTO perDTO = new PersonaDTO();
        PersonaDAO perDAO = new PersonaDAO();
        UsuarioDTO usDTO = new UsuarioDTO();
        UsuarioDAO usDAO = new UsuarioDAO();
        
        
        perDTO.setNom1("Miguel");
        perDTO.setNom2("");
        perDTO.setApe1("Hernández");
        perDTO.setApe2("");
        perDTO.setTpdoc(1);
        perDTO.setIdPersona(1023896797);
        perDTO.setCorreo("mhernandez@mdiee.edu.co");

        System.out.println(perDAO.registrarPersona(perDTO));
        
        
//        UsuarioDTO userDTO = new UsuarioDTO();
//        UsuarioDAO userDAO = new UsuarioDAO();
//        
//        userDTO.setIdusuario(3);
//        userDTO.setIdpersona(101923444);
//        userDTO.setUsuario("ambalanta");
//        userDTO.setClave("ambalanta2014");
//        
//        System.out.println(userDAO.registrarUsuario(userDTO));
        
        
        
//        AutorizacionDTO autozDTO = new AutorizacionDTO();
//        AutorizacionDAO autozDAO = new AutorizacionDAO();
//        
//        autozDTO.setIdautoriz(20150022);
//        autozDTO.setIdpaciente(23);
//       
        
        
        
        
    }
    
}
