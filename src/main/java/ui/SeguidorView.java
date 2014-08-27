package ui;

import org.uqbar.arena.layout.HorizontalLayout;
import org.uqbar.arena.layout.VerticalLayout;
import org.uqbar.arena.widgets.Button;
import org.uqbar.arena.widgets.CheckBox;
import org.uqbar.arena.widgets.Label;
import org.uqbar.arena.widgets.List;
import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.widgets.TextBox;
import org.uqbar.arena.windows.MainWindow;

import domain.UnModel;

//IMPORTANTE: correr con -Djava.system.class.loader=com.uqbar.apo.APOClassLoader
public class SeguidorView extends MainWindow<SeguidorViewModel> {

  public SeguidorView() {
    super(new SeguidorViewModel());
  }

  @Override
  public void createContents(Panel mainPanel) {
	  
	  Panel primerPanel = new Panel(mainPanel);
	  primerPanel.setLayout(new HorizontalLayout());
	  Panel segundoPanel = new Panel(mainPanel);
	  segundoPanel.setLayout(new VerticalLayout());

	  new Label(primerPanel).setText("Seguidor de carrera");
	  new Label(segundoPanel).setText("Materias");
	  new List<String>(segundoPanel);
	  new Button(segundoPanel).setCaption("Nueva materia").onClick(() -> getModelObject().navegar());
  }

  public static void main(String[] args) {
    new SeguidorView().startApplication();
  }
}
