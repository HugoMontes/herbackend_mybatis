/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cofar.hermes.kardex.service;

import com.cofar.hermes.core.util.RegistrationResult;
import com.cofar.hermes.kardex.models.PerfilProfesional;
import java.util.List;

/**
 *
 * @author aduran
 */
public interface PerfilProfesionalService {

    public RegistrationResult registrar(PerfilProfesional perfil);

    public RegistrationResult actualizar(PerfilProfesional perfil);

    public List<PerfilProfesional> listar();

    public List<PerfilProfesional> listarPorParametros(PerfilProfesional perfil);

    public PerfilProfesional obtener(Integer idPerfilProfesional);

    public RegistrationResult eliminar(Integer idPerfilProfesional);

}
