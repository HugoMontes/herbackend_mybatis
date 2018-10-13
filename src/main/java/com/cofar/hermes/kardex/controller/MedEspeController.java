package com.cofar.hermes.kardex.controller;

import com.cofar.hermes.core.util.RegistrationResult;
import com.cofar.hermes.kardex.models.MedEspe;
import com.cofar.hermes.kardex.service.MedEspeService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


/**
 * @author Al?a?o Dur?n
 **/
@RestController
@RequestMapping(value = "/kardex/medespe")
public class MedEspeController {

    @Autowired
    private MedEspeService medEspeService;

    @PostMapping("/listar")
    public List<MedEspe> dolistarPorParametrosMedEsp(@RequestBody @Valid MedEspe medEspe) {

        return medEspeService.listarPorParametrosMedEspe(medEspe);
    }

    @GetMapping("/listar")
    public List<MedEspe> dolistarMedEsp() {

        return medEspeService.listarMedEspe();
    }

    @PostMapping("/obtener")
    public MedEspe doobtenermedespe(@RequestBody @Valid MedEspe medEspe) {
        return medEspeService.obtenerMedEspe(medEspe.getIdMedEspe());
    }

    @PostMapping("/adicionar")
    RegistrationResult doregistrarmedespe(@RequestBody @Valid MedEspe medEspe) {
        return medEspeService.registrarMedEspe(medEspe);
    }

    @PostMapping("/actualizar")
    RegistrationResult doactualizarmedespe(@RequestBody @Valid MedEspe medEspe) {
        return medEspeService.actualizarMedEspe(medEspe);
    }

    @PostMapping("/eliminar")
    public RegistrationResult doeliminarmedespe(@RequestBody @Valid MedEspe medEspe) {
        return medEspeService.eliminarMedEspe(medEspe.getIdMedEspe());
    }
}