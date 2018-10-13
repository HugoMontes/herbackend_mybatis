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
public class FarmaciaReferencia {

    private Integer idFarmaciaReferencia;
    private String nombreFarmacia;
    private String direccionFarmacia;
    private Integer usuarioRegistro;
    private Integer usuarioModificacion;
    private Date fechaRegistro;
    private Date fechaModificacion;
    private Integer estado;

    public Integer getIdFarmaciaReferencia() {
        return idFarmaciaReferencia;
    }

    public void setIdFarmaciaReferencia(Integer idFarmaciaReferencia) {
        this.idFarmaciaReferencia = idFarmaciaReferencia;
    }

    public String getNombreFarmacia() {
        return nombreFarmacia;
    }

    public void setNombreFarmacia(String nombreFarmacia) {
        this.nombreFarmacia = nombreFarmacia;
    }

    public String getDireccionFarmacia() {
        return direccionFarmacia;
    }

    public void setDireccionFarmacia(String direccionFarmacia) {
        this.direccionFarmacia = direccionFarmacia;
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
