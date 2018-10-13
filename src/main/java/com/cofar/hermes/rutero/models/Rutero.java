package com.cofar.hermes.rutero.models;
import java.util.Date;

/**
 *
 * @author Al?a?o Dur?n
 **/


public class Rutero{

private Integer idRutero;
private Integer idRuteroTipo;
private String nombreRutero;
private int estadoAprobacion;
private Integer gestion;
private Integer usuarioRegistro;
private Integer usuarioModificacion;
private Date fechaRegistro;
private Date fechaModificacion;
private Integer estado;


public Integer getIdRutero() 
{
    return idRutero;
}

public void setIdRutero (Integer idRutero)
{
   this.idRutero= idRutero;
}

public Integer getIdRuteroTipo() 
{
    return idRuteroTipo;
}

public void setIdRuteroTipo (Integer idRuteroTipo)
{
   this.idRuteroTipo= idRuteroTipo;
}

public String getNombreRutero() 
{
    return nombreRutero;
}

public void setNombreRutero (String nombreRutero)
{
   this.nombreRutero= nombreRutero;
}

public int getEstadoAprobacion() 
{
    return estadoAprobacion;
}

public void setEstadoAprobacion (int estadoAprobacion)
{
   this.estadoAprobacion= estadoAprobacion;
}

public Integer getGestion() 
{
    return gestion;
}

public void setGestion (Integer gestion)
{
   this.gestion= gestion;
}

public Integer getUsuarioRegistro() 
{
    return usuarioRegistro;
}

public void setUsuarioRegistro (Integer usuarioRegistro)
{
   this.usuarioRegistro= usuarioRegistro;
}

public Integer getUsuarioModificacion() 
{
    return usuarioModificacion;
}

public void setUsuarioModificacion (Integer usuarioModificacion)
{
   this.usuarioModificacion= usuarioModificacion;
}

public Date getFechaRegistro()
{
    return fechaRegistro;
}

public void setFechaRegistro (Date fechaRegistro)
{
     this.fechaRegistro= fechaRegistro;
}

public Date getFechaModificacion()
{
    return fechaModificacion;
}

public void setFechaModificacion (Date fechaModificacion)
{
     this.fechaModificacion= fechaModificacion;
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