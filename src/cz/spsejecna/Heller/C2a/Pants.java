package cz.spsejecna.Heller.C2a;

public class Pants {

	String name;
	int width;
	int height;
	String condition;
	int price;

	// konstruktor
	Pants(String name, int height, int width, String condition, int price) {
		this.name = name;
		this.height = height;
		this.width = width;
		this.condition = condition;
		this.price = price;
	}

//gettery
	public String getName() {
		return this.name;
	}

	public int getHeight() {
		return this.height;
	}

	public int getWidth() {
		return this.width;
	}

	public String getCondition() {
		return this.condition;
	}

	public int getPrice() {
		return this.price;
	}
}

//2 interface 1. pokud má další prvek 2. získání dalšího prvku
interface Iterator {

	public boolean hasNext();

	public Pants getNext();
}
