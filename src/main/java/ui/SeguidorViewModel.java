package ui;

import org.uqbar.arena.windows.WindowOwner;
import org.uqbar.commons.utils.Observable;

@Observable
public class SeguidorViewModel {
	
	public void navegar(WindowOwner parent) {
		new NuevaMateriaView(parent).open();
	}
}
