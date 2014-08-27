package domain;

import java.util.ArrayList;
import java.util.List;

public class MateriasHome {
	private static MateriasHome instance;
	private List<Materia> materias = new ArrayList<Materia>();

	public static synchronized MateriasHome getInstance() {
		if (instance == null) {
			instance = new MateriasHome();
		}
		return instance;
	}

	public void add(Materia materia) {
		materias.add(materia);
	}

	public void delete(Materia materia) {
		this.materias.remove(materia);
	}
}
