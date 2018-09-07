/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cofar.hermes.kardex.repository;

import com.cofar.hermes.kardex.models.Turno;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;

/**
 *
 * @author aduran
 */
@Mapper
public interface TurnoRepository {

    public abstract Integer registrar(Turno turno);

    public abstract Integer actualizar(Turno turno);

    public abstract List<Turno> listar();

    public abstract List<Turno> listarPorParametros(Turno turno);

    public abstract Turno obtener(Integer idTurno);

    public abstract Integer eliminar(Turno turno);

}
