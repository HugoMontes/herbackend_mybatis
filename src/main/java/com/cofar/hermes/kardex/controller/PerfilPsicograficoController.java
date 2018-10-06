/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cofar.hermes.kardex.controller;

import com.cofar.hermes.core.util.RegistrationResult;
import com.cofar.hermes.kardex.models.PerfilPsicografico;
import com.cofar.hermes.kardex.service.PerfilPsicograficoService;

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
@RequestMapping("/kardex/perfilpsicografico")
public class PerfilPsicograficoController {

    private static final Log LOGGER = LogFactory.getLog(PerfilPsicograficoController.class);

    @Autowired
    private PerfilPsicograficoService perfilPsicograficoService;

    @PostMapping("/listar")
    public List<PerfilPsicografico> listarTodo(@RequestBody @Valid PerfilPsicografico perfil) {
        LOGGER.info(" METHOD listarTodo perfilPsicografico");
        return perfilPsicograficoService.listarPorParametros(perfil);
    }

    @GetMapping("/listar")
    public List<PerfilPsicografico> listarPerfilPsicografico() {
        LOGGER.info(" METHOD listarPerfilPsicografico");
        return perfilPsicograficoService.listar();
    }

    @PostMapping("/obtener")
    public PerfilPsicografico obtenerPerfilPsicografico(@RequestBody @Valid PerfilPsicografico perfil) {
        LOGGER.info(" METHOD obtenerPerfilPsicografico");
        return perfilPsicograficoService.obtener(perfil.getIdPerfilPsicografico());
    }

    @PostMapping("/adicionar")
    public RegistrationResult adicionar(@RequestBody @Valid PerfilPsicografico perfil) {

        LOGGER.info(" METHOD adicionarPerfilPsicografico");
        return perfilPsicograficoService.registrar(perfil);
    }

    @PostMapping("/actualizar")
    public RegistrationResult actualizar(@RequestBody @Valid PerfilPsicografico perfil) {
        LOGGER.info(" METHOD actualizarPerfilPsicografico");
        return perfilPsicograficoService.actualizar(perfil);
    }

    @PostMapping("/eliminar")
    public RegistrationResult eliminar(@RequestBody @Valid PerfilPsicografico perfil) {
        LOGGER.info(" METHOD actualizarPerfilPsicografico");
        return perfilPsicograficoService.eliminar(perfil.getIdPerfilPsicografico());
    }
}
