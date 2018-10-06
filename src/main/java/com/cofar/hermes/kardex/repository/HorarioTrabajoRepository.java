/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cofar.hermes.kardex.repository;

import com.cofar.hermes.kardex.models.HorarioTrabajo;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

/**
 * @author aduran
 */
@Mapper
public interface HorarioTrabajoRepository {

    public abstract Integer actualizar(HorarioTrabajo horario);

    public abstract Integer registrar(HorarioTrabajo horario);

    public abstract Integer eliminar(HorarioTrabajo horario);

    public abstract List<HorarioTrabajo> listar();

    public abstract List<HorarioTrabajo> listarPorLugarTrabajo(Integer idLugarTrabajo);

    public abstract List<HorarioTrabajo> listarPorParametros(HorarioTrabajo horario);

    public abstract HorarioTrabajo obtener(Integer idHorarioTrabajo);

}
