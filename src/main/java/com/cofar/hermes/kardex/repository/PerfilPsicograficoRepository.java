/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cofar.hermes.kardex.repository;

import com.cofar.hermes.kardex.models.PerfilPsicografico;

import java.util.List;

import org.springframework.stereotype.Repository;

/**
 * @author aduran
 */
@Repository
public interface PerfilPsicograficoRepository {

    public abstract Integer registrar(PerfilPsicografico pefil);

    public abstract Integer actualizar(PerfilPsicografico pefil);

    public abstract Integer eliminar(Integer idPerfil);

    public abstract List<PerfilPsicografico> listar();

    public abstract List<PerfilPsicografico> listarPorParametros(PerfilPsicografico pefil);



    public abstract PerfilPsicografico obtener(Integer idPerfilPsicografico);

}
