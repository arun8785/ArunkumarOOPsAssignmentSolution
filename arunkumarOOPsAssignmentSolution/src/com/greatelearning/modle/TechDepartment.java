package com.greatelearning.modle;

public class TechDepartment extends SuperDepartment{
		// Tech Class which extends Super class and inherits its methods and also has its own method
		public String departmentName() {
			String depName;
			depName = "Welcome to Tech Department";
			return depName;
		}
		public String getTodaysWork() {
			String workStatus;
			workStatus = "Complete coding of module 1";
			return workStatus;
		}
		public String getWorkDeadline() {
			String workDeadline;
			workDeadline = "Complete by EOD";
			return workDeadline;
		}
		public String getTechStackInformation() {
			String workTechnology;
			workTechnology = "Core Java";
			return workTechnology;
		}
}
