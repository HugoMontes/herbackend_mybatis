package com.cofar.hermes.kardex.models;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.Date;

/**
 * @author Al?a?o Dur?n
 **/

@JsonInclude(JsonInclude.Include.NON_DEFAULT)
public class MedEspe {

    private Integer idMedEspe;
    private Integer idMedico;
    private Integer idEspecialidad;
    private Integer idCategoria;
    private Date fechaObtencionEspecialidad;
    private String lugarObtencionEspecialidad;
    private Integer usuarioRegistro;
    private Integer usuarioModificacion;
    private Date fechaRegistro;
    private Date fechaModificacion;
    private Integer estado;


    public Integer getIdMedEspe() {
        return idMedEspe;
    }

    public void setIdMedEspe(Integer idMedEspe) {
        this.idMedEspe = idMedEspe;
    }

    public Integer getIdMedico() {
        return idMedico;
    }

    public void setIdMedico(Integer idMedico) {
        this.idMedico = idMedico;
    }

    public Integer getIdEspecialidad() {
        return idEspecialidad;
    }

    public void setIdEspecialidad(Integer idEspecialidad) {
        this.idEspecialidad = idEspecialidad;
    }

    public Integer getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(Integer idCategoria) {
        this.idCategoria = idCategoria;
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

    public Integer getEstado() {
        return estado;
    }

    public void setEstado(Integer estado) {
        this.estado = estado;
    }

}