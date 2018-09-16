package com.cofar.hermes.kardex.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cofar.hermes.core.models.AdmUsuarioModel;
import com.cofar.hermes.core.repository.AdmUsuarioRepository;
import com.cofar.hermes.core.service.AdmUsuarioServiceLoguin;
import com.cofar.hermes.kardex.service.AdmUsuarioService;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;

@Service
@Transactional
public class AdmUsuarioServiceImpl implements AdmUsuarioService {
    
    @Autowired
    private AdmUsuarioRepository admUsuarioRepository;
    @Autowired
    private AdmUsuarioServiceLoguin admUsuarioServiceLoguin;
    
    @Override
    public List<AdmUsuarioModel> listar() {
        
        return admUsuarioRepository.listar();
    }
    
    @Override
    public AdmUsuarioModel findByNombreUsuario(String nombreUsuario) {
        return admUsuarioRepository.findByNombreUsuario(nombreUsuario);
    }
}
