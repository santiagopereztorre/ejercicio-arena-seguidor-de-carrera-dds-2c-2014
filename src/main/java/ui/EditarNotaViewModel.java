package ui;

import org.uqbar.commons.utils.Observable;

@Observable
public class EditarNotaViewModel {
	private String fecha;
	private String descripcion;
	private Boolean aprobado;
	
	public String getFecha() {
		return fecha;
	}
	
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	
	public String getDescripcion() {
		return descripcion;
	}
	
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	public Boolean getAprobado() {
		return aprobado;
	}
	
	public void setAprobado(Boolean aprobado) {
		this.aprobado = aprobado;
	}
	
	public void editar() {
		
	}

	public void cerrar(EditarNotaView editarNotaView) {
		editarNotaView.close();
	}

}
