/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cofar.hermes.kardex.repository;

import com.cofar.hermes.kardex.models.Secretaria;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;

/**
 *
 * @author aduran
 */
@Mapper
public interface SecretariaRepository {

    public abstract Integer registrar(Secretaria secretaria);

    public abstract Integer actualizar(Secretaria secretaria);

    public abstract List<Secretaria> listar();

    public abstract List<Secretaria> listarPorParametros(Secretaria secretaria);

    public abstract Secretaria obtener(Integer idSecretaria);

    public abstract Integer eliminar(Secretaria secretaria);

}
