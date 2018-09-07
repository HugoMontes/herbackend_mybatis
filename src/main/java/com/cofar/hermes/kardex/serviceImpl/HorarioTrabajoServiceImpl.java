/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cofar.hermes.kardex.serviceImpl;

import com.cofar.hermes.core.util.RegistrationResult;
import com.cofar.hermes.kardex.models.HorarioTrabajo;
import com.cofar.hermes.kardex.repository.HorarioTrabajoRepository;
import com.cofar.hermes.kardex.service.HorarioTrabajoService;
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
public class HorarioTrabajoServiceImpl implements HorarioTrabajoService {

    @Autowired
    private HorarioTrabajoRepository horarioTrabajoRepository;

    @Override
    public RegistrationResult actualizar(HorarioTrabajo horario) {
        RegistrationResult res = new RegistrationResult();

        res.setCode(horarioTrabajoRepository.actualizar(horario));
        res.setMessage("Se ha Registrado Horario Correctamente ");
        return res;
    }

    @Override
    public RegistrationResult registrar(HorarioTrabajo horario) {
        RegistrationResult res = new RegistrationResult();

        res.setCode(horarioTrabajoRepository.registrar(horario));
        res.setMessage("Se ha Registrado Horario Correctamente ");
        return res;
    }

    @Override
    public RegistrationResult eliminar(HorarioTrabajo horario) {
        RegistrationResult res = new RegistrationResult();

        res.setCode(horarioTrabajoRepository.eliminar(horario));
        res.setMessage("Se ha Registrado Horario Correctamente ");
        return res;
    }

    @Override
    public List<HorarioTrabajo> listar() {
        return horarioTrabajoRepository.listar();
    }

    @Override
    public List<HorarioTrabajo> listarPorParametros(HorarioTrabajo horario) {
        return horarioTrabajoRepository.listarPorParametros(horario);
    }

    @Override
    public HorarioTrabajo obtener(Integer idHorarioTrabajo) {
        return horarioTrabajoRepository.obtener(idHorarioTrabajo);
    }

}
