/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cofar.hermes.kardex.controller;

import com.cofar.hermes.core.util.RegistrationResult;
import com.cofar.hermes.kardex.models.HorarioTrabajo;
import com.cofar.hermes.kardex.service.HorarioTrabajoService;
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
@RequestMapping("/horarioTrabajo")
public class HorarioTrabajoController {

    private static final Log LOGGER = LogFactory.getLog(HorarioTrabajoController.class);

    @Autowired
//    @Qualifier("horarioTrabajoService")
    private HorarioTrabajoService horarioTrabajoService;

    @GetMapping("/listar/todo")
    public List<HorarioTrabajo> listarTodo() {
        LOGGER.info("METHOD: listarHorarioTrabajoTodo()");

        System.out.println("====> Controller ===>");
        return horarioTrabajoService.listar();
    }

    @GetMapping("/listar")
    public List<HorarioTrabajo> listarHorarioTrabajo() {
        LOGGER.info("METHOD: listarHorarioTrabajo()");

        System.out.println("====> Controller ===>");
        return horarioTrabajoService.listar();
    }

    @PostMapping("/obtener")
    public HorarioTrabajo obtenerHorarioTrabajo(@RequestBody @Valid HorarioTrabajo farmacia) {
        LOGGER.info("METHOD: obtenerHorarioTrabajo()");
        return horarioTrabajoService.obtener(farmacia.getIdHorarioTrabajo());
    }

    @PostMapping("/adicionar")
    public RegistrationResult registrarHorarioTrabajo(@RequestBody @Valid HorarioTrabajo horarioTrabajo) {
        LOGGER.info("METHOD: adicionarHorarioTrabajo() | PARAMS: " + horarioTrabajo);

        return horarioTrabajoService.registrar(horarioTrabajo);
    }

    @PostMapping("/actualizar")
    public RegistrationResult actualizarHorarioTrabajo(@RequestBody @Valid HorarioTrabajo horarioTrabajo) {
        RegistrationResult res = new RegistrationResult();

        LOGGER.info("METHOD: actualizarHorarioTrabajo() | PARAMS: " + horarioTrabajo);
        return horarioTrabajoService.actualizar(horarioTrabajo);
    }

    @PostMapping("/eliminar")
    public RegistrationResult eliminarHorarioTrabajo(@RequestBody @Valid HorarioTrabajo horarioTrabajo) {
        LOGGER.info("METHOD: eliminarHorarioTrabajo() | PARAMS: " + horarioTrabajo);
        return horarioTrabajoService.eliminar(horarioTrabajo);

    }

}
