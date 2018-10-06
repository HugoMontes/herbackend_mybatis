package com.cofar.hermes.rutero.controller;

import com.cofar.hermes.core.util.RegistrationResult;
import com.cofar.hermes.rutero.models.Contacto;
import com.cofar.hermes.rutero.service.ContactoService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


/**
 * @author Al?a?o Dur?n
 **/
@Controller
@RequestMapping(value = "/rutero/contacto")
public class ContactoController {

    @Autowired
    private ContactoService contactoService;

    @GetMapping
    @RequestMapping(value = "/listar")
    public List<Contacto> dolistarPorParametroscontacto() {
        Contacto contacto = new Contacto();
        return contactoService.listarPorParametrosContacto(contacto);
    }

    @RequestMapping(value = "/obtener")
    @PostMapping
    public Contacto doobtenercontacto(@RequestBody @Valid Contacto contacto) {
        return contactoService.obtenerContacto(contacto.getIdContacto());
    }

    @RequestMapping(value = "/registrar")
    @PostMapping
    RegistrationResult doregistrarcontacto(@RequestBody @Valid Contacto contacto) {
        return contactoService.registrarContacto(contacto);
    }

    @RequestMapping(value = "/actualizar")
    @PostMapping
    RegistrationResult doactualizarcontacto(@RequestBody @Valid Contacto contacto) {
        return contactoService.actualizarContacto(contacto);
    }

    @RequestMapping(value = "/eliminar")
    @PostMapping
    public RegistrationResult doeliminarcontacto(@RequestBody @Valid Contacto contacto) {
        return contactoService.eliminarContacto(contacto.getIdContacto());
    }
}