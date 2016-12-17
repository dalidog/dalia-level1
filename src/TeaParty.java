
public class TeaParty {
	
public String welcome(String lastName, boolean isWoman, boolean isKnighted)
{	String welcome = "Hello ";
      if(isWoman == true){
    	  welcome = welcome + "Ms. " + lastName;
    	 
      }
      else if (isWoman == false){
    	  if(isKnighted == true){
 	     	 welcome = welcome +"Sir " + lastName;
 	       }
    	  else{welcome = welcome + "Mr. " + lastName;
    	  }
      }
      
      

return welcome;   

}}