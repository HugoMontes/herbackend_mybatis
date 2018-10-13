package com.cofar.hermes.rutero.models;
import java.util.Date;

/**
 *
 * @author Al?a?o Dur?n
 **/


public class Calendario{

private Integer idCalendario;
private Integer idCiclo;
private Integer idTipoCalendario;
private String descripcion;
private Date fechaInhabiliado;
private Integer usuarioRegistro;
private Integer usuarioModificacion;
private Date fechaRegistro;
private Date fechaModificacion;
private Integer estado;


public Integer getIdCalendario() 
{
    return idCalendario;
}

public void setIdCalendario (Integer idCalendario)
{
   this.idCalendario= idCalendario;
}

public Integer getIdCiclo() 
{
    return idCiclo;
}

public void setIdCiclo (Integer idCiclo)
{
   this.idCiclo= idCiclo;
}

public Integer getIdTipoCalendario() 
{
    return idTipoCalendario;
}

public void setIdTipoCalendario (Integer idTipoCalendario)
{
   this.idTipoCalendario= idTipoCalendario;
}

public String getDescripcion() 
{
    return descripcion;
}

public void setDescripcion (String descripcion)
{
   this.descripcion= descripcion;
}

public Date getFechaInhabiliado()
{
    return fechaInhabiliado;
}

public void setFechaInhabiliado (Date fechaInhabiliado)
{
     this.fechaInhabiliado= fechaInhabiliado;
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