/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cofar.hermes.kardex.repository;

import com.cofar.hermes.kardex.models.Especialidad;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

/**
 * @author aduran
 */
@Mapper
public interface EspecialidadRepository {

    public List<Especialidad> listar();

    public List<Especialidad> listarDescripcion();

    public List<Especialidad> listarPorParametros(Especialidad especialidad);

    public Integer registrar(Especialidad especialidad);

    public Integer actualizar(Especialidad especialidad);

    public Integer eliminar(Integer idEspecialidad);

    public Especialidad obtener(Integer idEspecialidad);

}
