package ui;

import java.util.List;

import org.uqbar.arena.windows.WindowOwner;
import org.uqbar.commons.utils.Observable;

import domain.Materia;

@Observable
public class SeguidorViewModel {
	
	private List<Materia> resultados;
	
	public List<Materia> getResultados() {
		return resultados;
	}

	public void setResultados(List<Materia> resultados) {
		this.resultados = resultados;
	}

	public void navegar(WindowOwner parent) {
		new NuevaMateriaView(parent).open();
	}
}
