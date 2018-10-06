package com.cofar.hermes.rutero.serviceImpl;

import com.cofar.hermes.core.util.RegistrationResult;
import com.cofar.hermes.rutero.models.RuteroTipo;
import com.cofar.hermes.rutero.repository.RuteroTipoRepository;
import com.cofar.hermes.rutero.service.RuteroTipoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


/**
 * @author Al?a?o Dur?n
 **/
@Service
@Transactional
public class RuteroTipoServiceImpl implements RuteroTipoService {

    @Autowired
    private RuteroTipoRepository ruteroTipoRepository;

    @Override
    public List<RuteroTipo> listarPorParametrosRuteroTipo(RuteroTipo ruteroTipo) {
        return ruteroTipoRepository.listarPorParametros(ruteroTipo);
    }

    @Override
    public RuteroTipo obtenerRuteroTipo(Integer idRuteroTipo) {
        return ruteroTipoRepository.obtener(idRuteroTipo);
    }

    @Override
    public RegistrationResult registrarRuteroTipo(RuteroTipo ruteroTipo) {
        RegistrationResult res = new RegistrationResult();

        res.setCode(ruteroTipoRepository.registrar(ruteroTipo));
        return res;
    }

    @Override
    public RegistrationResult actualizarRuteroTipo(RuteroTipo ruteroTipo) {
        RegistrationResult res = new RegistrationResult();

        res.setCode(ruteroTipoRepository.actualizar(ruteroTipo));
        return res;
    }

    @Override
    public RegistrationResult eliminarRuteroTipo(Integer idRuteroTipo) {
        RegistrationResult res = new RegistrationResult();

        res.setCode(ruteroTipoRepository.eliminar(idRuteroTipo));
        return res;
    }

}