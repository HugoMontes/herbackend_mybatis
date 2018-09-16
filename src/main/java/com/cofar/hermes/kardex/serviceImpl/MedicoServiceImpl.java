/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cofar.hermes.kardex.serviceImpl;

import com.cofar.hermes.core.service.AdmUsuarioServiceLoguin;
import com.cofar.hermes.core.util.RegistrationResult;
import com.cofar.hermes.kardex.models.Medico;
import com.cofar.hermes.kardex.repository.MedicoRepository;
import com.cofar.hermes.kardex.service.MedicoService;
import lombok.Builder;
import org.springframework.beans.factory.ObjectFactory;
import org.springframework.data.domain.Pageable;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author aduran
 */
@Service
@Transactional
public class MedicoServiceImpl implements MedicoService {

    @Autowired
    private MedicoRepository medicoRepository;
    @Autowired
    private AdmUsuarioServiceLoguin loginService;

    @Override
    public RegistrationResult registrar(Medico medico) {
        RegistrationResult res = new RegistrationResult();
        res.setCode(medicoRepository.registrar(medico));
        HashMap params = new HashMap();
        params.put("idMedico", medico.getIdMedico());
        res.setParams(params);
        res.setMessage("Se ha Registrado Medico Correctamente ");
        return res;
    }

    @Override
    public RegistrationResult actualizar(Medico medico) {
        RegistrationResult res = new RegistrationResult();
        res.setCode(medicoRepository.actualizar(medico));
        res.setMessage("Se ha Actualizado Medico Correctamente ");
        return res;
    }

    @Override
    public RegistrationResult eliminar(Medico medico) {
        RegistrationResult res = new RegistrationResult();
        res.setCode(medicoRepository.eliminar(medico));
        res.setMessage("Se ha Eliminado Medico Correctamente ");
        return res;
    }

    @Override
    public Medico obtener(Integer IdMedico) {
        return medicoRepository.obtener(IdMedico);
    }

    @Override
    public List<Medico> listar() {
        return medicoRepository.listar();
    }

    @Override
    public List<Medico> listarPorParametros(Medico medico) {
        return medicoRepository.listarPorParametros(medico);
    }

    @Override
    public Page<Medico> listarP(Pageable pageable) {
        return medicoRepository.listarP(pageable);
    }

    @Override
    public Page<Medico> findAll(Pageable pageable) {
        return medicoRepository.findAll(pageable);
    }

    @Override
    public List<Medico> listarEspLin() {
        return medicoRepository.listarEspLin();
    }

}
