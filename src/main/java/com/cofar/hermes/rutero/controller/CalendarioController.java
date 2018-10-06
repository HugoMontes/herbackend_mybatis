package com.cofar.hermes.rutero.controller;

import com.cofar.hermes.core.util.RegistrationResult;
import com.cofar.hermes.rutero.models.Calendario;

import java.util.List;

import com.cofar.hermes.rutero.service.CalendarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


/**
 * @author Al?a?o Dur?n
 **/
@Controller
@RequestMapping(value = "/rutero/calendario")
public class CalendarioController {

    @Autowired
    private CalendarioService calendarioService;

    @RequestMapping(value = "/listar")
    @GetMapping
    public List<Calendario> dolistarcalendario() {
        Calendario calendario = new Calendario();
        return calendarioService.listarPorParametrosCalendario(calendario);
    }

    @RequestMapping(value = "/obtener")
    @PostMapping
    public Calendario doobtenercalendario(@RequestBody @Valid Calendario calendario) {
        return calendarioService.obtenerCalendario(calendario.getIdCalendario());
    }

    @PostMapping
    @RequestMapping(value = "/registrar")
    RegistrationResult doregistrarcalendario(@RequestBody @Valid Calendario calendario) {
        return calendarioService.registrarCalendario(calendario);
    }

    @PostMapping
    @RequestMapping(value = "/actualizar")
    RegistrationResult doactualizarcalendario(@RequestBody @Valid Calendario calendario) {
        return calendarioService.actualizarCalendario(calendario);
    }

    @PostMapping
    @RequestMapping(value = "/eliminar")
    public RegistrationResult doeliminarcalendario(@RequestBody @Valid Calendario calendario) {
        return calendarioService.eliminarCalendario(calendario.getIdCalendario());
    }
}