/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cofar.hermes.kardex.controller;

import com.cofar.hermes.core.util.RegistrationResult;
import com.cofar.hermes.kardex.models.Especialidad;
import com.cofar.hermes.kardex.service.EspecialidadService;

import java.util.List;
import javax.validation.Valid;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author aduran
 */
@RestController
@RequestMapping("/kardex/especialidad")
public class EspecialidadController {

    private static final Log LOGGER = LogFactory.getLog(EspecialidadController.class);

    @Autowired
//    @Qualifier("especialidadService")
    private EspecialidadService especialidadService;

    @PostMapping("/listar")
    public List<Especialidad> listarTodo(@RequestBody @Valid Especialidad especialidad) {
        LOGGER.info("METHOD: listarEspecialidadesTodo()");
        return especialidadService.listarPorParametros(especialidad);
    }

    @GetMapping("/listar")
    public List<Especialidad> listarEspecialidades() {
        LOGGER.info("METHOD: listarEspecialidad()");
        return especialidadService.listar();
    }

    @GetMapping("/listardescripcion")
    public List<Especialidad> listarDescripcion() {
        LOGGER.info("METHOD: listar Descripcion()");
        return especialidadService.listarDescripcion();
    }

    @PostMapping("/adicionar")
    public RegistrationResult registrarEspecialidad(@RequestBody @Valid Especialidad especialidad) {
        LOGGER.info("METHOD: adicionarEspecialidad() | PARAMS: " + especialidad);

        return especialidadService.registrar(especialidad);
    }

    @PostMapping("/actualizar")
    public RegistrationResult actualizarEspecialidad(@RequestBody @Valid Especialidad especialidad) {
        RegistrationResult res = new RegistrationResult();

        LOGGER.info("METHOD: actualizarEspecialidad() | PARAMS: " + especialidad);
        return especialidadService.actualizar(especialidad);
    }

    @PostMapping("/eliminar")
    public RegistrationResult eliminarEspecialidad(@RequestBody @Valid Especialidad especialidad) {
        LOGGER.info("METHOD: eliminarEspecialidad() | PARAMS: " + especialidad);
        return especialidadService.eliminar(especialidad.getIdEspecialidad());

    }

}
