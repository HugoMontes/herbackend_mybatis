package com.cofar.hermes.rutero.controller;

import com.cofar.hermes.core.util.RegistrationResult;
import com.cofar.hermes.rutero.models.Ciclo;
import com.cofar.hermes.rutero.service.CicloService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * @author Al?a?o Dur?n
 **/
@Controller
@RequestMapping(value = "/rutero/ciclo")
public class CicloController {

    @Autowired
    private CicloService cicloService;

    @GetMapping
    @RequestMapping(value = "/listar")

    public List<Ciclo> dolistarPorParametrosciclo() {
        Ciclo ciclo = new Ciclo();
        return cicloService.listarPorParametrosCiclo(ciclo);
    }

    @RequestMapping(value = "/obtener")
    @PostMapping
    public Ciclo doobtenerciclo(@RequestBody @Valid Ciclo ciclo) {
        return cicloService.obtenerCiclo(ciclo.getIdCiclo());
    }

    @RequestMapping(value = "/registrar", method = RequestMethod.POST)
    @PostMapping
    RegistrationResult doregistrarciclo(@RequestBody @Valid Ciclo ciclo) {
        return cicloService.registrarCiclo(ciclo);
    }

    @RequestMapping(value = "/actualizar", method = RequestMethod.GET)
    @GetMapping
    RegistrationResult doactualizarciclo(@RequestBody @Valid Ciclo ciclo) {
        return cicloService.actualizarCiclo(ciclo);
    }

    @RequestMapping(value = "/eliminar", method = RequestMethod.GET)
    @GetMapping
    public RegistrationResult doeliminarciclo(@RequestBody @Valid Ciclo ciclo) {
        return cicloService.eliminarCiclo(ciclo.getIdCiclo());
    }
}