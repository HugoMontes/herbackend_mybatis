/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cofar.hermes.kardex.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import java.util.Date;
import java.util.List;

/**
 *
 * @author aduran
 */
//@JsonInclude(Include.NON_NULL)
@JsonInclude(Include.NON_DEFAULT)
public class Medico {

    private Integer idMedico;
    private Integer idPerfilProfesional;
    private Integer idPerfilPsicografico;
    private Integer idPerfilPersonal;
    private Integer idEstadoCivil;
    private Integer idRegional;
    private String apPaterno;
    private String apMaterno;
    private String nombres;
    private Date fechaNacimiento;
    private String telefono;
    private String celular;
    private String correoElectronico;
    private int genero;
    private String nombreHijosEdad;
    private Integer usuarioRegistro;
    private Integer usuarioModificacion;
    private Date fechaRegistro;
    private Date fechaModificacion;
    private int estado;

    private List<Especialidad> lstEspecialidad;
    private List<Linea> lstLinea;

    public List<Especialidad> getLstEspecialidad() {
        return lstEspecialidad;
    }

    public void setLstEspecialidad(List<Especialidad> lstEspecialidad) {
        this.lstEspecialidad = lstEspecialidad;
    }

    public List<Linea> getLstLinea() {
        return lstLinea;
    }

    public void setLstLinea(List<Linea> lstLinea) {
        this.lstLinea = lstLinea;
    }

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

    public Integer getIdPerfilPsicografico() {
        return idPerfilPsicografico;
    }

    public void setIdPerfilPsicografico(Integer idPerfilPsicografico) {
        this.idPerfilPsicografico = idPerfilPsicografico;
    }

    public Integer getIdPerfilPersonal() {
        return idPerfilPersonal;
    }

    public void setIdPerfilPersonal(Integer idPerfilPersonal) {
        this.idPerfilPersonal = idPerfilPersonal;
    }

    public Integer getIdEstadoCivil() {
        return idEstadoCivil;
    }

    public void setIdEstadoCivil(Integer idEstadoCivil) {
        this.idEstadoCivil = idEstadoCivil;
    }

    public Integer getIdRegional() {
        return idRegional;
    }

    public void setIdRegional(Integer idRegional) {
        this.idRegional = idRegional;
    }

    public String getApPaterno() {
        return apPaterno;
    }

    public void setApPaterno(String apPaterno) {
        this.apPaterno = apPaterno;
    }

    public String getApMaterno() {
        return apMaterno;
    }

    public void setApMaterno(String apMaterno) {
        this.apMaterno = apMaterno;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public int getGenero() {
        return genero;
    }

    public void setGenero(int genero) {
        this.genero = genero;
    }

    public String getNombreHijosEdad() {
        return nombreHijosEdad;
    }

    public void setNombreHijosEdad(String nombreHijosEdad) {
        this.nombreHijosEdad = nombreHijosEdad;
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

}
