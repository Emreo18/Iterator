package cz.spsejecna.Heller.C2a;

public class Main {

	public static void main(String[] args) {
// zalo�en� prvk�
		Pants first = new Pants("Supreme", 42, 34, "9.5/10", 11000);
		Pants second = new Pants("LV", 40, 38, "6/10", 25000);
		Pants third = new Pants("Bape", 44, 40, "8/10", 8000);
		Pants fourth = new Pants("Stussy", 46, 46, "10/10", 3000);
//zalo�en� list, kam p�id�m prvky
		PantsList array = new PantsList();
// p�id�v�n� prvk�
		array.add(first);
		array.add(second);
		array.add(third);
		array.add(fourth);
//zalo�en� iteratoru a p�i�azen� listu
		Iterator myIterator = array.Iterator();
// dokud m� iterator dal�� prvek, tak bude vypisovat tyhle p��kazy
		while (myIterator.hasNext()) {
			Pants p = myIterator.getNext();
			System.out.println("Name: " + p.getName());
			System.out.println("Height: " + p.getHeight() + "cm");
			System.out.println("Width: " + p.getWidth() + "cm");
			System.out.println("Condition: " + p.getCondition());
			System.out.println("Price: " + p.getPrice() + ",-");
			System.out.println("------------------------");

		}
	}
}
