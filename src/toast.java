
public class toast {
private int levelofcrunchyness;
private int bites;

toast() {
	this.levelofcrunchyness = 100;
	this.bites = 10;
}
 void bite() {
	 bites--;
		if (bites > 0)
		System.out.println("haha you still have to bite me " + bites + " times!!!!!!!!!!!!");
		else{
			System.out.println("NOOOOOOOOOOOOOOOOOOOOOO! I'll come back to haunt you in your dreams!!");	
		}
 }
 public static void main(String[] args) {
	toast todaysbreakfast = new toast();
	todaysbreakfast.bite();
	todaysbreakfast.bite();
	todaysbreakfast.bite();
	todaysbreakfast.bite();
	todaysbreakfast.bite();
	todaysbreakfast.bite();
	todaysbreakfast.bite();
	todaysbreakfast.bite();
	todaysbreakfast.bite();
	todaysbreakfast.bite();
}
 }

