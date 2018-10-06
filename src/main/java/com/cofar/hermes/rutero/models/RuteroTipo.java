package com.cofar.hermes.rutero.models;

/**
 *
 * @author Al?a?o Dur?n
 **/


public class RuteroTipo{

private Integer idRuteroTipo;
private String descripcion;
private Integer estado;


public Integer getIdRuteroTipo() 
{
    return idRuteroTipo;
}

public void setIdRuteroTipo (Integer idRuteroTipo)
{
   this.idRuteroTipo= idRuteroTipo;
}

public String getDescripcion() 
{
    return descripcion;
}

public void setDescripcion (String descripcion)
{
   this.descripcion= descripcion;
}

public Integer getEstado() 
{
    return estado;
}

public void setEstado (Integer estado)
{
   this.estado= estado;
}

}