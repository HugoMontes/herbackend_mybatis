/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cofar.hermes.kardex.repository;

import com.cofar.hermes.kardex.models.Linea;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;

/**
 *
 * @author aduran
 */
@Mapper
public interface LineaRepository {

    public Integer registrar(Linea linea);

    public Integer actualizar(Linea linea);

    public Integer eliminar(Integer idLinea);

    public List<Linea> listar();

    public List<Linea> listarPorParametros(Linea linea);

    public Linea obtener(Integer idLinea);

}
