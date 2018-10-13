package com.cofar.hermes.kardex.service;

import com.cofar.hermes.core.util.RegistrationResult;
import com.cofar.hermes.kardex.models.MedEspe;

import java.util.List;


/**
 * @author Al?a?o Dur?n
 **/
public interface MedEspeService {

    List<MedEspe> listarPorParametrosMedEspe(MedEspe medEspe);

    List<MedEspe> listarMedEspe();

    MedEspe obtenerMedEspe(Integer idMedEspe);

    RegistrationResult registrarMedEspe(MedEspe medEspe);

    RegistrationResult actualizarMedEspe(MedEspe medEspe);

    RegistrationResult eliminarMedEspe(Integer idMedEspe);
}