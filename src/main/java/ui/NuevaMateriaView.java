package ui;

import org.uqbar.arena.layout.*;
import org.uqbar.arena.widgets.*;
import org.uqbar.arena.windows.MainWindow;

import domain.UnModel;

//IMPORTANTE: correr con -Djava.system.class.loader=com.uqbar.apo.APOClassLoader
public class NuevaMateriaView extends MainWindow<UnViewModel> {

  public NuevaMateriaView() {
    super(new UnViewModel(new UnModel()));
  }

  @Override
  public void createContents(Panel mainPanel) {
	  
	  Panel primerPanel = new Panel(mainPanel);
	  primerPanel.setLayout(new HorizontalLayout());
	  
	  new Label(primerPanel).setText("Nombre:");
	  new TextBox(primerPanel);
	  new Button(mainPanel).setCaption("Aceptar");
  }

  public static void main(String[] args) {
    new NuevaMateriaView().startApplication();
  }
}
