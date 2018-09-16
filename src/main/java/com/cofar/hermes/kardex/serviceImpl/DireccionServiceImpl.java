package com.cofar.hermes.kardex.serviceImpl;

import com.cofar.hermes.core.models.AdmUsuarioModel;
import com.cofar.hermes.core.repository.AdmUsuarioRepository;
import com.cofar.hermes.core.service.AdmUsuarioServiceLoguin;
import com.cofar.hermes.core.util.RegistrationResult;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cofar.hermes.kardex.models.Direccion;
import com.cofar.hermes.kardex.repository.DireccionRepository;
import com.cofar.hermes.kardex.service.DireccionService;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;

@Service
@Transactional
public class DireccionServiceImpl implements DireccionService {

    @Autowired
    private DireccionRepository direccionRepository;

    @Autowired
    private AdmUsuarioServiceLoguin loginService;

    @Override
    public List<Direccion> listar() {
        // TODO Auto-generated method stub
        return direccionRepository.listar();
    }

    @Override
    public Direccion obtener(Integer idDireccion) {
        return direccionRepository.obtener(idDireccion);
    }

    @Override
    public RegistrationResult registrar(Direccion direccion) {
        RegistrationResult res = new RegistrationResult();
//      res.setCode(direccionRepository.registrar(direccion));
//      res.setMessage("La Direccion ha sido Registrada correctamente");

        System.out.println("User : " + loginService.obtenerIdUsuarioLogueado());

        res.setCode(1);
        return res;
    }

    @Override
    public RegistrationResult actualizar(Direccion direccion) {
        RegistrationResult res = new RegistrationResult();

        res.setCode(direccionRepository.actualizar(direccion));
        res.setMessage("La Direccion ha sido Actaulizada correctamente");
        return res;
    }

    @Override
    public RegistrationResult eliminar(Direccion direccion) {
        RegistrationResult res = new RegistrationResult();

        res.setCode(direccionRepository.eliminar(direccion));
        res.setMessage("La Direccion ha sido Eliminado correctamente");
        return res;
    }

    @Override
    public List<Direccion> listarPorParametros(Direccion direccion) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private String getUserLoguedSpring() {
        String userName = null;
        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        if (principal instanceof UserDetails) {
            userName = ((UserDetails) principal).getUsername();
        } else {
            userName = principal.toString();
        }
        return userName;
    }

    @Override
    public List<Direccion> listarIdDescripcion() {
        return direccionRepository.listarIdDescripcion();
    }

}
