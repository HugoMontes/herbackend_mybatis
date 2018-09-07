/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cofar.hermes.kardex.repository;

import com.cofar.hermes.kardex.models.PerfilPersonal;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;

/**
 *
 * @author aduran
 */
@Mapper
public interface PerfilPersonalRepository {

    public abstract Integer registrar(PerfilPersonal perfil);

    public abstract Integer actualizar(PerfilPersonal perfil);

    public abstract List<PerfilPersonal> listar();

    public abstract List<PerfilPersonal> listarPorParametros(PerfilPersonal perfil);

    public abstract PerfilPersonal obtener(Integer idPerfilPersonal);

    public abstract Integer eliminar(PerfilPersonal perfil);

}
