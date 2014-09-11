package ui;

import java.util.List;

import org.uqbar.arena.windows.WindowOwner;
import org.uqbar.commons.model.ObservableUtils;
import org.uqbar.commons.utils.Observable;

import domain.Materia;
import domain.MateriasHome;

@Observable
public class SeguidorViewModel {
	
	public List<Materia> getResultados() {
		return MateriasHome.getInstance().allInstances();
	}

	public void navegar(WindowOwner parent) {
		new NuevaMateriaView(parent).open();
		ObservableUtils.firePropertyChanged(this, "resultados", getResultados());
	}
}
