package assessment;

// superclass for Relative and Banker
public class Person {
	
	// both fields can be accessed in the subclasses 
	protected int friendliness; 
	protected String name;
	
	/**
	*create a constructor of Relative that initialises the fields friendliness and name 
	*/
	public Person (String name, int friendliness){
		this.friendliness = friendliness;
		this.name = name;
	}
	
	// String representation for the class Person
	public String toString(){
		return "Name : "+ name+ " ; friendliness : " + friendliness;
	}
	
	// getter for the field name
	public String getName(){ 
		return name;
	}
	
	// getter for the field friendliness
	public int getFriendliness(){
		return friendliness;
	}
	



}
