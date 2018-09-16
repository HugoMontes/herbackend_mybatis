/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cofar.hermes.kardex.models;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 *
 * @author aduran
 */
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
public class FarmaciaRefMedico {

    private Integer idFarmaciaRefMedico;
    private Integer idMedico;
    private Integer idFarmaciaReferencia;
    private int estado;

    public Integer getIdFarmaciaRefMedico() {
        return idFarmaciaRefMedico;
    }

    public void setIdFarmaciaRefMedico(Integer idFarmaciaRefMedico) {
        this.idFarmaciaRefMedico = idFarmaciaRefMedico;
    }

    public Integer getIdMedico() {
        return idMedico;
    }

    public void setIdMedico(Integer idMedico) {
        this.idMedico = idMedico;
    }

    public Integer getIdFarmaciaReferencia() {
        return idFarmaciaReferencia;
    }

    public void setIdFarmaciaReferencia(Integer idFarmaciaReferencia) {
        this.idFarmaciaReferencia = idFarmaciaReferencia;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

}
