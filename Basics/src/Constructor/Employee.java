package Constructor;

public class Employee {
	 int empid;
	double salary;
	char grade;
	
	Employee(int empid,double salary,char grade)//constructor
	{
		this.empid=empid;
		this.salary=salary;
		this.grade=grade;
	}
	void display()
	{
		 System.out.println("*****************************");
		 System.out.println("Employee ID:" +empid);
		 System.out.println("Salary:" +salary);
		 System.out.println("Grade:"+grade);
		 System.out.println("*****************************");
	}
                                        
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1=new Employee(123,10000.0,'A');
		Employee e2=new Employee(789,5000.0,'B');
		Employee e3=new Employee(456,2000.0,'C');
		
		e1.display();
		e2.display();
		e3.display();
	}

}
