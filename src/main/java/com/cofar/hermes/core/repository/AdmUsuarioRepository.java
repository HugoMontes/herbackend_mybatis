package com.cofar.hermes.core.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.cofar.hermes.core.models.AdmUsuarioModel;

@Mapper
public interface AdmUsuarioRepository {

    public List<AdmUsuarioModel> listar();

    public AdmUsuarioModel findByNombreUsuario(String nombreUsuario);

}
