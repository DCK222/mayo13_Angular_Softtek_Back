package com.softtek.mayo13.repo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    protected Connection miConexion;

    public void abrirConexion() throws ClassNotFoundException, SQLException {
        Class.forName("org.postgresql.Driver");
        miConexion = DriverManager.getConnection(
                "jdbc:postgresql://127.0.0.1:5432/mayo13",
                "postgres", "Gabriela2050$");
        System.out.println("Conectado con Exito");
    }

    public void cerrarConexion() throws SQLException {
        if (miConexion != null) {
            miConexion.close();
        }
    }
}
