/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cofar.hermes.kardex.serviceImpl;

import com.cofar.hermes.core.service.AdmUsuarioServiceLoguin;
import com.cofar.hermes.core.util.RegistrationResult;
import com.cofar.hermes.kardex.models.Secretaria;
import com.cofar.hermes.kardex.repository.SecretariaRepository;
import com.cofar.hermes.kardex.service.SecretariaService;
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
public class SecretariaServiceImpl implements SecretariaService {

    @Autowired
    private SecretariaRepository sr;
    @Autowired
    private AdmUsuarioServiceLoguin loginService;
    @Override
    public RegistrationResult registrar(Secretaria secretaria) {
        RegistrationResult res = new RegistrationResult();
        res.setCode(sr.registrar(secretaria));
        res.setMessage("Se ha Registrado Registro de Secretaria Correctamente ");
        return res;
    }

    @Override
    public RegistrationResult actualizar(Secretaria secretaria) {
        RegistrationResult res = new RegistrationResult();
        res.setCode(sr.actualizar(secretaria));
        res.setMessage("Se ha Actualizado Informacion de Secretaria Correctamente ");
        return res;
    }

    @Override
    public RegistrationResult eliminar(Secretaria secretaria) {
        RegistrationResult res = new RegistrationResult();
        res.setCode(sr.eliminar(secretaria));
        res.setMessage("Se ha Elimiado Registro de Secretaria Correctamente ");
        return res;
    }

    @Override
    public List<Secretaria> listar() {
        return sr.listar();
    }

    @Override
    public List<Secretaria> listarPorParametros(Secretaria secretaria) {
        return sr.listarPorParametros(secretaria);
    }

    @Override
    public Secretaria obtener(Integer idSecretaria) {
        return sr.obtener(idSecretaria);
    }

}
