/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cofar.hermes.kardex.serviceImpl;

import com.cofar.hermes.core.service.AdmUsuarioServiceLoguin;
import com.cofar.hermes.core.util.RegistrationResult;
import com.cofar.hermes.kardex.models.Producto;
import com.cofar.hermes.kardex.repository.ProductoRepository;
import com.cofar.hermes.kardex.service.ProductoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author aduran
 */
@Service
@Transactional
public class ProductoServiceImpl implements ProductoService {

    @Autowired
    private ProductoRepository pr;
    @Autowired
    private AdmUsuarioServiceLoguin loginService;
    @Override
    public RegistrationResult registrar(Producto producto) {
        RegistrationResult res = new RegistrationResult();
        res.setCode(pr.registrar(producto));
        res.setMessage("Se ha Registrado Producto Correctamente ");
        return res;
    }

    @Override
    public RegistrationResult actualizar(Producto producto) {
        RegistrationResult res = new RegistrationResult();
        res.setCode(pr.registrar(producto));
        res.setMessage("Se ha Actualizado Producto Correctamente ");
        return res;
    }

    @Override
    public List<Producto> listarPorParametros(Producto producto) {
        return pr.listarPorParametros(producto);
    }

    @Override
    public List<Producto> listar() {
        return pr.listar();
    }

    @Override
    public Producto obtener(Integer idProducto) {
        return pr.obtener(idProducto);
    }

    @Override
    public RegistrationResult eliminar(Integer idProducto) {
        RegistrationResult res = new RegistrationResult();
        res.setCode(pr.eliminar(idProducto));
        res.setMessage("Se ha Eliminado Producto Correctamente ");
        return res;
    }

}
