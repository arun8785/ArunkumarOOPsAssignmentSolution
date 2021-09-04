package com.greatelearning.driver;

import com.greatelearning.modle.AdminDepartment;
import com.greatelearning.modle.HrDepartment;
import com.greatelearning.modle.SuperDepartment;
import com.greatelearning.modle.TechDepartment;

public class DriverClass extends SuperDepartment {
	public static void main(String[] args) {
	//Main Class to display the details of Department
		SuperDepartment hrDept = new HrDepartment();
		HrDepartment hrActivity = new HrDepartment();
		SuperDepartment adminDept = new AdminDepartment();
		SuperDepartment techDept = new TechDepartment();
		TechDepartment techCode = new TechDepartment();
	//To Display the details in Console	
		System.out.println(adminDept.departmentName());
		System.out.println(adminDept.getTodaysWork());
		System.out.println(adminDept.getWorkDeadline());
		System.out.println(adminDept.isTodayAHoliday() + "\n");
		
		System.out.println(hrDept.departmentName());
		System.out.println(hrActivity.doActivity());
		System.out.println(hrDept.getTodaysWork());
		System.out.println(hrDept.getWorkDeadline());
		System.out.println(hrDept.isTodayAHoliday()+ "\n");
		
		System.out.println(techDept.departmentName());
		System.out.println(techDept.getTodaysWork());
		System.out.println(techDept.getWorkDeadline());
		System.out.println(techCode.getTechStackInformation());
		System.out.println(techDept.isTodayAHoliday());
		
	}
}
