package com.greatelearning.modle;

public class AdminDepartment extends SuperDepartment{
	   // Admin Class which extends Super class and inherits its methods
		public String departmentName() {
			String depName;
			depName = "Welcome to Admin Department";
			return depName;
		}
		public String getTodaysWork() {
			String workStatus;
			workStatus = "Complete your document Submission";
			return workStatus;
		}
		public String getWorkDeadline() {
			String workDeadline;
			workDeadline = "Complete by EOD";
			return workDeadline;
		}
}
