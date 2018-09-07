package com.cofar.hermes.kardex.service;

import com.cofar.hermes.core.util.RegistrationResult;
import java.util.List;

import com.cofar.hermes.kardex.models.Direccion;

public interface DireccionService {

    public List<Direccion> listar();

    public List<Direccion> listarIdDescripcion();

    public List<Direccion> listarPorParametros(Direccion direccion);

    public Direccion obtener(Integer idDireccion);

    public RegistrationResult registrar(Direccion direccion);

    public RegistrationResult actualizar(Direccion direccion);

    public RegistrationResult eliminar(Direccion direccion);

}
