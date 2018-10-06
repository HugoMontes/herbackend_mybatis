package com.cofar.hermes.rutero.serviceImpl;

import com.cofar.hermes.core.util.RegistrationResult;
import com.cofar.hermes.rutero.models.Rutero;
import com.cofar.hermes.rutero.repository.RuteroRepository;
import com.cofar.hermes.rutero.service.RuteroService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


/**
 * @author Al?a?o Dur?n
 **/
@Service
@Transactional
public class RuteroServiceImpl implements RuteroService {

    @Autowired
    private RuteroRepository ruteroRepository;

    @Override
    public List<Rutero> listarPorParametrosRutero(Rutero rutero) {
        return ruteroRepository.listarPorParametros(rutero);
    }

    @Override
    public Rutero obtenerRutero(Integer idRutero) {
        return ruteroRepository.obtener(idRutero);
    }

    @Override
    public RegistrationResult registrarRutero(Rutero rutero) {
        RegistrationResult res = new RegistrationResult();

        res.setCode(ruteroRepository.registrar(rutero));
        return res;
    }

    @Override
    public RegistrationResult actualizarRutero(Rutero rutero) {
        RegistrationResult res = new RegistrationResult();

        res.setCode(ruteroRepository.actualizar(rutero));
        return res;
    }

    @Override
    public RegistrationResult eliminarRutero(Integer idRutero) {
        RegistrationResult res = new RegistrationResult();

        res.setCode(ruteroRepository.eliminar(idRutero));
        return res;
    }

}