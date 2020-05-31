package cz.spsejecna.Heller.C2a;

import java.util.ArrayList;

public class PantsList {
	// zalo�en� arraylistu
	 ArrayList<Pants> pants = new ArrayList();

	public PantsIterator Iterator() {
		return new PantsIterator();
	}

//metoda add
	public void add(Pants array) {
		this.pants.add(array);
	}

//t��da kter� implementuje iterator 
	private class PantsIterator implements Iterator {
		
		int current = 0;

//metoda true/false jestli m� dal�� prvek
		public boolean hasNext() {
			if (current == pants.size()) {
				return false;
			} else {
				return true;
			}
		}

//metoda na z�sk�n� dal��ho prvku
		public Pants getNext() {
			return pants.get(current++);
		}
	}
}
