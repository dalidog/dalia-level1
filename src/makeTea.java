// Copyright Wintriss Technical Schools 2013
public class makeTea {

public static void main(String[] args) {
	TeaBag bag = new TeaBag("Chocolate");
	Kettle kettle = new Kettle();
	kettle.getWater();
	kettle.boil();
	
	
}
	/* Figure out how to make a cup of tea using the classes below */


}


class TeaBag {


	public final static String Chocolate = "Chocolate";
	public final static String IceCream = "Ice Cream";
	public final static String Cookie = "Cookie";
	public final static String Cake = "Cake";


	private String flavor;


	TeaBag(String flavor) {
		this.flavor = flavor;
	}


	String getFlavor() {
		return flavor;
	}


}


class Kettle {


	private Water water = new Water();


	Water getWater() {
		return water;
	}


	void boil() {
		this.water.isHot = true;
	}


	class Water {


		private boolean isHot = false;


		public boolean isHot() {
			return this.isHot;
		}
	}


}


class Cup {


	private TeaBag teabag;


	void makeTea(TeaBag teabag, Kettle.Water hotWater) {
		this.teabag = teabag;
		if (hotWater.isHot())
			System.out.println("Making hot " + teabag.getFlavor() + " tea.");
		else
			System.out.println("Can't make tea with cold water! ");
	}


}



