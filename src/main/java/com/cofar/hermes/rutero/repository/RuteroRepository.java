package com.cofar.hermes.rutero.repository;

import com.cofar.hermes.rutero.models.Rutero;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;


/**
 * @author Al?a?o Dur?n
 **/
//@Repository
@Mapper
public interface RuteroRepository {

    List<Rutero> listarPorParametros(Rutero rutero);

    Rutero obtener(Integer idRutero);

    Integer registrar(Rutero rutero);

    Integer actualizar(Rutero rutero);

    Integer eliminar(Integer idRutero);
}