/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cofar.hermes.kardex.service;

import com.cofar.hermes.core.util.RegistrationResult;
import com.cofar.hermes.kardex.models.PerfilPsicografico;

import java.util.List;

/**
 *
 * @author aduran
 */
public interface PerfilPsicograficoService {

    public abstract RegistrationResult registrar(PerfilPsicografico pefil);

    public abstract RegistrationResult actualizar(PerfilPsicografico pefil);

    public abstract RegistrationResult eliminar(Integer idPerfil);

    public abstract List<PerfilPsicografico> listar();

    public abstract List<PerfilPsicografico> listarPorParametros(PerfilPsicografico pefil);

    public abstract PerfilPsicografico obtener(Integer idPerfilPsicografico);

}
