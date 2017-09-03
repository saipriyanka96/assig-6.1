package classes;
//package defines a name space in which classes are stored
public class ClassD extends ClassC{ 
//public keyword is used in the declaration of a class,method or field;public classes,method and fields can be accessed by the members of any class.
//class defines instance and class fields,methods and inner classes as well as specifying the interfaces the class implements and the immediate superclass of the class

//Inheritance is a mechanism in which one object acquires all the properties and behavior of parent object
//Extends keyword indicates we are making a new class that derives from the existing class
	private static String String;
	//private only visible within the class not from any other classes
	//means that the variable or function is shared between all instances of that class
	 //as it belongs to the type
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String="ABC";
		int rollno=1274;
		ClassA s=new ClassA();
		//calling ClassA 
		System.out.println(String);//printing String value
		System.out.println(+rollno);//printing the rollno
	}

}
