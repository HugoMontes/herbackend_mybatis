/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cofar.hermes.kardex.repository;

import com.cofar.hermes.kardex.models.Producto;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;

/**
 *
 * @author aduran
 */
@Mapper
public interface ProductoRepository {

    public abstract Integer registrar(Producto prducto);

    public abstract Integer actualizar(Producto prducto);

    public abstract List<Producto> listarPorParametros(Producto prducto);

    public abstract List<Producto> listar();

    public abstract Producto obtener(Integer idProducto);

    public abstract Integer eliminar(Integer idProducto);

}
