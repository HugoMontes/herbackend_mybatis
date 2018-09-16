/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cofar.hermes.kardex.service;

import com.cofar.hermes.core.models.AdmUsuarioModel;
import java.util.List;

/**
 *
 * @author aduran
 */
public interface AdmUsuarioService {

    public List<AdmUsuarioModel> listar();

    public AdmUsuarioModel findByNombreUsuario(String nombreUsuario);

//    public AdmUsuarioModel obtenerUsuarioLogueado();

}
