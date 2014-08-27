package domain;

import java.util.ArrayList;

public class MateriasHome {

	private static ArrayList<Materia> materias;
	
	public ArrayList<Materia> getInstance() {
		if (materias == null) {
			materias = new ArrayList<Materia>();
		}
		return materias;
	}
	
	public static void add(Materia materia){
		materias.add(materia);
	}
}
