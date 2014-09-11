package domain;

import org.apache.commons.collections15.Predicate;
import org.uqbar.commons.model.CollectionBasedHome;

public class MateriasHome extends CollectionBasedHome<Materia> {

	private static MateriasHome instance;

	@Override
	public Class<Materia> getEntityType() {
		return Materia.class;
	}

	@Override
	public Materia createExample() {
		return new Materia();
	}

	@Override
	protected Predicate<Materia> getCriterio(Materia example) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public static synchronized MateriasHome getInstance() {
		if (instance == null) {
			instance = new MateriasHome();
		}
		return instance;
	}

}
