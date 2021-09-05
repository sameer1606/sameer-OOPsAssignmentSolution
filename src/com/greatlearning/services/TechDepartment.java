package com.greatlearning.services;

public class TechDepartment extends SuperDepartment{

	public String departmentName() {
		return "Tech Department";
	}
	
	public String getTodayswork() {
		return "Complete coding of module 1";
	}
	
	public String getWorkDeadline() {
		return "Complete by EOD";
	}
	
	public String getTechStackInformation() {
		return "Core Java\n"+super.isTodayAHoliday();
	}
}
