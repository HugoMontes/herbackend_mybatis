package com.cofar.hermes.rutero.serviceImpl;

import com.cofar.hermes.core.util.RegistrationResult;
import com.cofar.hermes.rutero.models.Ciclo;
import com.cofar.hermes.rutero.repository.CicloRepository;
import com.cofar.hermes.rutero.service.CicloService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


/**
 * @author Al?a?o Dur?n
 **/
@Service
@Transactional
public class CicloServiceImpl implements CicloService {

    @Autowired
    private CicloRepository cicloRepository;

    @Override
    public List<Ciclo> listarPorParametrosCiclo(Ciclo ciclo) {
        return cicloRepository.listarPorParametros(ciclo);
    }

    @Override
    public Ciclo obtenerCiclo(Integer idCiclo) {
        return cicloRepository.obtener(idCiclo);
    }

    @Override
    public RegistrationResult registrarCiclo(Ciclo ciclo) {
        RegistrationResult res = new RegistrationResult();

        res.setCode(cicloRepository.registrar(ciclo));
        return res;
    }

    @Override
    public RegistrationResult actualizarCiclo(Ciclo ciclo) {
        RegistrationResult res = new RegistrationResult();

        res.setCode(cicloRepository.actualizar(ciclo));
        return res;
    }

    @Override
    public RegistrationResult eliminarCiclo(Integer idCiclo) {
        RegistrationResult res = new RegistrationResult();

        res.setCode(cicloRepository.eliminar(idCiclo));
        return res;
    }

}