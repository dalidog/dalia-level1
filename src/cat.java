import javax.swing.JOptionPane;

public class cat {

	private String name;
	private int lives = 5;

	cat(String name) {
		this.name = name;
	}

	void meow() {
		System.out.println("meeeeeooooooooooowwwwwwwww!!");
	}

	public void printName() {
		if (name == null)
			System.out.println("i don't know my own name!");
		else
			System.out.println("my name is " + name);
	}

	void kill() {
		lives--;
		if (lives > 0)
			System.out.println("nice try, but I still have " + lives + " lives left");
		else if (lives < 0)
			System.out.println("that's overkill yo!");
		else
			System.out.println("DEAD CAT :(");
	}

	public static void main(String[] args) {
		/* Do the following things without changing the Cat class */
cat Toaster = new cat("Toaster");
cat Toastercat = new cat("ToasterCat");
		// 1. Make the Cat meow
System.out.println(Toaster.lives);
		Toaster.meow();
		// 2. Get the Cat to print it's name
Toaster.printName();
		// 3. Kill the Cat!
Toaster.kill();
Toaster.kill();
Toaster.kill();
Toaster.kill();
Toaster.kill();
Toaster.kill();
Toaster.kill();
Toaster.kill();
Toaster.kill();
System.out.println(Toaster.lives);
System.out.println(Toastercat.lives);
	}
}


