/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cofar.hermes.kardex.serviceImpl;

import com.cofar.hermes.core.service.AdmUsuarioServiceLoguin;
import com.cofar.hermes.core.util.RegistrationResult;
import com.cofar.hermes.kardex.models.Especialidad;
import com.cofar.hermes.kardex.repository.EspecialidadRepository;
import com.cofar.hermes.kardex.service.EspecialidadService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author aduran
 */
@Service
@Transactional
public class EspecialidadServiceImpl implements EspecialidadService {

    @Autowired
    private EspecialidadRepository especialidadRepository;

    @Autowired
    private AdmUsuarioServiceLoguin loginService;

    @Override
    public List<Especialidad> listar() {
        return especialidadRepository.listar();
    }

    @Override
    public List<Especialidad> listarPorParametros(Especialidad especialidad) {
        return especialidadRepository.listarPorParametros(especialidad);
    }

    @Override
    public RegistrationResult registrar(Especialidad especialidad) {
        RegistrationResult res = new RegistrationResult();

        res.setCode(especialidadRepository.registrar(especialidad));
        res.setMessage("Especialidad ha siso Registrada Satisfactoriamente");
        return res;
    }

    @Override
    public RegistrationResult actualizar(Especialidad especialidad) {
        RegistrationResult res = new RegistrationResult();

        res.setCode(especialidadRepository.actualizar(especialidad));
        res.setMessage("Especialidad ha siso Actualizada Satisfactoriamente");
        return res;
    }

    @Override
    public RegistrationResult eliminar(Integer idEspecialidad) {
        RegistrationResult res = new RegistrationResult();

        res.setCode(especialidadRepository.eliminar(idEspecialidad));
        res.setMessage("Especialidad ha siso Eliminada Satisfactoriamente");
        return res;
    }

    @Override
    public Especialidad obtener(Integer idEspecialidad) {
        return especialidadRepository.obtener(idEspecialidad);
    }

    @Override
    public List<Especialidad> listarDescripcion() {
        return especialidadRepository.listarDescripcion();
    }

}
