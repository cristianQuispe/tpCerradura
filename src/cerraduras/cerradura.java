package cerraduras;

public class cerradura {
private boolean estado=false;
private Integer contraseña;
private boolean bloqueoActivado=false;

private Integer cantidaPermitidaDeErrores;
private Integer contadorExitoso=0;
private Integer contadorFallidos=0;

	public cerradura(Integer claveDeApertura,Integer cantidadDeFallosConsecutivosQueLaBloquean){
		this.contraseña=claveDeApertura;
		this.cantidaPermitidaDeErrores=cantidadDeFallosConsecutivosQueLaBloquean;
		
	}
	public cerradura(Integer claveDeApertura){
		this.contraseña=claveDeApertura;
	    this.cantidaPermitidaDeErrores=1;
		
	}
	
	public boolean abrir(Integer clave) {
		if(contraseña==clave&&bloqueoActivado==false) {
			this.estado=true;
			contarAperturasExitosas();
			
			return true;
			
		}else {
			contarAperturasFallidas();
			return false;
		}
	}
	public void cerrar() {
		this.estado=false;
	}
	public boolean estaAbierta() {
		if(estado==true) {
			return true;
			
		}else return false;
	}
    public boolean estaCerrada() {
    	if(estado==false) {
			return true;
		}else return false;
	}

public Integer contarAperturasExitosas() {
	this.contadorExitoso++;
	return this.contadorExitoso;
	
}
public Integer contarAperturasFallidas() {
	this.contadorFallidos++;
	if (this.contadorFallidos>cantidaPermitidaDeErrores) {
		this.bloqueoActivado=true;
	}
	return this.contadorFallidos;
}
//geters y setters
public boolean isEstado() {
	return estado;
}
public void setEstado(boolean estado) {
	this.estado = estado;
}
public Integer getContraseña() {
	return contraseña;
}
public void setContraseña(Integer contraseña) {
	this.contraseña = contraseña;
}
public boolean isBloqueoActivado() {
	return bloqueoActivado;
}
public void setBloqueoActivado(boolean bloqueoActivado) {
	this.bloqueoActivado = bloqueoActivado;
}
public Integer getCantidaPermitidaDeErrores() {
	return cantidaPermitidaDeErrores;
}
public void setCantidaPermitidaDeErrores(Integer cantidaPermitidaDeErrores) {
	this.cantidaPermitidaDeErrores = cantidaPermitidaDeErrores;
}
public Integer getContadorExitoso() {
	return contadorExitoso;
}
public void setContadorExitoso(Integer contadorExitoso) {
	this.contadorExitoso = contadorExitoso;
}
public Integer getContadorFallidos() {
	return contadorFallidos;
}
public void setContadorFallidos(Integer contadorFallidos) {
	this.contadorFallidos = contadorFallidos;
}

}
