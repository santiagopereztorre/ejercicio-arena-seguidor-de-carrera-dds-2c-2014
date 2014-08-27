package ui;

import org.uqbar.commons.utils.Observable;

@Observable
public class SeguidorViewModel {
	
	public void navegar() {
		new NuevaMateriaView().open();
	}
}
