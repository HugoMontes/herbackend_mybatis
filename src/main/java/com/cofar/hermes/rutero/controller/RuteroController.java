package com.cofar.hermes.rutero.controller;

import com.cofar.hermes.core.util.RegistrationResult;
import com.cofar.hermes.rutero.models.Rutero;
import com.cofar.hermes.rutero.service.RuteroService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


/**
 * @author Al?a?o Dur?n
 **/
@Controller
@RequestMapping(value = "/rutero/rutero")
public class RuteroController {

    @Autowired
    private RuteroService ruteroService;

    @RequestMapping(value = "/listar")
    @GetMapping
    public List<Rutero> dolistarPorParametrosrutero() {
        Rutero rutero = new Rutero();
        return ruteroService.listarPorParametrosRutero(rutero);
    }

    @RequestMapping(value = "/obtener")
    @PostMapping
    public Rutero doobtenerrutero(@RequestBody @Valid Rutero rutero) {
        return ruteroService.obtenerRutero(rutero.getIdRutero());
    }

    @RequestMapping(value = "/registrar")
    @PostMapping
    RegistrationResult doregistrarrutero(@RequestBody @Valid Rutero rutero) {
        return ruteroService.registrarRutero(rutero);
    }

    @RequestMapping(value = "/actualizar")
    @PostMapping
    RegistrationResult doactualizarrutero(@RequestBody @Valid Rutero rutero) {
        return ruteroService.actualizarRutero(rutero);
    }

    @RequestMapping(value = "/eliminar")
    @PostMapping
    public RegistrationResult doeliminarrutero(@RequestBody @Valid Rutero rutero) {
        return ruteroService.eliminarRutero(rutero.getIdRutero());
    }
}