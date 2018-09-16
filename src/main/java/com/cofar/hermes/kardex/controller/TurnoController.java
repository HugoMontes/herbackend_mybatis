/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cofar.hermes.kardex.controller;

import com.cofar.hermes.core.util.RegistrationResult;
import com.cofar.hermes.kardex.models.Turno;
import com.cofar.hermes.kardex.service.TurnoService;

import java.util.List;
import javax.validation.Valid;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author aduran
 */
@RestController
@RequestMapping("/kardex/turno")
public class TurnoController {

    private static final Log LOGGER = LogFactory.getLog(TurnoController.class);

    @Autowired
//    @Qualifier("turnoService")
    private TurnoService turnoService;

    @GetMapping("/listar/todo")
    public List<Turno> listarTodo() {
        LOGGER.info(" METHOD listar Todo Turnos");
        return turnoService.listar();
    }

    @GetMapping("/listar")
    public List<Turno> listarTurno() {
        LOGGER.info(" METHOD listar Turno");
        return turnoService.listar();
    }

    @PostMapping("/obtener")
    public Turno obtenerTurno(@RequestBody @Valid Turno turno) {
        LOGGER.info(" METHOD obtener Turno");
        return turnoService.obtener(turno.getIdTurno());
    }

    @PostMapping("/adicionar")
    public RegistrationResult adicionar(@RequestBody @Valid Turno turno) {
        System.out.println("====> CONTROLL");
        System.out.println("1 : " + turno.getIdTurno());
        System.out.println("2 : " + turno.getDescripcion());
        System.out.println("3 : " + turno.getHora());
        System.out.println("4 : " + turno.getEstado());
        LOGGER.info(" METHOD adicionarTurno");
        return turnoService.registrar(turno);
    }

    @PostMapping("/actualizar")
    public RegistrationResult actualizar(@RequestBody @Valid Turno turno) {
        LOGGER.info(" METHOD actualizarTurno");
        return turnoService.actualizar(turno);
    }

    @PostMapping("/eliminar")
    public RegistrationResult eliminar(@RequestBody @Valid Turno turno) {
        LOGGER.info(" METHOD actualizarTurno");
        return turnoService.eliminar(turno);
    }

}
