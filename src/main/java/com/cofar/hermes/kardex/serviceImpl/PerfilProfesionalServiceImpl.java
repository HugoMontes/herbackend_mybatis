/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cofar.hermes.kardex.serviceImpl;

import com.cofar.hermes.core.util.RegistrationResult;
import com.cofar.hermes.kardex.models.PerfilProfesional;
import com.cofar.hermes.kardex.repository.PerfilProfesionalRepository;
import com.cofar.hermes.kardex.service.PerfilProfesionalService;
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
public class PerfilProfesionalServiceImpl implements PerfilProfesionalService {

    @Autowired
    private PerfilProfesionalRepository ppr;

    @Override
    public RegistrationResult registrar(PerfilProfesional perfil) {
        RegistrationResult res = new RegistrationResult();
        res.setCode(ppr.registrar(perfil));
        res.setMessage("Se ha Registrado Perfil Profesional Correctamente ");
        return res;
    }

    @Override
    public RegistrationResult actualizar(PerfilProfesional perfil) {
        RegistrationResult res = new RegistrationResult();
        res.setCode(ppr.actualizar(perfil));
        res.setMessage("Se ha Actualizado Perfil Profesional Correctamente ");
        return res;
    }

    @Override
    public List<PerfilProfesional> listar() {
        return ppr.listar();
    }

    @Override
    public List<PerfilProfesional> listarPorParametros(PerfilProfesional perfil) {
        return ppr.listarPorParametros(perfil);
    }

    @Override
    public PerfilProfesional obtener(Integer idPerfilProfesional) {
        return ppr.obtener(idPerfilProfesional);
    }

    @Override
    public RegistrationResult eliminar(Integer idPerfilProfesional) {
        RegistrationResult res = new RegistrationResult();
        res.setCode(ppr.eliminar(idPerfilProfesional));
        res.setMessage("Se ha Eliminado Perfil Profesional Correctamente ");
        return res;
    }

}
