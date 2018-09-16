/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cofar.hermes.kardex.serviceImpl;

import com.cofar.hermes.core.service.AdmUsuarioServiceLoguin;
import com.cofar.hermes.core.util.RegistrationResult;
import com.cofar.hermes.kardex.models.LugarTrabajo;
import com.cofar.hermes.kardex.repository.LugarTrabajoRpository;
import com.cofar.hermes.kardex.service.LugarTrabajoService;
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
public class LugarTrabajoServiceImpl implements LugarTrabajoService {
    
    @Autowired
    private LugarTrabajoRpository ltr;
    @Autowired
    private AdmUsuarioServiceLoguin loginService;
    @Override
    public RegistrationResult registrar(LugarTrabajo lugar) {
        RegistrationResult res = new RegistrationResult();
        res.setCode(ltr.registrar(lugar));
        res.setMessage("Se ha Registrado Lugar de Trabajo Correctamente ");
        return res;
    }
    
    @Override
    public RegistrationResult actualizar(LugarTrabajo lugar) {
        RegistrationResult res = new RegistrationResult();
        res.setCode(ltr.actualizar(lugar));
        res.setMessage("Se ha Actualizado Lugar de Trabajo Correctamente ");
        return res;
    }
    
    @Override
    public RegistrationResult eliminar(Integer idLugarTrabajo) {
        RegistrationResult res = new RegistrationResult();
        res.setCode(ltr.eliminar(idLugarTrabajo));
        res.setMessage("Se ha Eliminado Lugar de Trabajo Correctamente ");
        return res;
    }
    
    @Override
    public List<LugarTrabajo> listar() {
        return ltr.listar();
    }
    
    @Override
    public List<LugarTrabajo> listarPorParametros(LugarTrabajo lugar) {
        return ltr.listarPorParametros(lugar);
    }
    
    @Override
    public LugarTrabajo obtener(Integer idLugarTrabajo) {
        return ltr.obtener(idLugarTrabajo);
    }
    
}
