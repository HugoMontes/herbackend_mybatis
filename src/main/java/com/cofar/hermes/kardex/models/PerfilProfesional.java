/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cofar.hermes.kardex.models;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.Date;

/**
 *
 * @author aduran
 */
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
public class PerfilProfesional {

    private Integer idPerfilProfesional;
    private Integer idMedico;
    private String institucion;
    private String colegas;
    private Integer usuarioRegistro;
    private Integer usuarioModificacion;
    private Date fechaRegistro;
    private Date fechaModificacion;
    private Integer estado;

    public Integer getIdMedico() {
        return idMedico;
    }

    public void setIdMedico(Integer idMedico) {
        this.idMedico = idMedico;
    }

    public Integer getIdPerfilProfesional() {
        return idPerfilProfesional;
    }

    public void setIdPerfilProfesional(Integer idPerfilProfesional) {
        this.idPerfilProfesional = idPerfilProfesional;
    }

    public String getInstitucion() {
        return institucion;
    }

    public void setInstitucion(String institucion) {
        this.institucion = institucion;
    }

    public String getColegas() {
        return colegas;
    }

    public void setColegas(String colegas) {
        this.colegas = colegas;
    }

    public Integer getUsuarioRegistro() {
        return usuarioRegistro;
    }

    public void setUsuarioRegistro(Integer usuarioRegistro) {
        this.usuarioRegistro = usuarioRegistro;
    }

    public Integer getUsuarioModificacion() {
        return usuarioModificacion;
    }

    public void setUsuarioModificacion(Integer usuarioModificacion) {
        this.usuarioModificacion = usuarioModificacion;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public Date getFechaModificacion() {
        return fechaModificacion;
    }

    public void setFechaModificacion(Date fechaModificacion) {
        this.fechaModificacion = fechaModificacion;
    }

    public Integer getEstado() {
        return estado;
    }

    public void setEstado(Integer estado) {
        this.estado = estado;
    }

}
