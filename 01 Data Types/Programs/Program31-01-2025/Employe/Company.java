public class Company{
       public static void main(String[] args){
	          Employee E1 = new Employee();
			  Employee E2 = new Employee();
			  
			  
			  E1.EmployeeId = 1001;
			  E1.EmployeeName = "Arvind Lodhi";
			  E1.EmployeeDesignation  = "Core Java";
			  E1.EmployeeSalary  = 499999.99;
			  
			  System.out.println("Employee ID :-" + E1.EmployeeId);
			  System.out.println("Employee Name :-" + E1.EmployeeName );
			  System.out.println("Employee Employee Designation :-" + E1.EmployeeDesignation );
			  System.out.println("Employee Salary :-" + E1.EmployeeSalary  );
			  
			  
			  System.out.println("----------------************--------------" );
			  
			  E2.EmployeeId = 1002;
			  E2.EmployeeName = "Akash Lodhi";
			  E2.EmployeeDesignation  = "Advance Java";
			  E2.EmployeeSalary  = 999999.99;
			  
		  
			  System.out.println("Employee ID :-" + E2.EmployeeId);
			  System.out.println("Employee Name :-" + E2.EmployeeName );
			  System.out.println("Employee Employee Designation :-" + E2.EmployeeDesignation );
			  System.out.println("Employee Salary :-" + E2.EmployeeSalary  );
			  
	   }
}