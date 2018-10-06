package com.cofar.hermes.rutero.service;

import com.cofar.hermes.core.util.RegistrationResult;
import com.cofar.hermes.rutero.models.RuteroTipo;

import java.util.List;


/**
 * @author Al?a?o Dur?n
 **/
public interface RuteroTipoService {

    List<RuteroTipo> listarPorParametrosRuteroTipo(RuteroTipo ruteroTipo);

    RuteroTipo obtenerRuteroTipo(Integer idRuteroTipo);

    RegistrationResult registrarRuteroTipo(RuteroTipo ruteroTipo);

    RegistrationResult actualizarRuteroTipo(RuteroTipo ruteroTipo);

    RegistrationResult eliminarRuteroTipo(Integer idRuteroTipo);
}