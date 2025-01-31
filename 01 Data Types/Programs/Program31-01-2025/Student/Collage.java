public class Collage{
       public static void main(String[] args){
	          Student S1 = new Student();
			  Student S2 = new Student();
			  
			  
			  S1.SNO = 1001;
			  S1.StudentName = "Arvind Lodhi";
			  S1.CourseName  = "Core Java";
			  S1.Fees  = 4999.99;
			  
			  System.out.println("Student Name :-" + S1.SNO);
			  System.out.println("Student Name :-" + S1.StudentName );
			  System.out.println("Student Name :-" + S1.CourseName );
			  System.out.println("Student Name :-" + S1.Fees  );
			  
			  
			  System.out.println("----------------************--------------" );
			  
			  S2.SNO = 1002;
			  S2.StudentName = "Akash Lodhi";
			  S2.CourseName  = "Advance Java";
			  S2.Fees  = 9999.99;
			  
			  System.out.println("Student Name :-" + S2.SNO);
			  System.out.println("Student Name :-" + S2.StudentName );
			  System.out.println("Student Name :-" + S2.CourseName );
			  System.out.println("Student Name :-" + S2.Fees);
			  
	   }
}