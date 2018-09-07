/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cofar.hermes.kardex.repository;

import com.cofar.hermes.kardex.models.EstadoCivil;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;

/**
 *
 * @author aduran
 */
@Mapper
public interface EstadoCivilRepository {

    public abstract Integer registrar(EstadoCivil estadoCivil);

    public abstract Integer actualizar(EstadoCivil estadoCivil);

    public abstract Integer eliminar(Integer idEstadoCivil);

    public abstract List<EstadoCivil> listar();

    public abstract List<EstadoCivil> listarIdDescripcion();

    public abstract List<EstadoCivil> listarPorParametroa(EstadoCivil estadoCivil);

    public abstract EstadoCivil obtener(Integer idEstadoCivil);

}
