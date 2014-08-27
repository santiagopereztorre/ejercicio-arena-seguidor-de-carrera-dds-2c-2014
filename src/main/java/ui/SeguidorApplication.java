package ui;

import org.uqbar.arena.Application;
import org.uqbar.arena.windows.Window;

public class SeguidorApplication extends Application {

	public static void main(String[] args) {
		new SeguidorApplication().start();
	}

	@Override
	protected Window<?> createMainWindow() {
		return new SeguidorView(this);
	}

}
