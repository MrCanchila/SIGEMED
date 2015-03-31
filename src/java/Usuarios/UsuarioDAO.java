/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Usuarios;

import Utilidades.Conexion;
import Utilidades.myException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author SIGEMED
 */
public class UsuarioDAO {

    Connection cnn = null;
    PreparedStatement pstmt = null;
    ResultSet rs = null;

    public UsuarioDAO() {
        cnn = Conexion.getInstance();
    }

    public UsuarioDTO validarUsuario(String user, String pass) throws myException {

        UsuarioDTO udto = new UsuarioDTO();

        try {

            pstmt = cnn.prepareStatement("SELECT usuarios.usuario, usuarios.pass, usuarios.estado, roles.IdRol, roles.NombreRol"
                    + " FROM usuarios"
                    + " inner join personas on personas.IdPersona=usuarios.IdPersona"
                    + " inner join rolesusuarios on usuarios.IdUsuarios=rolesusuarios.IdRUUsuarios"
                    + " inner join roles on rolesusuarios.IdRURoles=roles.IdRol WHERE usuario=? AND pass=?");
            pstmt.setString(1, user);
            pstmt.setString(2, pass);

            rs = pstmt.executeQuery();

            if (rs != null) {
                while (rs.next()) {

                    udto.setUsuario(rs.getString("Usuario"));
                    udto.setClave(rs.getString("Pass"));

                }
            } else {
                udto.setUsuario("");
                throw new myException("usuario no encontrado");
            }
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return udto;
    }

    public ArrayList<UsuarioDTO> listarUsuarios() {
        ArrayList<UsuarioDTO> user = new ArrayList();
        try {

            pstmt = cnn.prepareStatement("SELECT IdUsuarios, usuario, personas.Nombre1,"
                    + "personas.Apellido1, contraseña, correo, IdRol, NombreRol"
                    + " FROM usuarios"
                    + " inner join personas on personas.IdPersona=usuarios.IdPersona"
                    + " inner join rolesusuarios on usuarios.IdUsuario=rolesusuarios.IdRUUsuarios"
                    + " inner join roles on rolesusuarios.IdRURoles=roles.IdRol;");
            rs = pstmt.executeQuery();

            if (rs != null) {

                while (rs.next()) {

                    UsuarioDTO misUser = new UsuarioDTO();
                    misUser.setIdusuario(rs.getInt("idusuario"));
                    misUser.setUsuario(rs.getString("usuario"));
                    misUser.setClave(rs.getString("contraseña"));

                    user.add(misUser);
                }
            }

        } catch (SQLException sqlex) {
            System.out.println("Error de Consulta" + sqlex);
        }
        return user;
    }

    public UsuarioDTO listarById(int pk) {
        UsuarioDTO user = new UsuarioDTO();

        return user;
    }

    public String actualizarUsuario(UsuarioDTO user) {

        String sal = "";
        try {

            int resultado = 0;
            pstmt = cnn.prepareStatement("UPDATE usuarios SET IdPersona=?, Usuario=?, Contraseña=?  WHERE IdUsuarios=?");

            pstmt.setInt(1, user.getIdusuario());
            pstmt.setInt(2, user.getIdpersona());
            pstmt.setString(3, user.getUsuario());
            pstmt.setString(4, user.getClave());

            resultado = pstmt.executeUpdate();

            if (resultado != 0) {
                sal = "El usuario ha sido modificado exitosamente. " + resultado + " fila(s) afectada(s)";
            } else {
                sal = "Ha ocurrido un problema al modificar la persona. Contacte al administrador";
            }
        } catch (SQLException sqle) {
            sal = "Ocurrió la siguiente exception : " + sqle.getMessage();
        }
        return sal;
    }

    public String eliminarUsuario(int pk) {

        String sal = "";
        try {
            int resul = 0;
            pstmt = cnn.prepareStatement("DELETE FROM usuarios WHERE IdUsuarios =?");
            pstmt.setInt(1, pk);
            resul = pstmt.executeUpdate();
            if (resul != 0) {
                sal = "Proceso Exitoso" + resul + "Registro(s) Eliminado(s)";
            } else {
                sal = "Registro(s) No Existe";
            }
        } catch (SQLException sqle) {
            System.out.println("Hay un error" + sqle.getMessage() + " " + sqle.getErrorCode());
        }
        return sal;
    }

    public String registrarUsuario(UsuarioDTO newUsuario) {
        String sal = "";
        try {

            int resultado = 0;
            pstmt = cnn.prepareStatement("INSERT INTO usuarios VALUES (?, ?, ?, ?)");

            pstmt.setInt(1, newUsuario.getIdusuario());
            pstmt.setInt(2, newUsuario.getIdpersona());
            pstmt.setString(3, newUsuario.getUsuario());
            pstmt.setString(4, newUsuario.getClave());

            resultado = pstmt.executeUpdate();

            if (resultado != 0) {
                sal = "El usuario ha sido registrado exitosamente. " + resultado + "filas afectadas";
            } else {
                sal = "Ha ocurrido un problema al crear el usuario. Contacte al administrador";
            }
        } catch (SQLException sqle) {
            sal = "Ocurrió la siguiente exception : " + sqle.getMessage();
        }

        return sal;

    }

}
