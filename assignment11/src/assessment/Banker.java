package assessment;

//Import in the program classes that exist within an external Java library.
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

// Banker is a subclass of Person.
public class Banker extends Person{
	
	//Create an ArrayList of the class Relative called relatives 
	private ArrayList <Relative> relatives = new ArrayList <Relative> ();

	/**
	*create a constructor of Banker that initialises the fields friendliness, name and the ArrayList relatives
	*/
	public Banker(String name, int friendliness, ArrayList <Relative> relatives) {
		//  call the constructor of the super class
		super(name, friendliness);
		this.relatives = relatives;
		
		/*
		 * Call the method sort from the java library in order to compare elements of the type Relative within the ArrayList relatives.
		 */
		Collections.sort(relatives, new Comparator<Relative>() { 
			public int compare(Relative one, Relative other) {
				//compareTo is a method that compares the names of the objects one and other depending on the alphabetical order.
				return one.getName().compareTo(other.getName());
		    }
		}); 
		
	}
	/*
	 * this is a getter of the field relatives
	 */
	public ArrayList <Relative>  getRelatives(){
		return relatives;
	}
	
	/*
	 *This method is going to return the relative, which is the closest to the banker.
	 */
	public Relative SelectClosestRelative(){
		// create a new object of the class Relative which is equal of the first element of the relatives ArrayList.
		Relative theRelative = relatives.get(0);
		
		for (int i = 0; i < relatives.size(); i++){
			// for each element of the ArrayList relatives compare its distance with the distance of the following element of the ArrayList.
			if( getRelative(i).getDistance() < theRelative.getDistance()){
				//Assign the object with the smallest distance to theRelative. 
				theRelative = getRelative(i);
			}
		}
		
		//Print: " The children have been moved to " + the name of the relative with the smallest distance.
		System.out.println(" the children have been moved to " + theRelative.getName());
		return theRelative;
		
			
	}
	
	/*
	 * Gets the supplied element of the ArrayList relatives
	 */
	public Relative getRelative(int i){
		return relatives.get(i);
	}
	
	/*
	 * A method that selects the closest friendly relative.
	 */
	public String ChooseRelative(){
		
		// theRelative is equal to the output of the SelectClosestRelative method.
		Relative theRelative = this.SelectClosestRelative();
		
		//As long as the level of friendliness of theRelative is smaller than the friendliness of the banker ...
		while (theRelative.getFriendliness() < friendliness){
			// Print : the name of this Relative and that he has been unfriendly.
			System.out.println(theRelative.getName() + " has been unfriendly");
			//remove theRelative from the relatives ArrayList.
			relatives.remove(theRelative);
			//call the method SelectClosestRelative and assign its output to theRelative
			theRelative = this.SelectClosestRelative();
		}
		return "finally children have been moved to the closest friendly relative " + theRelative.getName(); 

	}
	
	

}
