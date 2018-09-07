/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cofar.hermes.kardex.controller;

import com.cofar.hermes.core.util.RegistrationResult;
import com.cofar.hermes.kardex.models.FarmaciaReferencia;
import com.cofar.hermes.kardex.service.FarmaciaReferenciaService;
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
@RequestMapping("farmacia")
public class FarmaciaReferenciaController {

    private static final Log LOGGER = LogFactory.getLog(FarmaciaReferenciaController.class);
    @Autowired
//    @Qualifier("farmaciaReferenciaService")
    private FarmaciaReferenciaService farmaciaReferenciaService;

    @GetMapping("/listar/todo")
    public List<FarmaciaReferencia> listarTodo() {
        LOGGER.info("METHOD: listarFarmaciaReferenciaeTodo()");
        return farmaciaReferenciaService.listar();
    }

    @GetMapping("/listar")
    public List<FarmaciaReferencia> listarFarmaciaReferencia() {
        LOGGER.info("METHOD: listarFarmaciaReferencia()");
        return farmaciaReferenciaService.listar();
    }

    @PostMapping("/obtener")
    public FarmaciaReferencia obtenerFarmaciaReferencia(@RequestBody @Valid FarmaciaReferencia farmacia) {
        LOGGER.info("METHOD: obtenerFarmaciaReferencia()");
        return farmaciaReferenciaService.obtener(farmacia.getIdFarmaciaReferencia());
    }

    @PostMapping("/adicionar")
    public RegistrationResult registrarFarmaciaReferencia(@RequestBody @Valid FarmaciaReferencia farmaciaReferencia) {
        LOGGER.info("METHOD: adicionarFarmaciaReferencia() | PARAMS: " + farmaciaReferencia);

        return farmaciaReferenciaService.registrar(farmaciaReferencia);
    }

    @PostMapping("/actualizar")
    public RegistrationResult actualizarFarmaciaReferencia(@RequestBody @Valid FarmaciaReferencia farmaciaReferencia) {
        RegistrationResult res = new RegistrationResult();

        LOGGER.info("METHOD: actualizarFarmaciaReferencia() | PARAMS: " + farmaciaReferencia);
        return farmaciaReferenciaService.actualizar(farmaciaReferencia);
    }

    @PostMapping("/eliminar")
    public RegistrationResult eliminarFarmaciaReferencia(@RequestBody @Valid FarmaciaReferencia farmaciaReferencia) {
        LOGGER.info("METHOD: eliminarFarmaciaReferencia() | PARAMS: " + farmaciaReferencia);
        return farmaciaReferenciaService.eliminar(farmaciaReferencia.getIdFarmaciaReferencia());

    }

}
