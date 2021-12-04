package com.greatlearning.appmain;
import com.greatlearning.model.*;

public class DriverClass {

	public static void main(String[] args) {
		HrDepartment hr       = new HrDepartment();
		TechDepartment tech   = new TechDepartment();
		AdminDepartment admin = new AdminDepartment();
		System.out.println("Welcome to " + admin.departmentName()); //Admin Department
		System.out.println(admin.getTodaysWork());  //Admin Work
		System.out.println(admin.getWorkDeadline()); //Work Deadline
		System.out.println(admin.isTodayAHoliday() + "\n"); //Call the SuperClass's (SuperDepartment) Method 
		System.out.println("Welcome to " + hr.departmentName()); //HR Department
		System.out.println(hr.doActivity()); //Team Lunch
		System.out.println(hr.getTodaysWork());  //HR Work
		System.out.println(hr.getWorkDeadline()); //Work Deadline
		System.out.println(hr.isTodayAHoliday() + "\n");//Call the SuperClass's (SuperDepartment) Method
		System.out.println("Welcome to " + tech.departmentName()); //Tech Department
		System.out.println(tech.getTodaysWork()); //Tech Work
		System.out.println(tech.getWorkDeadline()); //Work Deadline
		System.out.println(tech.getTechStackInformation()); //Module Information
		System.out.println(tech.isTodayAHoliday() + "\n");//Call the SuperClass's (SuperDepartment) Method
		}

}
