
public class smurf {


public static void main(String[] args) {
	smurf Bob = new smurf("Bob");
	Bob.getName();
	System.out.println(Bob.getName());
	Bob.eat();

	smurf Papa = new smurf("Papa");
	Papa.getName();
	System.out.println(Papa.getName());
	Papa.isGirlOrBoy();
	System.out.println(Papa.isGirlOrBoy());
	
	smurf Smurfette = new smurf("Smurfette");
	Smurfette.getName();
	System.out.println(Smurfette.getName());
	Smurfette.getHatColor();
	System.out.println(Smurfette.getHatColor());
	Smurfette.isGirlOrBoy();
	System.out.println(Smurfette.isGirlOrBoy());
}

		private String name;

		smurf(String name) {
			this.name = name;
		}

		public String getName() {
			return "My name is " + name + " Smurf.";
		}

		public void eat() {
			System.out.println(name + " Smurf is eating Smurfberries.");
		}

		/* Papa Smurf wears a red hat, all the others are white. */
		public String getHatColor() {
			// 3. Fill in this method
			if(name .equals ("Papa")){
				 return "red";
			}
			else{
			return"blue";
			}
		}

		/* Smurfette is the only female Smurf. */
		public String isGirlOrBoy() {
			if(name .equals ("Smurfette")){
				 return "girl";
			}
			else{
			return"boy";
		}




		}}

