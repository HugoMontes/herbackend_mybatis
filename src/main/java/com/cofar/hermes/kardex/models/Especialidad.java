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
//@JsonInclude(Include.NON_NULL)
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
public class Especialidad {

    private Integer idEspecialidad;
    private Integer idMedico;
    private String descripcion;
    private Date fechaObtencionEspecialidad;
    private String lugarObtencionEspecialidad;
    private Integer usuarioRegistro;
    private Integer usuarioModificacion;
    private Date fechaRegistro;
    private Date fechaModificacion;

    public Integer getIdEspecialidad() {
        return idEspecialidad;
    }

    public void setIdEspecialidad(Integer idEspecialidad) {
        this.idEspecialidad = idEspecialidad;
    }

    public Integer getIdMedico() {
        return idMedico;
    }

    public void setIdMedico(Integer idMedico) {
        this.idMedico = idMedico;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFechaObtencionEspecialidad() {
        return fechaObtencionEspecialidad;
    }

    public void setFechaObtencionEspecialidad(Date fechaObtencionEspecialidad) {
        this.fechaObtencionEspecialidad = fechaObtencionEspecialidad;
    }

    public String getLugarObtencionEspecialidad() {
        return lugarObtencionEspecialidad;
    }

    public void setLugarObtencionEspecialidad(String lugarObtencionEspecialidad) {
        this.lugarObtencionEspecialidad = lugarObtencionEspecialidad;
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

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
    private int estado;

}
