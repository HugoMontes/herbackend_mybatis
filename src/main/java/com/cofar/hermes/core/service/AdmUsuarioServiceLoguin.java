package com.cofar.hermes.core.service;

import java.util.List;

import com.cofar.hermes.core.models.AdmUsuarioModel;
import com.cofar.hermes.core.repository.AdmUsuarioRepository;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class AdmUsuarioServiceLoguin implements UserDetailsService {

    @Autowired
//    @Qualifier("admUsuarioRepository")
    private AdmUsuarioRepository repository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        AdmUsuarioModel user = repository.findByNombreUsuario(username);

        System.out.println("====> AUTH=================");
        System.out.println("1: " + user.getNombreUsuario());
        System.out.println("2: " + user.getContrasenia());
        System.out.println("3: " + user.getEstado());

        if (user != null) {
            return new User(user.getNombreUsuario(), user.getContrasenia(), user.getActivo(), user.getActivo(), user.getActivo(),
                    user.getActivo(), buildGranted(user.getRol()));
        }
        throw new UsernameNotFoundException(username);
    }

    public List<GrantedAuthority> buildGranted(byte rol) {
        String[] roles = {"LECTOR", "USUARIO", "ADMINISTRADOR"};
        List<GrantedAuthority> auths = new ArrayList<>();
        for (int i = 0; i < rol; i++) {
            auths.add(new SimpleGrantedAuthority(roles[i]));
        }
        return auths;
    }


    public AdmUsuarioModel obtenerUsuarioLogueado() {
        AdmUsuarioModel adm = repository.findByNombreUsuario(getUserLogged());
        return adm;

    }

    public Integer obtenerIdUsuarioLogueado() {
        AdmUsuarioModel adm = repository.findByNombreUsuario(getUserLogged());
        return adm.getIdUsuario();

    }


    public String getUserLogged() {
        String userName = null;
        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        if (principal instanceof UserDetails) {
            userName = ((UserDetails) principal).getUsername();
        } else {
            userName = principal.toString();
        }
        return userName;
    }

}
