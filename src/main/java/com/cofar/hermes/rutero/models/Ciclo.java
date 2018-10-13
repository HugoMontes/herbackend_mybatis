package com.cofar.hermes.rutero.models;
import java.util.Date;

/**
 *
 * @author Al?a?o Dur?n
 **/


public class Ciclo{

private Integer idCiclo;
private Integer idRegional;
private Integer idRutero;
private String descripcion;
private Date fechaInicio;
private Date fechaFin;
private int nro;
private Date fechaCiclo;
private Integer estado;


public Integer getIdCiclo() 
{
    return idCiclo;
}

public void setIdCiclo (Integer idCiclo)
{
   this.idCiclo= idCiclo;
}

public Integer getIdRegional() 
{
    return idRegional;
}

public void setIdRegional (Integer idRegional)
{
   this.idRegional= idRegional;
}

public Integer getIdRutero() 
{
    return idRutero;
}

public void setIdRutero (Integer idRutero)
{
   this.idRutero= idRutero;
}

public String getDescripcion() 
{
    return descripcion;
}

public void setDescripcion (String descripcion)
{
   this.descripcion= descripcion;
}

public Date getFechaInicio()
{
    return fechaInicio;
}

public void setFechaInicio (Date fechaInicio)
{
     this.fechaInicio= fechaInicio;
}

public Date getFechaFin()
{
    return fechaFin;
}

public void setFechaFin (Date fechaFin)
{
     this.fechaFin= fechaFin;
}

public int getNro() 
{
    return nro;
}

public void setNro (int nro)
{
   this.nro= nro;
}

public Date getFechaCiclo()
{
    return fechaCiclo;
}

public void setFechaCiclo (Date fechaCiclo)
{
     this.fechaCiclo= fechaCiclo;
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