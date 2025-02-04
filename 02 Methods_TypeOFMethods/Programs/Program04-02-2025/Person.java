class Person{
      static int eyes;
	  static int ears;
	  static int hands;
	  static int legs;
	  
	  String name;
	  double height;
	  double weight;
	  
	 static void InsSFIs(int ey , int ea , int h , int l){
	  
	        eyes  = ey;
			ears  = ea;
			hands = h;
			legs  = l;
	  }
	  
	  void InsNSFIs(String n , double h , double  w){
	       name = n;
	       height = h;
	       weight = w;
	   }
	   
	   void Modify(String n , double w ){
	        name   = n;
			weight = w;
	   }
	   
	   void Display(){
	   
	        System.out.println("**************" + name + "***************");
	   
	        System.out.println("eyes -->" + eyes);
			System.out.println("ears -->" + ears);
			System.out.println("hands -->" + hands);
			System.out.println("legs -->" + legs);
			
			System.out.println("name -->" + name);
			System.out.println("height -->" + height);
			System.out.println("weight -->" + weight);
			
			System.out.println("*****************************");
	   }
	   
	   
	   
}