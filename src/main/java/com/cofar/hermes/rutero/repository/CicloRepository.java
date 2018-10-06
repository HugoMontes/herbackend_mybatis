package com.cofar.hermes.rutero.repository;

import com.cofar.hermes.rutero.models.Ciclo;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;


/**
 * @author Al?a?o Dur?n
 **/
//@Repository
@Mapper
public interface CicloRepository {

    List<Ciclo> listarPorParametros(Ciclo ciclo);

    Ciclo obtener(Integer idCiclo);

    Integer registrar(Ciclo ciclo);

    Integer actualizar(Ciclo ciclo);

    Integer eliminar(Integer idCiclo);
}