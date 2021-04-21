package teacher;
/*
 * Teacher 
1. Teacher ID 
2. Teacher Name 
3. Salary 

 * This class is responsible to keeping track of teachers name id and salaries
 */

public class teacher {
	private int tid;
	private String tname;
	private int salary;
	private int salaryEarned;
	
public teacher(int tid,String tname,int salary) {
	
	/*
	 * Create a new teacher constructor 
	 * @param id teacher is 
	 * @param name teacher name 
	 * @salary salary of teacher
	 * 
	 */
	
	this.tid=tid;
	this.tname=tname;
	this.salary=salary;
}

public int getTid() {
	return tid;
}


public String getTname() {
	return tname;
}

public int getSalary() {
	return salary;
}

public void setSalary(int salary) {
	this.salary = salary;
}

/*
 * Adds to the salary of teacher
 * Removes from total money earned to GHS
 * Adds to the salary earned
 * Update total money spent
 */
public void receiveSalary(int salary) {
	salaryEarned+=salary;
	school.school.updateTotalMoneySpent(salary);
}
	
	

}
