/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cofar.hermes.kardex.service;

import com.cofar.hermes.core.util.RegistrationResult;
import com.cofar.hermes.kardex.models.EstadoCivil;
import java.util.List;

/**
 *
 * @author aduran
 */
public interface EstadoCivilService {

    public abstract RegistrationResult registrar(EstadoCivil estadoCivil);

    public abstract RegistrationResult actualizar(EstadoCivil estadoCivil);

    public abstract RegistrationResult eliminar(Integer idEstadoCivil);

    public abstract List<EstadoCivil> listar();

    public abstract List<EstadoCivil> listarIdDescripcion();

    public abstract List<EstadoCivil> listarPorParametroa(EstadoCivil estadoCivil);

    public abstract EstadoCivil obtener(Integer idEstadoCivil);

}
