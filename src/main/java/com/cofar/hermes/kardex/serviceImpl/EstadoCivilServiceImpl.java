/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cofar.hermes.kardex.serviceImpl;

import com.cofar.hermes.core.util.RegistrationResult;
import com.cofar.hermes.kardex.models.EstadoCivil;
import com.cofar.hermes.kardex.repository.EstadoCivilRepository;
import com.cofar.hermes.kardex.service.EstadoCivilService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author aduran
 */
@Service
@Transactional
public class EstadoCivilServiceImpl implements EstadoCivilService {

    @Autowired
    private EstadoCivilRepository estadoCivilRepository;

    @Override
    public RegistrationResult registrar(EstadoCivil estadoCivil) {
        RegistrationResult res = new RegistrationResult();
        res.setCode(estadoCivilRepository.registrar(estadoCivil));
        res.setMessage("Se ha Registrado Estado Civil Correctamente");
        return res;
    }

    @Override
    public RegistrationResult actualizar(EstadoCivil estadoCivil) {
        RegistrationResult res = new RegistrationResult();
        res.setCode(estadoCivilRepository.actualizar(estadoCivil));
        res.setMessage("Se ha Actualizado Estado Civil Correctamente");
        return res;
    }

    @Override
    public RegistrationResult eliminar(Integer idEstadoCivil) {
        RegistrationResult res = new RegistrationResult();
        res.setCode(estadoCivilRepository.eliminar(idEstadoCivil));
        res.setMessage("Se ha Eliminado Estado Civil Correctamente");
        return res;
    }

    @Override
    public List<EstadoCivil> listarPorParametroa(EstadoCivil estadoCivil) {
        return estadoCivilRepository.listarPorParametroa(estadoCivil);
    }

    @Override
    public List<EstadoCivil> listar() {
        return estadoCivilRepository.listar();
    }

    @Override
    public EstadoCivil obtener(Integer idEstadoCivil) {
        return estadoCivilRepository.obtener(idEstadoCivil);
    }

    @Override
    public List<EstadoCivil> listarIdDescripcion() {
        return estadoCivilRepository.listarIdDescripcion();
    }

}
