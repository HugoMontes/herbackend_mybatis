/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cofar.hermes.kardex.repository;

import com.cofar.hermes.kardex.models.PerfilProfesional;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;

/**
 *
 * @author aduran
 */
@Mapper
public interface PerfilProfesionalRepository {

    public Integer registrar(PerfilProfesional perfil);

    public Integer actualizar(PerfilProfesional perfil);

    public List<PerfilProfesional> listar();

    public List<PerfilProfesional> listarPorParametros(PerfilProfesional perfil);

    public PerfilProfesional obtener(Integer idPerfilProfesional);

    public Integer eliminar(Integer idPerfilProfesional);

}
