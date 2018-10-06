package com.cofar.hermes.rutero.service;

import com.cofar.hermes.core.util.RegistrationResult;
import com.cofar.hermes.rutero.models.Calendario;

import java.util.List;


/**
 * @author Al?a?o Dur?n
 **/
public interface CalendarioService {

    List<Calendario> listarPorParametrosCalendario(Calendario calendario);

    Calendario obtenerCalendario(Integer idCalendario);

    RegistrationResult registrarCalendario(Calendario calendario);

    RegistrationResult actualizarCalendario(Calendario calendario);

    RegistrationResult eliminarCalendario(Integer idCalendario);
}