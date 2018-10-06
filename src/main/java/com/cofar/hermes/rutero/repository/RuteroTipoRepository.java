package com.cofar.hermes.rutero.repository;

import com.cofar.hermes.rutero.models.RuteroTipo;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;


/**
 * @author Al?a?o Dur?n
 **/
//@Repository
@Mapper
public interface RuteroTipoRepository {

    List<RuteroTipo> listarPorParametros(RuteroTipo ruteroTipo);

    RuteroTipo obtener(Integer idRuteroTipo);

    Integer registrar(RuteroTipo ruteroTipo);

    Integer actualizar(RuteroTipo ruteroTipo);

    Integer eliminar(Integer idRuteroTipo);
}