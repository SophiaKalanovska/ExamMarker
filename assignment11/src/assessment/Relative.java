package assessment;

//Import in the program a class called ArraysList, that existing within an external Java library.
//It allows the use of arrayLists.
import java.util.ArrayList;

//Relative is a subclass of Person
public class Relative extends Person{ 

	private int distanceFromPoe;

	/**
	*create a constructor of Relative that initialises the fields friendliness, name and distanceFromPoe
	*/
	public Relative(String name, int friendliness,int distanceFromPoe) {
		
		//  call the constructor of the super class
		super(name, friendliness);
		this.distanceFromPoe = distanceFromPoe;
	
	}
	
	//@overrides
	// String representation for the class Relative
	public String toString(){ 
		return "{relative name : " + name + " ; friendliness :  " + friendliness + " ; distanceFromPoe : " + distanceFromPoe + "}"; 
	}
	/*
	 * getter for the field distanceFromPoe
	 */
	public int getDistance(){
		return distanceFromPoe;
	}
	
	

	
}
