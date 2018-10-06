package com.cofar.hermes.rutero.serviceImpl;

import com.cofar.hermes.core.util.RegistrationResult;
import com.cofar.hermes.rutero.models.Calendario;
import com.cofar.hermes.rutero.repository.CalendarioRepository;
import com.cofar.hermes.rutero.service.CalendarioService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


/**
 * @author Al?a?o Dur?n
 **/
@Service
@Transactional
public class CalendarioServiceImpl implements CalendarioService {

    @Autowired
    private CalendarioRepository calendarioRepository;

    @Override
    public List<Calendario> listarPorParametrosCalendario(Calendario calendario) {
        return calendarioRepository.listarPorParametros(calendario);
    }

    @Override
    public Calendario obtenerCalendario(Integer idCalendario) {
        return calendarioRepository.obtener(idCalendario);
    }

    @Override
    public RegistrationResult registrarCalendario(Calendario calendario) {
        RegistrationResult res = new RegistrationResult();

        res.setCode(calendarioRepository.registrar(calendario));
        return res;
    }

    @Override
    public RegistrationResult actualizarCalendario(Calendario calendario) {
        RegistrationResult res = new RegistrationResult();

        res.setCode(calendarioRepository.actualizar(calendario));
        return res;
    }

    @Override
    public RegistrationResult eliminarCalendario(Integer idCalendario) {
        RegistrationResult res = new RegistrationResult();

        res.setCode(calendarioRepository.eliminar(idCalendario));
        return res;
    }

}