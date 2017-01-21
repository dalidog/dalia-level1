public class Friends {


	public static void main(String[] args){
    	//3. Create an instance of Classmate for each person in your class.
   	 Classmate Eli = new Classmate();
    	Classmate Yashwin = new Classmate();
    	Classmate Grant = new Classmate();
    	Classmate Brooke = new Classmate();
   	 //4. set descriptions for each Classmate
Eli.SetDescription("Always cheats at walking and is a popa");
Yashwin.SetDescription("A turtle");
Grant.SetDescription("AKA Greethan");
Brooke.SetDescription("A komodo dragon");
   	 //5. Use your getter to print out each description
   	 System.out.println(Eli.getDescription());
   	System.out.println(Yashwin.getDescription());
   	System.out.println(Grant.getDescription());
   	System.out.println(Brooke.getDescription());
	}





}
class Classmate{
	String description;
    
	//1. create a setter that sets a description for this person
public void SetDescription(String description){
	this.description = description;
	
}
	//2. create a getter that gets a description of this person
public String getDescription(){
	return description;
	
}
}



