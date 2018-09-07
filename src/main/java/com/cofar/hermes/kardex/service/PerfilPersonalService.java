/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cofar.hermes.kardex.service;

import com.cofar.hermes.core.util.RegistrationResult;
import com.cofar.hermes.kardex.models.PerfilPersonal;
import java.util.List;

/**
 *
 * @author aduran
 */
public interface PerfilPersonalService {

    public abstract RegistrationResult registrar(PerfilPersonal perfil);

    public abstract RegistrationResult actualizar(PerfilPersonal perfil);

    public abstract List<PerfilPersonal> listar();

    public abstract List<PerfilPersonal> listarPorParametros(PerfilPersonal perfil);

    public abstract PerfilPersonal obtener(Integer idPerfilPersonal);

    public abstract RegistrationResult eliminar(PerfilPersonal perfil);

}
