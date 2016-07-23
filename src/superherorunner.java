import java.util.ArrayList;
import java.util.Iterator;

public class superherorunner {
public static void main(String[]args){
	Superhero donaldtrump = new Superhero();
	donaldtrump.setsuperpower("Making America Great Again");
	donaldtrump.setname("Donald Trump");
	System.out.println(donaldtrump.toString());
	Superhero hillaryclinton = new Superhero();
	hillaryclinton.setsuperpower("Being Stronger Together");
	hillaryclinton.setname("Hillary Clinton");
	System.out.println(hillaryclinton.toString());
	Superhero berniesanders = new Superhero();
	berniesanders.setsuperpower("Believing in a Future");
	berniesanders.setname("Bernie Sanders");
	System.out.println(berniesanders.toString());
	Superhero tedcruz = new Superhero();
	tedcruz.setsuperpower("Being trustedworthy");
	tedcruz.setname("Ted Cruz");
    System.out.println(tedcruz.toString());
ArrayList< Superhero> presidential_candidates= new ArrayList< Superhero> ();
presidential_candidates.add (donaldtrump);
presidential_candidates.add (hillaryclinton);
presidential_candidates.add (berniesanders);
presidential_candidates.add (tedcruz);
for (Iterator iterator = presidential_candidates.iterator(); iterator.hasNext();) {
	Superhero superhero = (Superhero) iterator.next();
	System.out.println(superhero.toString());
}
	

}
}

