import java.util.Scanner;
public class employee {
static int emp_count=0;
  int id;
  String profession;
  String dob;
  int salary;
  String name;
  void printdetails() {
	  System.out.println("Details Of Employee "+emp_count);  
	  System.out.println("Name :"+this.name);
	  System.out.println("ID :"+this.id);
	  System.out.println("DOB :"+this.dob);
	  System.out.println("Profession :"+this.profession);
	  System.out.println("Salary :"+this.salary);
  }
 static employee create_emp(){
		Scanner sc = new Scanner(System.in);
	  employee emp = new employee();
	  emp_count++;
	  System.out.println("Enter Details of New Employee:");
	  System.out.print("Enter Id");
	  emp.id = sc.nextInt();
	  System.out.print("Enter Name");
	  emp.name = sc.next();
	  System.out.print("Enter Profession");
	  emp.profession = sc.next();
	  System.out.print("Enter Salary");
	  emp.salary = sc.nextInt();
	  System.out.print("Enter DOB");
	  emp.dob = sc.next();
	  
	  return emp;
  }
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      employee abhinav =create_emp();

      employee yash =create_emp();

      employee rahul =create_emp();
 
      employee ayush =create_emp();

      employee keshav = create_emp();
 
            abhinav.printdetails();
              yash.printdetails();    
           rahul.printdetails();     
                 ayush.printdetails();
           keshav.printdetails();      
	}

}