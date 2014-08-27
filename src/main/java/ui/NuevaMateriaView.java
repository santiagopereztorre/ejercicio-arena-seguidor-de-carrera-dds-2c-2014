package ui;

import org.uqbar.arena.layout.*;
import org.uqbar.arena.widgets.*;
import org.uqbar.arena.windows.MainWindow;

//IMPORTANTE: correr con -Djava.system.class.loader=com.uqbar.apo.APOClassLoader
public class NuevaMateriaView extends MainWindow<NuevaMateriaViewModel> {

  public NuevaMateriaView() {
	  super(new NuevaMateriaViewModel());
  }

  @Override
  public void createContents(Panel mainPanel) {
	  
	  Panel primerPanel = new Panel(mainPanel);
	  primerPanel.setLayout(new HorizontalLayout());
	  
	  new Label(primerPanel).setText("Nombre:");
	  new TextBox(primerPanel).bindValueToProperty("nombre");
	  new Button(mainPanel).setCaption("Aceptar").onClick(() -> getModelObject().crear());
  }

  public static void main(String[] args) {
    new NuevaMateriaView().startApplication();
  }
}
