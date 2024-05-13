package com.softtek.mayo13.Controlador;

import com.softtek.mayo13.modelo.CocheSolicitud;
import com.softtek.mayo13.servicio.ISolicitudCocheServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/cocheSolicitud")
public class ControladorSolicitud {
    @Autowired
    private ISolicitudCocheServicio solicitudCocheServicio;

    @PostMapping
    public ResponseEntity<?> crearSolicitudCoche(@RequestBody CocheSolicitud cocheSolicitud) {
        try {
            CocheSolicitud creado = solicitudCocheServicio.crearSolicituf(cocheSolicitud);
            return ResponseEntity.ok(creado);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>("Failed to create car request due to an internal error.", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
