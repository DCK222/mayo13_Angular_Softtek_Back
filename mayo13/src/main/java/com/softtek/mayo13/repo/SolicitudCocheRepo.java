package com.softtek.mayo13.repo;

import com.softtek.mayo13.modelo.CocheSolicitud;
import org.springframework.stereotype.Repository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
@Repository
public class SolicitudCocheRepo extends Conexion implements ICocheSolicitugRepo{
    private Conexion conexion;

    public SolicitudCocheRepo() {
        this.conexion = new Conexion();
    }

    @Override
    public CocheSolicitud crearSolicituf(CocheSolicitud cocheSolicitud) throws SQLException, ClassNotFoundException {
        conexion.abrirConexion();
        PreparedStatement consulta = conexion.miConexion.prepareStatement(
                "INSERT INTO cocheSolicitud (nombre, marca, modelo) VALUES (?, ?, ?) RETURNING id_solicitud;");
        consulta.setString(1, cocheSolicitud.getNombre());
        consulta.setString(2, cocheSolicitud.getMarca());
        consulta.setString(3, cocheSolicitud.getModelo());
        ResultSet cons = consulta.executeQuery();

        if (cons.next()) {
            cocheSolicitud.setIdSolicitud(cons.getInt("id_solicitud"));
        }

        cons.close();
        consulta.close();
        conexion.cerrarConexion();

        return cocheSolicitud;
    }
}
