package ui;

import org.uqbar.arena.layout.HorizontalLayout;
import org.uqbar.arena.layout.VerticalLayout;
import org.uqbar.arena.widgets.Button;
import org.uqbar.arena.widgets.Label;
import org.uqbar.arena.widgets.List;
import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.windows.SimpleWindow;
import org.uqbar.arena.windows.WindowOwner;

//IMPORTANTE: correr con -Djava.system.class.loader=com.uqbar.apo.APOClassLoader
@SuppressWarnings("serial")
public class SeguidorView extends SimpleWindow<SeguidorViewModel> {

	public SeguidorView(WindowOwner parent) {
		super(parent, new SeguidorViewModel());
	}

	@Override
	public void createContents(Panel mainPanel) {

		Panel primerPanel = new Panel(mainPanel);
		primerPanel.setLayout(new HorizontalLayout());
		Panel segundoPanel = new Panel(mainPanel);
		segundoPanel.setLayout(new VerticalLayout());

		new Label(primerPanel).setText("Seguidor de carrera");
		new Label(segundoPanel).setText("Materias");
		new List<String>(segundoPanel).bindItemsToProperty("resultados");
		new Button(segundoPanel).setCaption("Nueva materia").onClick(
				() -> getModelObject().navegar(this));
	}

	@Override
	protected void addActions(Panel actionsPanel) {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void createFormPanel(Panel mainPanel) {
		// TODO Auto-generated method stub
		
	}
}
