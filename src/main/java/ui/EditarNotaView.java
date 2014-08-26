package ui;

import org.uqbar.arena.layout.*;
import org.uqbar.arena.widgets.*;
import org.uqbar.arena.windows.MainWindow;

import domain.UnModel;

//IMPORTANTE: correr con -Djava.system.class.loader=com.uqbar.apo.APOClassLoader
public class EditarNotaView extends MainWindow<UnViewModel> {

  public EditarNotaView() {
    super(new UnViewModel(new UnModel()));
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
	  new TextBox(primerPanel);
	  new Label(segundoPanel).setText("Descripcion:");
	  new TextBox(segundoPanel);
	  new CheckBox(tercerPanel);
	  new Label(tercerPanel).setText("Aprobado");
	  new Button(mainPanel).setCaption("Aceptar");
  }

  public static void main(String[] args) {
    new EditarNotaView().startApplication();
  }
}
