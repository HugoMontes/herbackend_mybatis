/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cofar.hermes.kardex.controller;

import com.cofar.hermes.core.util.RegistrationResult;
import com.cofar.hermes.kardex.models.Linea;

import javax.validation.Valid;
import com.cofar.hermes.kardex.service.LineaService;
import java.util.List;
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
@RequestMapping("/kardex/linea")
public class LineaController {

    private static final Log LOGGER = LogFactory.getLog(LineaController.class);

    @Autowired
//    @Qualifier("lineaService")
    private LineaService lineaService;

    @GetMapping("/listar/todo")
    public List<Linea> listarTodoLinea() {
        LOGGER.info("METHOD: listarNotas()");
        return lineaService.listar();
    }

    @GetMapping("/listar")
    public List<Linea> listarLinea() {
        LOGGER.info("METHOD: listarNotas()");
        return lineaService.listar();
    }

    @PostMapping("/adicionar")
    public RegistrationResult registrarLinea(@RequestBody @Valid Linea linea) {
        LOGGER.info("METHOD: agregarLinea() | PARAMS: " + linea);

        System.out.println("1: " + linea.getIdLinea());
        System.out.println("2: " + linea.getDescripcion());
        System.out.println("3: " + linea.getUsuarioRegistro());
        System.out.println("4: " + linea.getUsuarioModificacion());
        System.out.println("5: " + linea.getFechaRegistro());
        System.out.println("5: " + linea.getFechaModificacion());
        System.out.println("5: " + linea.getEstado());
        return lineaService.registrar(linea);
    }

    @PostMapping("/actualizar")
    public RegistrationResult actualizarLinea(@RequestBody @Valid Linea linea) {
        RegistrationResult res = new RegistrationResult();

        LOGGER.info("METHOD: actualizarLinea() | PARAMS: " + linea);
        return lineaService.actualizar(linea);
    }

    @PostMapping("/eliminar")
    public RegistrationResult eliminarLinea(@RequestBody @Valid Linea linea) {
        LOGGER.info("METHOD: eliminar>Linea() | PARAMS: " + linea);
        return lineaService.eliminar(linea.getIdLinea());
    }

}
