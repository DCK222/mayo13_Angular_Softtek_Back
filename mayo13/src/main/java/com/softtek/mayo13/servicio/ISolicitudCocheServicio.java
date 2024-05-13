package com.softtek.mayo13.servicio;

import com.softtek.mayo13.modelo.CocheSolicitud;

import java.sql.SQLException;

public interface ISolicitudCocheServicio {
   CocheSolicitud crearSolicituf(CocheSolicitud cocheSolicitud) throws SQLException, ClassNotFoundException;
}
