package ui;

import org.uqbar.arena.layout.*;
import org.uqbar.arena.widgets.*;
import org.uqbar.arena.windows.Window;
import org.uqbar.arena.windows.WindowOwner;

@SuppressWarnings("serial")
public class NuevaMateriaView extends Window<NuevaMateriaViewModel> {

	public NuevaMateriaView(WindowOwner parent) {
		super(parent, new NuevaMateriaViewModel());
	}

	@Override
	public void createContents(Panel mainPanel) {
	  
		Panel primerPanel = new Panel(mainPanel);
		primerPanel.setLayout(new HorizontalLayout());
	  
		new Label(primerPanel).setText("Nombre:");
		new TextBox(primerPanel).bindValueToProperty("nombre");
		new Button(mainPanel).setCaption("Aceptar")
			.onClick(() -> this.aceptar());
	}

	private void aceptar() {
		getModelObject().crear(); 
		getModelObject().cerrar(this);
	}
}
