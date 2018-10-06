package com.cofar.hermes.kardex.controller;

import com.cofar.hermes.core.util.RegistrationResult;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cofar.hermes.kardex.models.Direccion;
import com.cofar.hermes.kardex.service.DireccionService;

import javax.validation.Valid;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/kardex/direccion")
public class DireccionController {

    private static final Log LOGGER = LogFactory.getLog(DireccionController.class);

    @Autowired
    private DireccionService direccionService;

    @PostMapping("/listar")
    public List<Direccion> prueba(@RequestBody @Valid Direccion direccion) {
        return direccionService.listarPorParametros(direccion);
    }

    @GetMapping("/listar    ")
    public List<Direccion> listarTodo() {
        LOGGER.info("METHOD: listarNotas()");
        return direccionService.listar();
    }

    //    @GetMapping("/listar")
//    public List<DireccionEntity> listarDirecciones() {
//        LOGGER.info("METHOD: listarNotas()");
//        return direccionService.listar();
//    }
    @PostMapping("/adicionar")
    public RegistrationResult registrarDireccion(@RequestBody @Valid Direccion direccion) {
        LOGGER.info("METHOD: agregarLinea() | PARAMS: " + direccion);

        System.out.println("1: " + direccion.getIdDireccion());
        System.out.println("2: " + direccion.getDireccion());
        System.out.println("3: " + direccion.getNroDireccion());
        System.out.println("4: " + direccion.getTelefono());
        System.out.println("5: " + direccion.getEmail());
        System.out.println("6: " + direccion.getAvenidaCalle());
        System.out.println("7: " + direccion.getUsuarioRegistro());
        System.out.println("8: " + direccion.getUsuarioModificacion());
        System.out.println("9: " + direccion.getFechaRegistro());
        System.out.println("10: " + direccion.getFechaModificacion());
        System.out.println("11: " + direccion.getEstado());
        return direccionService.registrar(direccion);
    }

    @PostMapping("/actualizar")
    public RegistrationResult actualizarDireccion(@RequestBody @Valid Direccion direccion) {

        LOGGER.info("METHOD: actualizarDireccion() | PARAMS: " + direccion);
        return direccionService.actualizar(direccion);
    }

    @PostMapping("/eliminar")
    public RegistrationResult eliminarDireccion(@RequestBody @Valid Direccion direccion) {
        LOGGER.info("METHOD: eliminarDireccion() | PARAMS: " + direccion);
        return direccionService.eliminar(direccion);

    }

}
