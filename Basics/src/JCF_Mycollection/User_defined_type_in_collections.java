package JCF_Mycollection;

import java.util.ArrayList;

public class User_defined_type_in_collections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			// to have a Table like structure in Java
			Student s1 = new Student(123, "Ram", 78.0, 'D');
			Student s2 = new Student(323, "Sam", 88.0, 'C');
			Student s3 = new Student(893, "Jam", 90.0, 'A');
			Student s4 = new Student(456, "Mam", 48.0, 'F');

	ArrayList<Student> al = new ArrayList<Student>(); // Adding user defined type to container
			al.add(s1); // adding objects of Student class
			al.add(s2);
			al.add(s3);
			al.add(s4);
			for (int i = 0; i < al.size(); i++) {
				Student s = (Student)
	 al.get(i); // rereival of Student
	System.out.println(s.rollNo + " " + s.stuNname + " " + s.stuGrade + "  " + s.total);
			}
		}

	}

	class Employee {
		int empId;
		String emNname;
		double salary;
		char empGrade;

		public Employee(int empId, String emNname, double salary, char empGrade) {
			this.empId = empId;
			this.emNname = emNname;
			this.salary = salary;
			this.empGrade = empGrade;
		}

	}

	class Student {
		int rollNo;
		String stuNname;
		double total;
		char stuGrade;

		public Student(int rollNo, String stuNname, double total, char stuGrade) {
			this.rollNo = rollNo;
			this.stuNname = stuNname;
			this.total = total;
			this.stuGrade = stuGrade;
		}


	}


