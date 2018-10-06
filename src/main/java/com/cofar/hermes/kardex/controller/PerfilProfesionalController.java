/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cofar.hermes.kardex.controller;

import com.cofar.hermes.core.util.RegistrationResult;
import com.cofar.hermes.kardex.models.PerfilProfesional;
import com.cofar.hermes.kardex.service.PerfilProfesionalService;
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
 *
 * @author aduran
 */
@RestController
@RequestMapping("/kardex/perfilprofesional")
public class PerfilProfesionalController {

    private static final Log LOGGER = LogFactory.getLog(PerfilPersonalController.class);

    @Autowired
    private PerfilProfesionalService perfilProfesionalService;

    @GetMapping("/listar")
    public List<PerfilProfesional> listarTodo() {
        LOGGER.info(" METHOD listarTodo perfilPersonal");
        return perfilProfesionalService.listar();
    }

    @PostMapping("/listar")
    public List<PerfilProfesional> listarPerfilPersonal(@RequestBody @Valid PerfilProfesional perfil) {
        LOGGER.info(" METHOD listarPerfilPersonal");
        return perfilProfesionalService.listarPorParametros(perfil);
    }

    @PostMapping("/obtener")
    public PerfilProfesional obtenerPerfilPersonal(@RequestBody @Valid PerfilProfesional perfil) {
        LOGGER.info(" METHOD obtenerPerfilPersonal");
        return perfilProfesionalService.obtener(perfil.getIdPerfilProfesional());
    }

    @PostMapping("/adicionar")
    public RegistrationResult adicionar(@RequestBody @Valid PerfilProfesional perfil) {

        LOGGER.info(" METHOD adicionarPerfilPersonal");
        return perfilProfesionalService.registrar(perfil);
    }

    @PostMapping("/actualizar")
    public RegistrationResult actualizar(@RequestBody @Valid PerfilProfesional perfil) {
        LOGGER.info(" METHOD actualizarPerfilPersonal");
        return perfilProfesionalService.actualizar(perfil);
    }

    @PostMapping("/eliminar")
    public RegistrationResult eliminar(@RequestBody @Valid PerfilProfesional perfil) {
        LOGGER.info(" METHOD actualizarPerfilPersonal");
        return perfilProfesionalService.eliminar(perfil.getIdPerfilProfesional());
    }
}
