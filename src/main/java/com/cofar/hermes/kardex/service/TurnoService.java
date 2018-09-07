/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cofar.hermes.kardex.service;

import com.cofar.hermes.core.util.RegistrationResult;
import com.cofar.hermes.kardex.models.Turno;

import java.util.List;

/**
 *
 * @author aduran
 */
public interface TurnoService {

    public abstract RegistrationResult registrar(Turno turno);

    public abstract RegistrationResult actualizar(Turno turno);

    public abstract List<Turno> listar();

    public abstract List<Turno> listarPorParametros(Turno turno);

    public abstract Turno obtener(Integer idTurno);

    public abstract RegistrationResult eliminar(Turno turno);

}
