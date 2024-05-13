package com.softtek.mayo13.servicio;

import com.softtek.mayo13.modelo.CocheSolicitud;
import com.softtek.mayo13.repo.ICocheSolicitugRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
@Service
public class SolicitudCocheServicio implements ISolicitudCocheServicio {
@Autowired
private  ICocheSolicitugRepo repo;
    @Override
    public CocheSolicitud crearSolicituf(CocheSolicitud cocheSolicitud) throws SQLException, ClassNotFoundException {
        return repo.crearSolicituf(cocheSolicitud);
    }
}
