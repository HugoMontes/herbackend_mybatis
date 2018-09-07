/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cofar.hermes.kardex.service;

import com.cofar.hermes.core.util.RegistrationResult;
import com.cofar.hermes.kardex.models.Secretaria;
import java.util.List;

/**
 *
 * @author aduran
 */
public interface SecretariaService {

    public abstract RegistrationResult registrar(Secretaria secretaria);

    public abstract RegistrationResult actualizar(Secretaria secretaria);

    public abstract List<Secretaria> listar();

    public abstract List<Secretaria> listarPorParametros(Secretaria secretaria);

    public abstract Secretaria obtener(Integer idSecretaria);

    public abstract RegistrationResult eliminar(Secretaria secretaria);

}
