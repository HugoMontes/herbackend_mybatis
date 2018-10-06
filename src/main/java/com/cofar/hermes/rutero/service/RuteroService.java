package com.cofar.hermes.rutero.service;

import com.cofar.hermes.core.util.RegistrationResult;
import com.cofar.hermes.rutero.models.Rutero;

import java.util.List;


/**
 * @author Al?a?o Dur?n
 **/
public interface RuteroService {

    List<Rutero> listarPorParametrosRutero(Rutero rutero);

    Rutero obtenerRutero(Integer idRutero);

    RegistrationResult registrarRutero(Rutero rutero);

    RegistrationResult actualizarRutero(Rutero rutero);

    RegistrationResult eliminarRutero(Integer idRutero);
}