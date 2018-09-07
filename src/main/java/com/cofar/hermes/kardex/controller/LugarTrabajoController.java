/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cofar.hermes.kardex.controller;

import com.cofar.hermes.core.util.RegistrationResult;
import com.cofar.hermes.kardex.models.LugarTrabajo;
import com.cofar.hermes.kardex.service.LugarTrabajoService;
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
@RequestMapping("lugarTrabajo")
public class LugarTrabajoController {

    private static final Log LOGGER = LogFactory.getLog(LugarTrabajoController.class);
    @Autowired
//    @Qualifier("lugarTrabajoService")
    private LugarTrabajoService lugarTrabajoService;

    @GetMapping("/listar/todo")
    public List<LugarTrabajo> listarTodo() {
        LOGGER.info("METHOD: listarLugarTrabajoeTodo()");
        return lugarTrabajoService.listar();
    }

    @GetMapping("/listar")
    public List<LugarTrabajo> listarLugarTrabajo() {
        LOGGER.info("METHOD: listarLugarTrabajo()");
        return lugarTrabajoService.listar();
    }

    @PostMapping("/obtener")
    public LugarTrabajo obtenerLugarTrabajo(@RequestBody @Valid LugarTrabajo lugarTrabajo) {
        LOGGER.info("METHOD: obtenerLugarTrabajo()");
        return lugarTrabajoService.obtener(lugarTrabajo.getIdLugarTrabajo());
    }

    @PostMapping("/adicionar")
    public RegistrationResult registrarLugarTrabajo(@RequestBody @Valid LugarTrabajo lugarTrabajo) {
        LOGGER.info("METHOD: adicionarLugarTrabajo() | PARAMS: " + lugarTrabajo);

        return lugarTrabajoService.registrar(lugarTrabajo);
    }

    @PostMapping("/actualizar")
    public RegistrationResult actualizarLugarTrabajo(@RequestBody @Valid LugarTrabajo lugarTrabajo) {
        RegistrationResult res = new RegistrationResult();

        LOGGER.info("METHOD: actualizarLugarTrabajo() | PARAMS: " + lugarTrabajo);
        return lugarTrabajoService.actualizar(lugarTrabajo);
    }

    @PostMapping("/eliminar")
    public RegistrationResult eliminarLugarTrabajo(@RequestBody @Valid LugarTrabajo lugarTrabajo) {
        LOGGER.info("METHOD: eliminarLugarTrabajo() | PARAMS: " + lugarTrabajo);
        return lugarTrabajoService.eliminar(lugarTrabajo.getIdLugarTrabajo());

    }

}
