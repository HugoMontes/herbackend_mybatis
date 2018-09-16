/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cofar.hermes.kardex.controller;

import com.cofar.hermes.core.util.RegistrationResult;
import com.cofar.hermes.kardex.models.PerfilPersonal;
import com.cofar.hermes.kardex.service.PerfilPersonalService;
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
@RequestMapping("/kardex/perfilpersonal")
public class PerfilPersonalController {

    private static final Log LOGGER = LogFactory.getLog(PerfilPersonalController.class);
    @Autowired
//    @Qualifier("perfilPersonalService")
    private PerfilPersonalService perfilPersonalService;

    @GetMapping("/listar/todo")
    public List<PerfilPersonal> listarTodo() {
        LOGGER.info(" METHOD listarTodo perfilPersonal");
        return perfilPersonalService.listar();
    }

    @GetMapping("/listar")
    public List<PerfilPersonal> listarPerfilPersonal() {
        LOGGER.info(" METHOD listarPerfilPersonal");
        return perfilPersonalService.listar();
    }

    @PostMapping("/obtener")
    public PerfilPersonal obtenerPerfilPersonal(@RequestBody @Valid PerfilPersonal perfil) {
        LOGGER.info(" METHOD obtenerPerfilPersonal");
        return perfilPersonalService.obtener(perfil.getIdPerfilPersonal());
    }

    @PostMapping("/adicionar")
    public RegistrationResult adicionar(@RequestBody @Valid PerfilPersonal perfil) {

        LOGGER.info(" METHOD adicionarPerfilPersonal");
        return perfilPersonalService.registrar(perfil);
    }

    @PostMapping("/actualizar")
    public RegistrationResult actualizar(@RequestBody @Valid PerfilPersonal perfil) {
        LOGGER.info(" METHOD actualizarPerfilPersonal");
        return perfilPersonalService.actualizar(perfil);
    }

}
