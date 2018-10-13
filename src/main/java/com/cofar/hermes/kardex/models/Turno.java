/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cofar.hermes.kardex.models;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.Date;

/**
 * @author aduran
 */
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
public class Turno {

    private Integer idTurno;
    private String descripcion;
    private Date horaAtencionInicio;
    private Date horaAtencionFin;
    private Integer estado;


    public Date getHoraAtencionInicio() {
        return horaAtencionInicio;
    }

    public void setHoraAtencionInicio(Date horaAtencionInicio) {
        this.horaAtencionInicio = horaAtencionInicio;
    }

    public Date getHoraAtencionFin() {
        return horaAtencionFin;
    }

    public void setHoraAtencionFin(Date horaAtencionFin) {
        this.horaAtencionFin = horaAtencionFin;
    }

    public Integer getIdTurno() {
        return idTurno;
    }

    public void setIdTurno(Integer idTurno) {
        this.idTurno = idTurno;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }


    public Integer getEstado() {
        return estado;
    }

    public void setEstado(Integer estado) {
        this.estado = estado;
    }

}
