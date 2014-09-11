package ui;

import org.uqbar.commons.utils.Observable;

import domain.Materia;
import domain.MateriasHome;

@Observable
public class NuevaMateriaViewModel {
	private String nombre;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void crear() {
		MateriasHome.getInstance().create(new Materia(nombre));
	}

	public void cerrar(NuevaMateriaView nuevaMateriaView) {
		nuevaMateriaView.close();
	}
}
