/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cofar.hermes.kardex.serviceImpl;

import com.cofar.hermes.core.service.AdmUsuarioServiceLoguin;
import com.cofar.hermes.core.util.RegistrationResult;
import com.cofar.hermes.kardex.models.Turno;
import com.cofar.hermes.kardex.repository.TurnoRepository;
import com.cofar.hermes.kardex.service.TurnoService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author aduran
 */
@Service
@Transactional
public class TurnoServiceImpl implements TurnoService {

    @Autowired
    private TurnoRepository tr;
    @Autowired
    private AdmUsuarioServiceLoguin loginService;

    @Override
    public RegistrationResult registrar(Turno turno) {
        RegistrationResult res = new RegistrationResult();
        res.setCode(tr.registrar(turno));
        res.setMessage("Se ha Registradio Turno Correctamente ");
        return res;
    }

    @Override
    public RegistrationResult actualizar(Turno turno) {
        RegistrationResult res = new RegistrationResult();
        res.setCode(tr.actualizar(turno));
        res.setMessage("Se ha Actualizado Turno Correctamente ");
        return res;
    }

    @Override
    public RegistrationResult eliminar(Turno turno) {
        RegistrationResult res = new RegistrationResult();
        res.setCode(tr.eliminar(turno));
        res.setMessage("Se ha Eliminado Turno Correctamente ");
        return res;
    }

    @Override
    public List<Turno> listar() {
        return tr.listar();
    }

    @Override
    public List<Turno> listarPorParametros(Turno turno) {
        return tr.listarPorParametros(turno);
    }

    @Override
    public Turno obtener(Integer idTurno) {
        return tr.obtener(idTurno);
    }

}
