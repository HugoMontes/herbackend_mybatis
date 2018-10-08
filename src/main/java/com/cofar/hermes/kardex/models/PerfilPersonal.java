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
public class PerfilPersonal {

    private Integer idPerfilPersonal;
    private Integer idMedico;
    private String nombreConyugue;
    private String nombreHijosEdad;
    private String origenFamilia;
    private String gruposSociales;
    private String amigos;
    private String comidaPreferida;
    private String bebidaPreferida;
    private String mascota;
    private String tipoMusicaPreferida;
    private String instrumentoPreferido;
    private String gustosGenerales;
    private String hobbies;
    private Integer usuarioRegistro;
    private Integer usuarioModificacion;
    private Date fechaRegistro;
    private Date fechaModificacion;
    private int estado;

    public Integer getIdMedico() {
        return idMedico;
    }

    public void setIdMedico(Integer idMedico) {
        this.idMedico = idMedico;
    }

    public Integer getIdPerfilPersonal() {
        return idPerfilPersonal;
    }

    public void setIdPerfilPersonal(Integer idPerfilPersonal) {
        this.idPerfilPersonal = idPerfilPersonal;
    }

    public String getNombreConyugue() {
        return nombreConyugue;
    }

    public void setNombreConyugue(String nombreConyugue) {
        this.nombreConyugue = nombreConyugue;
    }

    public String getNombreHijosEdad() {
        return nombreHijosEdad;
    }

    public void setNombreHijosEdad(String nombreHijosEdad) {
        this.nombreHijosEdad = nombreHijosEdad;
    }

    public String getOrigenFamilia() {
        return origenFamilia;
    }

    public void setOrigenFamilia(String origenFamilia) {
        this.origenFamilia = origenFamilia;
    }

    public String getGruposSociales() {
        return gruposSociales;
    }

    public void setGruposSociales(String gruposSociales) {
        this.gruposSociales = gruposSociales;
    }

    public String getAmigos() {
        return amigos;
    }

    public void setAmigos(String amigos) {
        this.amigos = amigos;
    }

    public String getComidaPreferida() {
        return comidaPreferida;
    }

    public void setComidaPreferida(String comidaPreferida) {
        this.comidaPreferida = comidaPreferida;
    }

    public String getBebidaPreferida() {
        return bebidaPreferida;
    }

    public void setBebidaPreferida(String bebidaPreferida) {
        this.bebidaPreferida = bebidaPreferida;
    }

    public String getMascota() {
        return mascota;
    }

    public void setMascota(String mascota) {
        this.mascota = mascota;
    }

    public String getTipoMusicaPreferida() {
        return tipoMusicaPreferida;
    }

    public void setTipoMusicaPreferida(String tipoMusicaPreferida) {
        this.tipoMusicaPreferida = tipoMusicaPreferida;
    }

    public String getInstrumentoPreferido() {
        return instrumentoPreferido;
    }

    public void setInstrumentoPreferido(String instrumentoPreferido) {
        this.instrumentoPreferido = instrumentoPreferido;
    }

    public String getGustosGenerales() {
        return gustosGenerales;
    }

    public void setGustosGenerales(String gustosGenerales) {
        this.gustosGenerales = gustosGenerales;
    }

    public String getHobbies() {
        return hobbies;
    }

    public void setHobbies(String hobbies) {
        this.hobbies = hobbies;
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

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "PerfilPersonal [idPerfilPersonal=" + idPerfilPersonal + ", idMedico=" + idMedico + ", nombreConyugue="
				+ nombreConyugue + ", nombreHijosEdad=" + nombreHijosEdad + ", origenFamilia=" + origenFamilia
				+ ", gruposSociales=" + gruposSociales + ", amigos=" + amigos + ", comidaPreferida=" + comidaPreferida
				+ ", bebidaPreferida=" + bebidaPreferida + ", mascota=" + mascota + ", tipoMusicaPreferida="
				+ tipoMusicaPreferida + ", instrumentoPreferido=" + instrumentoPreferido + ", gustosGenerales="
				+ gustosGenerales + ", hobbies=" + hobbies + ", usuarioRegistro=" + usuarioRegistro
				+ ", usuarioModificacion=" + usuarioModificacion + ", fechaRegistro=" + fechaRegistro
				+ ", fechaModificacion=" + fechaModificacion + ", estado=" + estado + "]";
	}
    
    

}
