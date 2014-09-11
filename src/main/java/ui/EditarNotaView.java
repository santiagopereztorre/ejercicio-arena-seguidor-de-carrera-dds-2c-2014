package ui;

import org.uqbar.arena.layout.*;
import org.uqbar.arena.widgets.*;
import org.uqbar.arena.windows.Window;
import org.uqbar.arena.windows.WindowOwner;

//IMPORTANTE: correr con -Djava.system.class.loader=com.uqbar.apo.APOClassLoader
@SuppressWarnings("serial")
public class EditarNotaView extends Window<EditarNotaViewModel> {

	public EditarNotaView(WindowOwner parent) {
		super(parent, new EditarNotaViewModel());
	}

	@Override
	public void createContents(Panel mainPanel) {

		Panel primerPanel = new Panel(mainPanel);
		primerPanel.setLayout(new HorizontalLayout());
		Panel segundoPanel = new Panel(mainPanel);
		segundoPanel.setLayout(new HorizontalLayout());
		Panel tercerPanel = new Panel(mainPanel);
		tercerPanel.setLayout(new HorizontalLayout());

		new Label(primerPanel).setText("Fecha:");
		new TextBox(primerPanel).bindValueToProperty("fecha");
		new Label(segundoPanel).setText("Descripcion:");
		new TextBox(segundoPanel).bindValueToProperty("fecha");
		new CheckBox(tercerPanel).bindValueToProperty("aprobado");
		new Label(tercerPanel).setText("Aprobado");
		new Button(mainPanel).setCaption("Aceptar").onClick(
				() -> this.aceptar());
	}

	private void aceptar() {
		getModelObject().editar(); 
		getModelObject().cerrar(this);
	}
}
