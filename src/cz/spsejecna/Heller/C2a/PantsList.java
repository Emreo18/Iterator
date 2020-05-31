package cz.spsejecna.Heller.C2a;

import java.util.ArrayList;

public class PantsList {
	// založení arraylistu
	 ArrayList<Pants> pants = new ArrayList();

	public PantsIterator Iterator() {
		return new PantsIterator();
	}

//metoda add
	public void add(Pants array) {
		this.pants.add(array);
	}

//tøída která implementuje iterator 
	private class PantsIterator implements Iterator {
		
		int current = 0;

//metoda true/false jestli má další prvek
		public boolean hasNext() {
			if (current == pants.size()) {
				return false;
			} else {
				return true;
			}
		}

//metoda na získání dalšího prvku
		public Pants getNext() {
			return pants.get(current++);
		}
	}
}
