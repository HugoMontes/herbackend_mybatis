/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cofar.hermes.kardex.serviceImpl;

import com.cofar.hermes.core.util.RegistrationResult;
import com.cofar.hermes.kardex.models.PerfilPersonal;
import com.cofar.hermes.kardex.repository.PerfilPersonalRepository;
import com.cofar.hermes.kardex.service.PerfilPersonalService;
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
public class PerfilPersonalServiceImpl implements PerfilPersonalService {

    @Autowired
    private PerfilPersonalRepository perfilPersonalRepository;

    @Override
    public RegistrationResult registrar(PerfilPersonal perfil) {
        RegistrationResult res = new RegistrationResult();
        res.setCode(perfilPersonalRepository.registrar(perfil));
        res.setMessage("Se ha Registrado Perfil Personal Correctamente ");
        return res;
    }

    @Override
    public RegistrationResult actualizar(PerfilPersonal perfil) {
        RegistrationResult res = new RegistrationResult();
        res.setCode(perfilPersonalRepository.actualizar(perfil));
        res.setMessage("Se ha Actualizado Perfil Personal Correctamente ");
        return res;
    }

    @Override
    public List<PerfilPersonal> listar() {
        return perfilPersonalRepository.listar();
    }

    @Override
    public List<PerfilPersonal> listarPorParametros(PerfilPersonal perfil) {
        return perfilPersonalRepository.listarPorParametros(perfil);
    }

    @Override
    public PerfilPersonal obtener(Integer idPerfilPersonal) {
        return perfilPersonalRepository.obtener(idPerfilPersonal);
    }

    @Override
    public RegistrationResult eliminar(PerfilPersonal perfil) {
        RegistrationResult res = new RegistrationResult();
        res.setCode(perfilPersonalRepository.eliminar(perfil));
        res.setMessage("Se ha Eliminado Perfil Personal Correctamente ");
        return res;
    }

}
