/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cofar.hermes.kardex.serviceImpl;

import com.cofar.hermes.core.util.RegistrationResult;
import com.cofar.hermes.kardex.models.PerfilPsicografico;
import com.cofar.hermes.kardex.repository.PerfilPsicograficoRepository;
import com.cofar.hermes.kardex.service.PerfilPsicograficoService;
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
public class PerfilPsicograficoServiceImpl implements PerfilPsicograficoService {

    @Autowired
    private PerfilPsicograficoRepository ppr;

    @Override
    public RegistrationResult registrar(PerfilPsicografico pefil) {
        RegistrationResult res = new RegistrationResult();
        res.setCode(ppr.registrar(pefil));
        res.setMessage("Se ha Registrado Perfil Psicografico Correctamente ");
        return res;
    }

    @Override
    public RegistrationResult actualizar(PerfilPsicografico pefil) {
        RegistrationResult res = new RegistrationResult();
        res.setCode(ppr.actualizar(pefil));
        res.setMessage("Se ha Actaulizado Perfil Psicografico Correctamente ");
        return res;
    }

    @Override
    public RegistrationResult eliminar(Integer idPerfil) {
        RegistrationResult res = new RegistrationResult();
        res.setCode(ppr.eliminar(idPerfil));
        res.setMessage("Se ha Eliminado Perfil Psicografico Correctamente ");
        return res;
    }

    @Override
    public List<PerfilPsicografico> listar() {
        return ppr.listar();
    }

    @Override
    public List<PerfilPsicografico> listarPorParametros(PerfilPsicografico pefil) {
        return ppr.listarPorParametros(pefil);
    }

    @Override
    public PerfilPsicografico obtener(Integer idPerfilPsicografico) {
        return ppr.obtener(idPerfilPsicografico);
    }

}
