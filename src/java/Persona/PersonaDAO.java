/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persona;

import Utilidades.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author SONY
 */
public class PersonaDAO {

    Connection cnn = null;
    PreparedStatement pstmt = null;
    ResultSet rs = null;

    public PersonaDAO() {
        cnn = Conexion.getInstance();
    }

    public String registrarPersona(PersonaDTO newPersona) {
        String sal = "";
        try {

            int resultado = 0;
            pstmt = cnn.prepareStatement("INSERT INTO personas VALUES (?, ?, ?, ?, ?, ?, ?)");

            pstmt.setInt(1, newPersona.getIdPersona());
            pstmt.setInt(2, newPersona.getTpdoc());
            pstmt.setString(3, newPersona.getNom1());
            pstmt.setString(4, newPersona.getNom2());
            pstmt.setString(5, newPersona.getApe1());
            pstmt.setString(6, newPersona.getApe2());
            pstmt.setString(7, newPersona.getCorreo());

            resultado = pstmt.executeUpdate();

            if (resultado != 0) {
                sal = "La persona ha sido registrada exitosamente";
//                + resultado + "filas afectadas"
            } else {
                sal = "Ha ocurrido un problema al crear la persona. Contacte al administrador";
            }
        } catch (SQLException sqle) {
            sal = "Ocurrió la siguiente exception : " + sqle.getMessage();
        }

        return sal;

    }

    public ArrayList<PersonaDTO> listarPersonas() {
        ArrayList<PersonaDTO> pna = new ArrayList();
        try {

            pstmt = cnn.prepareStatement("SELECT IdPersona, TipoDoc, Nombre1, Nombre2, Apellido1, Apellido2, CorreoElectronico FROM personas;");
            rs = pstmt.executeQuery();

            if (rs != null) {

                while (rs.next()) {

                    PersonaDTO per = new PersonaDTO();
                    per.setIdPersona(rs.getInt("IdPersona"));
                    per.setTpdoc(rs.getInt("TipoDoc"));
                    per.setNom1(rs.getString("Nombre1"));
                    per.setNom2(rs.getString("Nombre2"));
                    per.setApe1(rs.getString("Apellido1"));
                    per.setApe2(rs.getString("Apellido2"));
                    per.setCorreo(rs.getString("CorreoElectronico"));

                    pna.add(per);
                }
            }

        } catch (SQLException sqlex) {
            System.out.println("Error de Consulta" + sqlex);
        }
        return pna;
    }

    public PersonaDTO listarById(int pk) {
        PersonaDTO user = new PersonaDTO();

        return user;
    }

    public String actualizarPersona(PersonaDTO person) {

        String sal = "";
        try {

            int resultado = 0;
            pstmt = cnn.prepareStatement("UPDATE personas SET TipoDoc=?, Nombre1=?, Nombre2=?, Apellido1=?,"
                    + "Apellido2=?, CorreoElectronico=? WHERE IdPersona=?");

            pstmt.setInt(1, person.getTpdoc());
            pstmt.setString(2, person.getNom1());
            pstmt.setString(3, person.getNom2());
            pstmt.setString(4, person.getApe1());
            pstmt.setString(5, person.getApe2());
            pstmt.setString(6, person.getCorreo());
            resultado = pstmt.executeUpdate();

            if (resultado != 0) {
                sal = "La persona ha sido modificado exitosamente. " + resultado + " fila(s) afectada(s)";
            } else {
                sal = "Ha ocurrido un problema al modificar la persona. Contacte al administrador";
            }
        } catch (SQLException sqle) {
            sal = "Ocurrió la siguiente exception : " + sqle.getMessage();
        }
        return sal;
    }

    public String eliminarPersona(int pk) {

        String sal = "";
        try {
            int resul = 0;
            pstmt = cnn.prepareStatement("DELETE FROM personas WHERE IdPersona =?");
            pstmt.setInt(1, pk);
            resul = pstmt.executeUpdate();
            if (resul != 0) {
                sal = "Proceso Exitoso" ;
//                + resul + "Registro(s) Eliminado(s)"
            } else {
                sal = "Registro(s) No Existe";
            }
        } catch (SQLException sqle) {
            System.out.println("Hay un error" + sqle.getMessage() + " " + sqle.getErrorCode());
        }
        return sal;
    }

}
