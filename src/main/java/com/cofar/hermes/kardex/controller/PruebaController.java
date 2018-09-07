package com.cofar.hermes.kardex.controller;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cofar.hermes.core.models.AdmUsuarioModel;
import com.cofar.hermes.kardex.service.AdmUsuarioService;

@RestController
@RequestMapping("/saludo")
public class PruebaController {

    private static final Log LOGGER = LogFactory.getLog(PruebaController.class);

    @Autowired
    private AdmUsuarioService admUsuarioService;

    @GetMapping("/uno")
    public String prueba() {
        LOGGER.info("Entrandoo aca ");
        return "Hola Mundo...!!!";
    }

    @GetMapping("/dos")
    public List<AdmUsuarioModel> listar() {
        System.out.println("Entrando aqui..!!!");
        List<AdmUsuarioModel> listaUsuer = admUsuarioService.listar();
        for (int i = 0; i < listaUsuer.size(); i++) {
            System.out.println("1 : " + listaUsuer.get(i).getIdUsuario());
            System.out.println("1 : " + listaUsuer.get(i).getNombreUsuario());
            System.out.println("1 : " + listaUsuer.get(i).getContrasenia());

        }

        return admUsuarioService.listar();
    }

}
