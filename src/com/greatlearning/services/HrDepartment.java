package com.greatlearning.services;

public class HrDepartment extends SuperDepartment {

	public String departmentName() {
		return "Hr Department";
	}
	
	public String getTodayswork() {
		return "Fill today’s worksheet and mark your attendance";
	}
	
	public String getWorkDeadline() {
		return "Complete by EOD\n"+super.isTodayAHoliday();
	}
	
	public String doActivity() {
		return "team Lunch";
	}
}
