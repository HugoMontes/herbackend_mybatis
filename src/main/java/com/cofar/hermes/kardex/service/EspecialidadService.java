/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cofar.hermes.kardex.service;

import com.cofar.hermes.core.util.RegistrationResult;
import com.cofar.hermes.kardex.models.Especialidad;

import java.util.List;

/**
 * @author aduran
 */
public interface EspecialidadService {

    public List<Especialidad> listar();

    public List<Especialidad> listarPorParametros(Especialidad especialidad);

    public RegistrationResult registrar(Especialidad especialidad);

    public RegistrationResult actualizar(Especialidad especialidad);

    public RegistrationResult eliminar(Integer idEspecialidad);

    public Especialidad obtener(Integer idEspecialidad);

    public List<Especialidad> listarDescripcion();

}
