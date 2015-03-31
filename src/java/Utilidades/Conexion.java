/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilidades;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author SONY
 */
public class Conexion {

    protected static Connection cnn = null;

    public Conexion() {
    }

    private static Conexion instancia;

    public static java.sql.Connection getInstance() {

        if (cnn == null) {
            conectar();
        }
        return cnn;
    }

    public static void conectar() {
        try {
            Class.forName("com.mysql.jdbc.Driver");//url
            cnn = DriverManager.getConnection("jdbc:mysql://localhost:3306/basedatossigemed", "root", "1234");//Conexion de la BD
        } catch (SQLException sqlex) {
            System.out.println("Error al Conectar Base de Datos" + sqlex);
        } catch (Exception ex) {
            System.out.println("Error" + ex.getMessage());

        }

    }

    public synchronized static Conexion getInstace() throws Exception {
        if (instancia == null) {
            instancia = new Conexion();
        }
        return instancia;
    }

}
