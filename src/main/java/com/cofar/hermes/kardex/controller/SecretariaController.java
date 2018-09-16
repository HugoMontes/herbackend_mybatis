/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cofar.hermes.kardex.controller;

import com.cofar.hermes.core.util.RegistrationResult;
import com.cofar.hermes.kardex.models.Secretaria;
import com.cofar.hermes.kardex.service.SecretariaService;
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
@RequestMapping("/kardex/secretaria")
public class SecretariaController {

    private static final Log LOGGER = LogFactory.getLog(SecretariaController.class);

    @Autowired
//    @Qualifier("secretariaService")
    private SecretariaService secretariaService;

    @GetMapping("/listar/todo")
    public List<Secretaria> listarTodo() {
        LOGGER.info(" METHOD listar Todo Secretarias");
        return secretariaService.listar();
    }

    @GetMapping("/listar")
    public List<Secretaria> listarSecretaria() {
        LOGGER.info(" METHOD listar Secretaria");
        return secretariaService.listar();
    }

    @PostMapping("/obtener")
    public Secretaria obtenerSecretaria(@RequestBody @Valid Secretaria secretaria) {
        LOGGER.info(" METHOD obtener Secretaria");
        return secretariaService.obtener(secretaria.getIdSecretaria());
    }

    @PostMapping("/adicionar")
    public RegistrationResult adicionar(@RequestBody @Valid Secretaria secretaria) {

        LOGGER.info(" METHOD adicionarSecretaria");
        return secretariaService.registrar(secretaria);
    }

    @PostMapping("/actualizar")
    public RegistrationResult actualizar(@RequestBody @Valid Secretaria secretaria) {
        LOGGER.info(" METHOD actualizarSecretaria");
        return secretariaService.actualizar(secretaria);
    }

    @PostMapping("/eliminar")
    public RegistrationResult eliminar(@RequestBody @Valid Secretaria secretaria) {
        LOGGER.info(" METHOD actualizarSecretaria");
        return secretariaService.eliminar(secretaria);
    }

}
