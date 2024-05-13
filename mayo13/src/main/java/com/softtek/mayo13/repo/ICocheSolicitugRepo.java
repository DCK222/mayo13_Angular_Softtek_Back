package com.softtek.mayo13.repo;

import com.softtek.mayo13.modelo.CocheSolicitud;

import java.sql.SQLException;

public interface ICocheSolicitugRepo {
    CocheSolicitud crearSolicituf(CocheSolicitud cocheSolicitud) throws SQLException, ClassNotFoundException;
}
