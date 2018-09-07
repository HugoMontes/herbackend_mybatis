/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cofar.hermes.kardex.service;

import com.cofar.hermes.core.util.RegistrationResult;
import com.cofar.hermes.kardex.models.HorarioTrabajo;
import java.util.List;

/**
 *
 * @author aduran
 */
public interface HorarioTrabajoService {

    public abstract RegistrationResult actualizar(HorarioTrabajo horario);

    public abstract RegistrationResult registrar(HorarioTrabajo horario);

    public abstract RegistrationResult eliminar(HorarioTrabajo horario);

    public abstract List<HorarioTrabajo> listar();

    public abstract List<HorarioTrabajo> listarPorParametros(HorarioTrabajo horario);

    public abstract HorarioTrabajo obtener(Integer idHorarioTrabajo);

}
