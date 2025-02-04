public class PersonInformation{
       public static void main(String[] args){
	         System.out.println("*****************Well Come*************");
			 
			 Person P1 = new Person();
			 Person P2 = new Person();
			 Person P3 = new Person();
			 
			 // Person 1
			 
			 // I am inislize the static member varibale
			 
			 P1.InsSFIs(2,2,2,2);
			 
			
			  P1.Display();
			 // I am inislize Instance Member Variable
			 
			 P1.InsNSFIs("Hari Krishan" , 66.66,  99.99);
			 
			  P1.Display();
			  
			  // assine  the Variable
			  
			  P1.Modify("Arvind Lodhi" , 77.77 );
			  P1.Display();
			  
			  //Person 2;
			   P2.Display();
			 // I am inislize Instance Member Variable
			 
			  P2.InsNSFIs("Pk Krishan" , 55.66,  66.66);
			 
			  P2.Display();
			  
			  // assine  the Variable
			  
			  P2.Modify("Krishan Lodhi" , 22.77 );
			  P2.Display();
			  
	   }
}