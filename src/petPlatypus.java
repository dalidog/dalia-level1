public class petPlatypus {
	private String name;


	void sayHi(){
		System.out.println("The platypus " + name + " is dumber than your average platypus.");
	}
void eatsDonuts(){
	System.out.println(name + " secretly hides donuts in his room and feasts on them as a midnight snack.");
}

	public static void main(String[] args) {
		//1. Make an instance of your new pet platypus
		petPlatypus Eli = new petPlatypus("Eli");
		//2. Call the sayHi method
		Eli.sayHi();
		Eli.eatsDonuts();
		//3. Create a constructor in the platypus class so that you can give your platypus a name.

		}
	petPlatypus(String name){
		this.name=name;
	}
	}





