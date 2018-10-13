package com.cofar.hermes.rutero.models;
import java.util.Date;

/**
 *
 * @author Al?a?o Dur?n
 **/


public class Contacto{

private Integer idContacto;
private Integer idMedEspe;
private Integer idRutero;
private int nro;
private int orden;
private Date fechaVisita;
private Integer estado;


public Integer getIdContacto() 
{
    return idContacto;
}

public void setIdContacto (Integer idContacto)
{
   this.idContacto= idContacto;
}

public Integer getIdMedEspe() 
{
    return idMedEspe;
}

public void setIdMedEspe (Integer idMedEspe)
{
   this.idMedEspe= idMedEspe;
}

public Integer getIdRutero() 
{
    return idRutero;
}

public void setIdRutero (Integer idRutero)
{
   this.idRutero= idRutero;
}

public int getNro() 
{
    return nro;
}

public void setNro (int nro)
{
   this.nro= nro;
}

public int getOrden() 
{
    return orden;
}

public void setOrden (int orden)
{
   this.orden= orden;
}

public Date getFechaVisita()
{
    return fechaVisita;
}

public void setFechaVisita (Date fechaVisita)
{
     this.fechaVisita= fechaVisita;
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