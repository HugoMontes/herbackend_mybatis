package com.cofar.hermes.rutero.repository;

import com.cofar.hermes.rutero.models.Calendario;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;


/**
 * @author Al?a?o Dur?n
 **/
//@Repository
@Mapper
public interface CalendarioRepository {

    List<Calendario> listarPorParametros(Calendario calendario);

    Calendario obtener(Integer idCalendario);

    Integer registrar(Calendario calendario);

    Integer actualizar(Calendario calendario);

    Integer eliminar(Integer idCalendario);
}