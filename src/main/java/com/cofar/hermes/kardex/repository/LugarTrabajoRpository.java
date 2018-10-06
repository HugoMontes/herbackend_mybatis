/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cofar.hermes.kardex.repository;

import com.cofar.hermes.kardex.models.LugarTrabajo;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

/**
 * @author aduran
 */
@Mapper
public interface LugarTrabajoRpository {

    public abstract Integer registrar(LugarTrabajo lugar);

    public abstract Integer actualizar(LugarTrabajo lugar);

    public abstract Integer eliminar(Integer idLugarTrabajo);

    public abstract List<LugarTrabajo> listar();

    public abstract List<LugarTrabajo> listarPorMedico(Integer idMedico);

    public abstract List<LugarTrabajo> listarPorParametros(LugarTrabajo lugar);

    public abstract LugarTrabajo obtener(Integer idLugarTrabajo);

}
