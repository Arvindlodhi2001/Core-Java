class Example{
     int       num1 = 10;
     double    num2 = 99.99;
     Boolean   Status = true;
     char[] shortcut = {'x','y','@' , '!'};
     int[] Marks = {99 , 98 , 88 , 77 , 80};

}


class Student {
    String name = "Arvind";
    int rollNo = 101;
    double percentage = 92.5;
    char grade = 'A';
    boolean passed = true;
}

class Product {
    String productName = "Laptop";
    double price = 59999.99;
    int quantity = 5;
    boolean inStock = true;
}

class Employee {
    String empName = "Rahul";
    int empId = 1001;
    double salary = 50000.50;
    boolean isPermanent = true;
}


                    
class Sample{
int     discount = 99;
double   price = 99.99;
Boolean stock = true;
char[] shortcut = {'1','a','@'};
Example[] e1 = {new Example() , new Example()  }; 
}






public class Test{
       public static void main(String[] args){

           Sample S1 = new Sample();
          
           System.out.println("discount :- " + S1.discount);
           System.out.println("price :- " + S1.price);
           System.out.println("stock :- " + S1.stock);
           System.out.println("shortcut :- " + java.util.Arrays.toString(S1.shortcut));
           System.out.println("stock :- " + S1.shortcut[0]);
           System.out.println("stock :- " + S1.shortcut[1]);
           System.out.println("stock :- " + S1.shortcut[2]);

           System.out.println("------------------------------");
           
           System.out.println(S1.e1[0].num1);
           System.out.println(S1.e1[0].num2);
           System.out.println(S1.e1[0].Status);
           System.out.println(java.util.Arrays.toString(S1.e1[0].shortcut));
           System.out.println(java.util.Arrays.toString(S1.e1[0].Marks));
           


       }
}