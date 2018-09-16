/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cofar.hermes.kardex.serviceImpl;

import com.cofar.hermes.core.service.AdmUsuarioServiceLoguin;
import com.cofar.hermes.core.util.RegistrationResult;
import com.cofar.hermes.kardex.models.FarmaciaReferencia;
import com.cofar.hermes.kardex.repository.FarmaciaReferenciaRepository;
import com.cofar.hermes.kardex.service.FarmaciaReferenciaService;
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
public class FarmaciaReferenciaServiceImpl implements FarmaciaReferenciaService {

    @Autowired
    private FarmaciaReferenciaRepository farmaciaReferenciaRepository;
    @Autowired
    private AdmUsuarioServiceLoguin loginService;
    @Override
    public RegistrationResult registrar(FarmaciaReferencia farmacia) {
        RegistrationResult res = new RegistrationResult();

        res.setCode(farmaciaReferenciaRepository.registrar(farmacia));
        res.setMessage("Se ha Registrado Farmacia Correctamente ");
        return res;
    }

    @Override
    public RegistrationResult actualizar(FarmaciaReferencia farmacia) {
        RegistrationResult res = new RegistrationResult();

        res.setCode(farmaciaReferenciaRepository.actualizar(farmacia));
        res.setMessage("Se ha Registrado Farmacia Correctamente ");
        return res;
    }

    @Override
    public RegistrationResult eliminar(Integer idFarmaciaReferencia) {
        RegistrationResult res = new RegistrationResult();

        res.setCode(farmaciaReferenciaRepository.eliminar(idFarmaciaReferencia));
        res.setMessage("Se ha Registrado Farmacia Correctamente ");
        return res;
    }

    @Override
    public List<FarmaciaReferencia> listar() {
        return farmaciaReferenciaRepository.listar();
    }

    @Override
    public List<FarmaciaReferencia> listarPorParametros(FarmaciaReferencia farmacia) {
        return farmaciaReferenciaRepository.listarPorParametros(farmacia);
    }

    @Override
    public FarmaciaReferencia obtener(Integer idFarmaciaReferencia) {
        return farmaciaReferenciaRepository.obtener(idFarmaciaReferencia);
    }

}
