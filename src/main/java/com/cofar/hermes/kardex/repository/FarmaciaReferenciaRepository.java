/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cofar.hermes.kardex.repository;

import com.cofar.hermes.kardex.models.FarmaciaReferencia;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;

/**
 *
 * @author aduran
 */
@Mapper
public interface FarmaciaReferenciaRepository {

    public abstract Integer registrar(FarmaciaReferencia farmacia);

    public abstract Integer actualizar(FarmaciaReferencia farmacia);

    public abstract Integer eliminar(Integer idFarmaciaReferencia);

    public abstract List<FarmaciaReferencia> listar();

    public abstract List<FarmaciaReferencia> listarPorParametros(FarmaciaReferencia farmacia);

    public abstract FarmaciaReferencia obtener(Integer idFarmaciaReferencia);

}
