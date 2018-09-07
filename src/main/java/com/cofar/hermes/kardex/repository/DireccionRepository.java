package com.cofar.hermes.kardex.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.cofar.hermes.kardex.models.Direccion;

@Mapper
public interface DireccionRepository {

    public List<Direccion> listar();

    public List<Direccion> listarPorParametros(Direccion direccion);

    public List<Direccion> listarIdDescripcion();

    public Direccion obtener(Integer idDireccion);

    public Integer registrar(Direccion direccion);

    public Integer actualizar(Direccion direccion);

    public Integer eliminar(Direccion direccion);

}
