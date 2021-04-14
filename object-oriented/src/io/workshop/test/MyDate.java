package io.workshop.test;

public class MyDate {
	private int day;
	private int month;
	private int year;
	
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		if (day > 0 && day<=31) {
			System.out.println("Day is :"+day);
			
		}
		
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		if(month >0 && month<=12) {
			this.month = month;
			System.out.println("Month is :"+month);
		}
		
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
		System.out.println("Year is :"+year);
	}	

}
