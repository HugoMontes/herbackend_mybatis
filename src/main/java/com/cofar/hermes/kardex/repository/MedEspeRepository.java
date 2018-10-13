package com.cofar.hermes.kardex.repository;

import com.cofar.hermes.kardex.models.MedEspe;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;


/**
 * @author Al?a?o Dur?n
 **/
//@Repository
@Mapper
public interface MedEspeRepository {

    List<MedEspe> listarPorParametros(MedEspe medEspe);

    List<MedEspe> listar();

    MedEspe obtener(Integer idMedEspe);

    Integer registrar(MedEspe medEspe);

    Integer actualizar(MedEspe medEspe);

    Integer eliminar(Integer idMedEspe);
}