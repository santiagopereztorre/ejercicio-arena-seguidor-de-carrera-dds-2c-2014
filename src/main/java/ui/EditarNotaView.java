package ui;

import org.uqbar.arena.layout.*;
import org.uqbar.arena.widgets.*;
import org.uqbar.arena.windows.MainWindow;

//IMPORTANTE: correr con -Djava.system.class.loader=com.uqbar.apo.APOClassLoader
public class EditarNotaView extends MainWindow<EditarNotaViewModel> {

  public EditarNotaView() {
    super(new EditarNotaViewModel());
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
	  new TextBox(segundoPanel).bindValueToProperty("descripcion");
	  new CheckBox(tercerPanel).bindValueToProperty("aprobado");
	  new Label(tercerPanel).setText("Aprobado");
	  new Button(mainPanel).setCaption("Aceptar").onClick(() -> getModelObject().editar());
  }

  public static void main(String[] args) {
    new EditarNotaView().startApplication();
  }
}
