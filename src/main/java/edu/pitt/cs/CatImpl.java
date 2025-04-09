package edu.pitt.cs;

public class CatImpl implements Cat {

	// TODO: Fill in with member variables
	String name;
	int id;
	boolean isRented;

	public CatImpl(int id, String name) {
		this.name = name;
		this.id = id;
		this.isRented = false;
	}

	public void rentCat() {
		isRented = true;

	}

	public void returnCat() {
		isRented = false; 
	}

	public void renameCat(String name) {
		this.name = name; 
	}

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	public boolean getRented() {
		return isRented;
	}
//"ID 1. Garfield".
	public String toString() {
		return "ID " + id+"." +" " + name ;
	}

}