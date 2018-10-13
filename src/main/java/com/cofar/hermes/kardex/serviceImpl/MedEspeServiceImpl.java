package com.cofar.hermes.kardex.serviceImpl;

import com.cofar.hermes.core.util.RegistrationResult;
import com.cofar.hermes.kardex.models.MedEspe;
import com.cofar.hermes.kardex.repository.MedEspeRepository;
import com.cofar.hermes.kardex.service.MedEspeService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


/**
 * @author Al?a?o Dur?n
 **/
@Service
@Transactional
public class MedEspeServiceImpl implements MedEspeService {

    @Autowired
    private MedEspeRepository medEspeRepository;

    @Override
    public List<MedEspe> listarPorParametrosMedEspe(MedEspe medEspe) {
        return medEspeRepository.listarPorParametros(medEspe);
    }

    @Override
    public List<MedEspe> listarMedEspe() {
        return medEspeRepository.listar();
    }

    @Override
    public MedEspe obtenerMedEspe(Integer idMedEspe) {
        return medEspeRepository.obtener(idMedEspe);
    }

    @Override
    public RegistrationResult registrarMedEspe(MedEspe medEspe) {
        RegistrationResult res = new RegistrationResult();

        res.setCode(medEspeRepository.registrar(medEspe));
        return res;
    }

    @Override
    public RegistrationResult actualizarMedEspe(MedEspe medEspe) {
        RegistrationResult res = new RegistrationResult();

        res.setCode(medEspeRepository.actualizar(medEspe));
        return res;
    }

    @Override
    public RegistrationResult eliminarMedEspe(Integer idMedEspe) {
        RegistrationResult res = new RegistrationResult();

        res.setCode(medEspeRepository.eliminar(idMedEspe));
        return res;
    }

}