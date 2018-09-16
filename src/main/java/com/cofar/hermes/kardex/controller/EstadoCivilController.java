/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cofar.hermes.kardex.controller;

import com.cofar.hermes.core.util.RegistrationResult;
import com.cofar.hermes.kardex.models.EstadoCivil;
import com.cofar.hermes.kardex.service.EstadoCivilService;
import java.util.List;
import org.apache.commons.logging.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.apache.commons.logging.LogFactory;
import javax.validation.Valid;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 *
 * @author aduran
 */
@RestController
@RequestMapping("/kardex/estadoCivil")
public class EstadoCivilController {

    private static final Log LOGGER = LogFactory.getLog(EstadoCivilController.class);

    @Autowired
//    @Qualifier("estadoCivilService")
    private EstadoCivilService estadoCivilService;

    @GetMapping("/listar/todo")
    public List<EstadoCivil> listarTodo() {
        LOGGER.info("METHOD: listarEstadoCivileTodo()");
        return estadoCivilService.listar();
    }

    @GetMapping("/listar")
    public List<EstadoCivil> listarEstadoCiviles() {
        LOGGER.info("METHOD: listarEstadoCivil()");
        return estadoCivilService.listarIdDescripcion();
    }

    @PostMapping("/adicionar")
    public RegistrationResult registrarEstadoCivil(@RequestBody @Valid EstadoCivil estadoCivil) {
        LOGGER.info("METHOD: adicionarEstadoCivil() | PARAMS: " + estadoCivil);

        return estadoCivilService.registrar(estadoCivil);
    }

    @PostMapping("/actualizar")
    public RegistrationResult actualizarEstadoCivil(@RequestBody @Valid EstadoCivil estadoCivil) {
        RegistrationResult res = new RegistrationResult();

        LOGGER.info("METHOD: actualizarEstadoCivil() | PARAMS: " + estadoCivil);
        return estadoCivilService.actualizar(estadoCivil);
    }

    @PostMapping("/eliminar")
    public RegistrationResult eliminarEstadoCivil(@RequestBody @Valid EstadoCivil estadoCivil) {
        LOGGER.info("METHOD: eliminarEstadoCivil() | PARAMS: " + estadoCivil);
        return estadoCivilService.eliminar(estadoCivil.getIdEstadoCivil());

    }

}
