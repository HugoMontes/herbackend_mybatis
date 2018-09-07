/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cofar.hermes.kardex.service;

import com.cofar.hermes.core.util.RegistrationResult;
import com.cofar.hermes.kardex.models.Producto;
import java.util.List;

/**
 *
 * @author aduran
 */
public interface ProductoService {

    public abstract RegistrationResult registrar(Producto producto);

    public abstract RegistrationResult actualizar(Producto producto);

    public abstract List<Producto> listarPorParametros(Producto producto);

    public abstract List<Producto> listar();

    public abstract Producto obtener(Integer idProducto);

    public abstract RegistrationResult eliminar(Integer idProducto);

}
