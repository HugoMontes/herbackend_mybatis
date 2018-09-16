/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cofar.hermes.kardex.serviceImpl;

import com.cofar.hermes.core.service.AdmUsuarioServiceLoguin;
import com.cofar.hermes.core.util.RegistrationResult;
import com.cofar.hermes.kardex.models.Linea;
import com.cofar.hermes.kardex.repository.LineaRepository;
import com.cofar.hermes.kardex.service.LineaService;
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
public class LineaServiceImpl implements LineaService {

    @Autowired
    private LineaRepository lineaRepository;
    @Autowired
    private AdmUsuarioServiceLoguin loginService;
    @Override
    public RegistrationResult registrar(Linea linea) {
        RegistrationResult res = new RegistrationResult();
        res.setCode(lineaRepository.registrar(linea));
        res.setMessage("Se ha Registrado Linea Correctamente ");
        return res;
    }

    @Override
    public RegistrationResult actualizar(Linea linea) {
        RegistrationResult res = new RegistrationResult();
        res.setCode(lineaRepository.actualizar(linea));
        res.setMessage("Se ha Registrado Linea Correctamente ");
        return res;
    }

    @Override
    public RegistrationResult eliminar(Integer idLinea) {
        RegistrationResult res = new RegistrationResult();
        res.setCode(lineaRepository.eliminar(idLinea));
        res.setMessage("Se ha Registrado Linea Correctamente ");
        return res;
    }

    @Override
    public List<Linea> listar() {
        return lineaRepository.listar();
    }

    @Override
    public List<Linea> listarPorParametros(Linea linea) {
        return lineaRepository.listarPorParametros(linea);
    }

    @Override
    public Linea obtener(Integer idLinea) {
        return lineaRepository.obtener(idLinea);
    }

}
