package domain;

import java.util.ArrayList;

public class MateriasHome {
	private static MateriasHome instance;
	private static ArrayList<Materia> materias;
	
	public static synchronized MateriasHome getInstance() {
		if (instance == null) {
			instance = new MateriasHome();
		}
		return instance;
	}
	
	public static void add(Materia materia){
		materias.add(materia);
	}
}
