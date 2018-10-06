package com.cofar.hermes.rutero.service;

import com.cofar.hermes.core.util.RegistrationResult;
import com.cofar.hermes.rutero.models.Contacto;

import java.util.List;


/**
 * @author Al?a?o Dur?n
 **/
public interface ContactoService {

    List<Contacto> listarPorParametrosContacto(Contacto contacto);

    Contacto obtenerContacto(Integer idContacto);

    RegistrationResult registrarContacto(Contacto contacto);

    RegistrationResult actualizarContacto(Contacto contacto);

    RegistrationResult eliminarContacto(Integer idContacto);
}