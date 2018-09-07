/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cofar.hermes.kardex.controller;

import com.cofar.hermes.core.util.RegistrationResult;
import com.cofar.hermes.kardex.models.Medico;
import com.cofar.hermes.kardex.service.MedicoService;

import java.util.List;
import javax.validation.Valid;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
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
@RequestMapping("/medico")
public class MedicoController {

    private static final Log LOGGER = LogFactory.getLog(MedicoController.class);
    @Autowired
//    @Qualifier("medicoService")
    private MedicoService medicoService;

    @GetMapping("/listar")
    public List<Medico> listar() {
        LOGGER.info("METHOD: listarMedicos()");
        return medicoService.listar();
    }
    @GetMapping("/esplin")
    public List<Medico> listarEspLin() {
        LOGGER.info("METHOD: listarMedicos()");
        return medicoService.listarEspLin();
    }

    @GetMapping("/listar/todo")
    public List<Medico> listarTodo() {
        LOGGER.info("METHOD: listarTodo()");
        return medicoService.listar();

    }

    @PostMapping("/obtener")
    public Medico obtener(@RequestBody @Valid  Medico medico) {
        LOGGER.info(" METHOD obtenerMedico :");
        
        
        System.out.println(" idMedico :"+medico.getIdMedico() );
        return medicoService.obtener(medico.getIdMedico());
    }

    @PostMapping("/adicionar")
    public RegistrationResult adicionar(@RequestBody @Valid Medico medico) {
        LOGGER.info(" METHOD adicionarPerfilPersonal");
        return medicoService.registrar(medico);
    }

    @PostMapping("/actualizar")
    public RegistrationResult actualizar(@RequestBody @Valid Medico medico) {
        LOGGER.info(" METHOD adicionarPerfilPersonal");
        return medicoService.actualizar(medico);
    }

    @PostMapping("/eliminar")
    public RegistrationResult eliminar(@RequestBody @Valid Medico medico) {
        LOGGER.info(" METHOD adicionarPerfilPersonal");
        return medicoService.eliminar(medico);
    }

    @GetMapping("/listarP")
    public List<Medico> listarP(Pageable pageable) {
        LOGGER.info("METHOD: listarMedicos()");
        return medicoService.listarP(pageable).getContent();
    }



}
