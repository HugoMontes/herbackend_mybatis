package com.cofar.hermes.rutero.service;

import com.cofar.hermes.core.util.RegistrationResult;
import com.cofar.hermes.rutero.models.Ciclo;

import java.util.List;


/**
 * @author Al?a?o Dur?n
 **/
public interface CicloService {

    List<Ciclo> listarPorParametrosCiclo(Ciclo ciclo);

    Ciclo obtenerCiclo(Integer idCiclo);

    RegistrationResult registrarCiclo(Ciclo ciclo);

    RegistrationResult actualizarCiclo(Ciclo ciclo);

    RegistrationResult eliminarCiclo(Integer idCiclo);
}