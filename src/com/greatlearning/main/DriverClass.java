package com.greatlearning.main;

import com.greatlearning.services.AdminDepartment;
import com.greatlearning.services.HrDepartment;
import com.greatlearning.services.TechDepartment;

public class DriverClass {

	public static void main(String[] args) {
		HrDepartment hrDepartment=new HrDepartment();
		TechDepartment techDepartment=new TechDepartment();
		AdminDepartment adminDepartment=new AdminDepartment();
		
		System.out.println("Welcome to "+adminDepartment.departmentName()+"\n"+adminDepartment.getTodayswork()+"\n"+adminDepartment.getWorkDeadline()+"\n");
		System.out.println("Welcome to "+hrDepartment.departmentName()+"\n"+hrDepartment.doActivity()+"\n"+hrDepartment.getTodayswork()+"\n"+hrDepartment.getWorkDeadline()+"\n\n");
		System.out.println("Welcome to "+techDepartment.departmentName()+"\n"+techDepartment.getTodayswork()+"\n"+techDepartment.getWorkDeadline()+"\n"+techDepartment.getTechStackInformation());

	}

	
	
}
