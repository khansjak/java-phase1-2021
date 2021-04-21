package student;

/*
student 
1. id 
2. name 
3. grade
4. fees suppose to be paid 
5. fee paid 

 */

public class student {
	
	//Student class fields
	private int sid;
	private String sname;
	private int grade;
	private int feePaid;
	private int feeTotal;
	
	/*
	 * Fees for every student is $30,000.
	 * Fees paid initially is 0.
	 * 
	 * @param id -  is for student :unique
	 * @param name - name of student 
	 * @param grade - grade of student
	 */
	
	
	//Constructor
	public student(int sid, String sname, int grade) {
		feePaid =0;
		feeTotal = 30000;
		this.sid = sid;
		this.sname = sname;
		this.grade = grade;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	
	/* 
	 * feesPaid = 10,000+5000+15000
	 * Keep adding the fee to feesPaid field
	 * Add the fees to the fees paid 
	 * The school is going to receive the funds 
	 * @Param - fees 
	 */
	public float getFeePaid() {
		return feePaid;
		
	}

	public void payFees(int feePaid) {
		this.feePaid = feePaid;
		school.school.updateTotalMoneyEarned(feePaid);
	}
	
	// Not altering id  or name so no setters required for these two 
	//Grade maybe when student gets promoted 
	
	public void updateFeesPaid(int fees) {
		//feePaid= feePaid+fees;
		feePaid+=fees;
	}
	
	public int getRemainingFees() {
		return feeTotal-feePaid;
	}

	@Override
	public String toString() {
		return "student [sid=" + sid + ", sname=" + sname + ", grade=" + grade + ", feePaid=" + feePaid + ", feeTotal="
				+ feeTotal + "]";
	}
	
	

}
