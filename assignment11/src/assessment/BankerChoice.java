package assessment;

//Import in the program a class called ArraysList, that existing within an external Java library.
//It allows the use of arrayLists .
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class BankerChoice {
	
	
	/**
	*create the main method that could be run by the terminal
	*/
	public static void main(String[] args) {
		
	
		//create an object of the Relative class called relative1.
		Relative relative1 = new Relative("Josephine", 5, 100);
		//create an object of the Relative class called relative2.
		Relative relative2 = new Relative("Olef", -10, 10);
		//create an object of the Relative class called relative3.
		Relative relative3 = new Relative("Sir", 0, 20);
		//create an object of the Relative class called relative4.
		Relative relative4 = new Relative("uncle Monty", 10, 20);

		//Create an ArrayList of the class Relative called relatives 
		ArrayList <Relative> relatives = new ArrayList <Relative> ();
		// add to the ArrayList the objects that were created from the Relative class
		relatives.add(relative1);
		relatives.add(relative2);
		relatives.add(relative3);
		relatives.add(relative4);


		//create an object of the Banker class called banker.
		Banker banker = new Banker("Mr Poe", 5, relatives);
		// Print the output of the getRelatives method inside of the banker object
		System.out.println(banker.getRelatives());
		
		//System.out.println(banker.SelectClosestRelative());
		System.out.println(banker.ChooseRelative());

		

	}

}
