package school;

import java.util.ArrayList;
import java.util.List;

import student.student;
import teacher.teacher;

public class Main {

	public static void main(String[] args) {
		// 
		teacher lizzy = new teacher(1, "Lizzy", 500);
		teacher mellisa = new teacher(2,"Mellisa",700);
		teacher vandorhorn = new teacher(3,"Vander Horn",650);
		List<teacher> teachersList = new ArrayList<>();
		teachersList.add(mellisa);
		teachersList.add(vandorhorn);
		teachersList.add(lizzy);
		
		
		student tamara = new student(1, "Tamara", 1);
		student rakshith = new student(2,"Rakshith",10);
		student robie = new student(3,"Robie Williams",5);
		List<student> studentList = new ArrayList<>();
		studentList.add(robie);
		studentList.add(rakshith);
		studentList.add(tamara);
		
		school ghs = new school(teachersList, studentList);
		tamara.payFees(1000);
		rakshith.payFees(2500);
		//tamara.getRemainingFees();
		
		
		
		System.out.println("GHS has earned $"+ghs.getTotalMoneyEarned());
		System.out.println("-------Making GHS Pay a Salary------");
		
		lizzy.receiveSalary(lizzy.getSalary());
		mellisa.receiveSalary(mellisa.getSalary());
		System.out.println("GHS has paid salaries and now has $"+ghs.getTotalMoneyEarned());
		
		
		//Tamara paid school fees 
		
		System.out.println(tamara);


	}


	

}
