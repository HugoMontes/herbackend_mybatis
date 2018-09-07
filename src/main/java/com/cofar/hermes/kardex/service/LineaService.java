/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cofar.hermes.kardex.service;

import com.cofar.hermes.core.util.RegistrationResult;
import com.cofar.hermes.kardex.models.Linea;
import java.util.List;

/**
 *
 * @author aduran
 */
public interface LineaService {

    public RegistrationResult registrar(Linea linea);

    public RegistrationResult actualizar(Linea linea);

    public RegistrationResult eliminar(Integer idLinea);

    public List<Linea> listar();

    public List<Linea> listarPorParametros(Linea linea);

    public Linea obtener(Integer idLinea);

}
