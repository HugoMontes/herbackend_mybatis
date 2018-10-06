package com.cofar.hermes.rutero.serviceImpl;

import com.cofar.hermes.core.util.RegistrationResult;
import com.cofar.hermes.rutero.models.Contacto;
import com.cofar.hermes.rutero.repository.ContactoRepository;
import com.cofar.hermes.rutero.service.ContactoService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


/**
 * @author Al?a?o Dur?n
 **/
@Service
@Transactional
public class ContactoServiceImpl implements ContactoService {

    @Autowired
    private ContactoRepository contactoRepository;

    @Override
    public List<Contacto> listarPorParametrosContacto(Contacto contacto) {
        return contactoRepository.listarPorParametros(contacto);
    }

    @Override
    public Contacto obtenerContacto(Integer idContacto) {
        return contactoRepository.obtener(idContacto);
    }

    @Override
    public RegistrationResult registrarContacto(Contacto contacto) {
        RegistrationResult res = new RegistrationResult();

        res.setCode(contactoRepository.registrar(contacto));
        return res;
    }

    @Override
    public RegistrationResult actualizarContacto(Contacto contacto) {
        RegistrationResult res = new RegistrationResult();

        res.setCode(contactoRepository.actualizar(contacto));
        return res;
    }

    @Override
    public RegistrationResult eliminarContacto(Integer idContacto) {
        RegistrationResult res = new RegistrationResult();

        res.setCode(contactoRepository.eliminar(idContacto));
        return res;
    }

}