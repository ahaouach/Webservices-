package bibliotheque;

import java.util.HashMap;

public class Usagers {

	private HashMap<String, Usager> listUsagers = new HashMap<>();

	public Usagers(HashMap<String, Usager> listUsagers) {
		super();
		this.listUsagers = listUsagers;
	}

	public HashMap<String, Usager> getListUsagers() {
		return listUsagers;
	}

	public void setListUsagers(HashMap<String, Usager> listUsagers) {
		this.listUsagers = listUsagers;
	}

}
