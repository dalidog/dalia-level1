
public class athlete {
String name;
int speed;
int bibNumber;
static int count;
static String location = "New York";
static String startTime = "9:00 a.m.";
athlete(String name,int speed){
	this.name=name;
	this.speed=speed;
	count++;
	this.bibNumber=count;
}
public static void main(String[]args){
	athlete john = new athlete("John",10);
	athlete sarah = new athlete("Sarah",11);
	System.out.println(sarah.name + "'s bib number is"+ sarah.bibNumber);
	System.out.println("Total number of athletes is" + count);
	location = "San Diego";
	System.out.println(john.name + "is running in" + john.location);
	john.location = "Chicago";
	System.out.println(sarah.name + "is running in"+ sarah.location);
	
}
}

