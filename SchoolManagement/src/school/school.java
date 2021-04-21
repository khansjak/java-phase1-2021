package school;

import java.util.List;

import student.student;
import teacher.teacher;

/*
 * Implements teachers and students using an array list 
 */

public class school {
	
	private List<teacher> teachers;
	private List<student> students;
	private static int totalMoneyEarned;
	private static int totalMoneySpent;
	
	/*
	 * A new school object is created 
	 * @param - teachers is the list of all teachers of school
	 * @param students is the list of all students of school
	 */
	public school(List<teacher> teachers, List<student> students) {
		super();
		this.teachers = teachers;
		this.students = students;
		totalMoneyEarned=0;
		totalMoneySpent=0;
	}
	
	//Returns the teacher list of the school
	public List<teacher> getTeachers() {
		return teachers;
	}

	//Add a teacher to the school
	public void addTeachers(teacher teacher) {
		teachers.add(teacher);
	}

	//Return the list of the students of the school
	public List<student> getStudents() {
		return students;
	}
	
	
	//Add a student to student list of the school
	public void addStudents(student student) {
		students.add(student);
	}

	//Returns Total money earned by the school
	public float getTotalMoneyEarned() {
		return totalMoneyEarned;
	}

	//update total money earned
	public static void updateTotalMoneyEarned(int MoneyEarned) {
		totalMoneyEarned = totalMoneyEarned+MoneyEarned;
	}

	//Returns the total money spent by the school
	public int getTotalMoneySpent() {
		return totalMoneySpent;
	}

	//Update the total money spent by the school expenses is basically the salaries given out to the teachers
	public static void updateTotalMoneySpent(float MoneySpent) {
		totalMoneyEarned -= MoneySpent;
	}
	
	
	

}
