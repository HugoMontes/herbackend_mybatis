/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cofar.hermes.kardex.service;

import com.cofar.hermes.core.util.RegistrationResult;
import com.cofar.hermes.kardex.models.LugarTrabajo;
import com.cofar.hermes.kardex.models.Medico;

import java.util.List;

/**
 *
 * @author aduran
 */
public interface LugarTrabajoService {

    public abstract RegistrationResult registrar(LugarTrabajo lugar);

    public abstract RegistrationResult actualizar(LugarTrabajo lugar);

    public abstract RegistrationResult eliminar(Integer idLugarTrabajo);

    public abstract List<LugarTrabajo> listar();

    public abstract List<LugarTrabajo> listarPorMedico(Medico medico);

    public abstract List<LugarTrabajo> listarPorParametros(LugarTrabajo lugar);

    public abstract LugarTrabajo obtener(Integer idLugarTrabajo);

}
