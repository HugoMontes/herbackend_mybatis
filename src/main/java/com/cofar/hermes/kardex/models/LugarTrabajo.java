/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cofar.hermes.kardex.models;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.Date;
import java.util.List;

/**
 * @author aduran
 */
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
public class LugarTrabajo {

    private Integer idLugarTrabajo;
    private Integer idSecretaria;

    private Integer idMedico;
    private String descripcion;
    private Integer nroPacientes;
    private Double costoConsulta;
    private String longitud;
    private String latitud;
    private String cargo;
    private Integer usuarioRegistro;
    private Integer usuarioModificacion;
    private Date fechaRegistro;
    private Date fechaModificacion;
    private Integer estado;
    private String nombreSecretaria;

    private List<HorarioTrabajo> lsthorarioTrabajo;


    public List<HorarioTrabajo> getLsthorarioTrabajo() {
        return lsthorarioTrabajo;
    }

    public void setLsthorarioTrabajo(List<HorarioTrabajo> lsthorarioTrabajo) {
        this.lsthorarioTrabajo = lsthorarioTrabajo;
    }

    public String getNombreSecretaria() {
        return nombreSecretaria;
    }

    public void setNombreSecretaria(String nombreSecretaria) {
        this.nombreSecretaria = nombreSecretaria;
    }



    public Integer getNroPacientes() {
        return nroPacientes;
    }

    public void setNroPacientes(Integer nroPacientes) {
        this.nroPacientes = nroPacientes;
    }

    public Integer getIdLugarTrabajo() {
        return idLugarTrabajo;
    }

    public void setIdLugarTrabajo(Integer idLugarTrabajo) {
        this.idLugarTrabajo = idLugarTrabajo;
    }

    public Integer getIdSecretaria() {
        return idSecretaria;
    }

    public void setIdSecretaria(Integer idSecretaria) {
        this.idSecretaria = idSecretaria;
    }

//    public Integer getIdDireccion() {
//        return idDireccion;
//    }
//
//    public void setIdDireccion(Integer idDireccion) {
//        this.idDireccion = idDireccion;
//    }

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

    public Double getCostoConsulta() {
        return costoConsulta;
    }

    public void setCostoConsulta(Double costoConsulta) {
        this.costoConsulta = costoConsulta;
    }

    public String getLongitud() {
        return longitud;
    }

    public void setLongitud(String longitud) {
        this.longitud = longitud;
    }

    public String getLatitud() {
        return latitud;
    }

    public void setLatitud(String latitud) {
        this.latitud = latitud;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
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
