package com.greatelearning.modle;

public class HrDepartment extends SuperDepartment{
		// HR Class which extends Super class and inherits its methods and also has its own method
		public String departmentName() {
			String depName;
			depName = "Welcome to Hr Department";
			return depName;
		}
		public String getTodaysWork() {
			String workStatus;
			workStatus = "Fill today’s worksheet and mark your attendance";
			return workStatus;
		}
		public String getWorkDeadline() {
			String workDeadline;
			workDeadline = "Complete by EOD";
			return workDeadline;
		}
		public String doActivity() {
			String workActivity;
			workActivity = "Team Lunch";
			return workActivity;
		}
}
