package domain;

import org.uqbar.commons.model.Entity;
import org.uqbar.commons.utils.Observable;

@SuppressWarnings("serial")
@Observable
public class Materia extends Entity {
	private String nombre;
	
	public Materia() {
		// TODO Auto-generated constructor stub
	}
	
	public Materia(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
