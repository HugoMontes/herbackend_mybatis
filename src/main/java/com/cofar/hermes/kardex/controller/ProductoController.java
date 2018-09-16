/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cofar.hermes.kardex.controller;

import com.cofar.hermes.core.util.RegistrationResult;
import com.cofar.hermes.kardex.models.Producto;
import com.cofar.hermes.kardex.service.ProductoService;
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
@RequestMapping("/kardex/producto")
public class ProductoController {

    private static final Log LOGGER = LogFactory.getLog(ProductoController.class);

    @Autowired
//    @Qualifier("productoService")
    private ProductoService productoService;

    @GetMapping("/listar/todo")
    public List<Producto> listarTodo() {
        LOGGER.info(" METHOD listar Todo Productos");
        return productoService.listar();
    }

    @GetMapping("/listar")
    public List<Producto> listarProducto() {
        LOGGER.info(" METHOD listar Producto");
        return productoService.listar();
    }

    @PostMapping("/obtener")
    public Producto obtenerProducto(@RequestBody @Valid Producto producto) {
        LOGGER.info(" METHOD obtener Producto");
        return productoService.obtener(producto.getIdProducto());
    }

    @PostMapping("/adicionar")
    public RegistrationResult adicionar(@RequestBody @Valid Producto producto) {

        LOGGER.info(" METHOD adicionarProducto");
        return productoService.registrar(producto);
    }

    @PostMapping("/actualizar")
    public RegistrationResult actualizar(@RequestBody @Valid Producto producto) {
        LOGGER.info(" METHOD actualizarProducto");
        return productoService.actualizar(producto);
    }

    @PostMapping("/eliminar")
    public RegistrationResult eliminar(@RequestBody @Valid Producto producto) {
        LOGGER.info(" METHOD actualizarProducto");
        return productoService.eliminar(producto.getIdProducto());
    }

}
