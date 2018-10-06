package com.cofar.hermes.rutero.repository;

import com.cofar.hermes.rutero.models.Contacto;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;


/**
 * @author Al?a?o Dur?n
 **/
//@Repository
@Mapper
public interface ContactoRepository {

    List<Contacto> listarPorParametros(Contacto contacto);

    Contacto obtener(Integer idContacto);

    Integer registrar(Contacto contacto);

    Integer actualizar(Contacto contacto);

    Integer eliminar(Integer idContacto);
}