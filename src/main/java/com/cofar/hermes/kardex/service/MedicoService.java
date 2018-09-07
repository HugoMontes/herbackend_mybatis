/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cofar.hermes.kardex.service;

import com.cofar.hermes.core.util.RegistrationResult;
import com.cofar.hermes.kardex.models.Medico;

import org.springframework.data.domain.Page;
import java.util.List;
import org.springframework.data.domain.Pageable;

/**
 *
 * @author aduran
 */
public interface MedicoService {

    public abstract RegistrationResult registrar(Medico medico);

    public abstract RegistrationResult actualizar(Medico medico);

    public abstract RegistrationResult eliminar(Medico medico);

    public abstract Medico obtener(Integer IdMedico);

    public abstract List<Medico> listar();

    public abstract List<Medico> listarEspLin();

    public abstract List<Medico> listarPorParametros(Medico medico);

    public abstract Page<Medico> listarP(Pageable pageable);

    public abstract Page<Medico> findAll(Pageable pageable);
}
