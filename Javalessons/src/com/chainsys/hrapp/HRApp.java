package com.chainsys.hrapp;
/**
 * 
 * @author leel3110
 *
 */

public class HRApp {
	/**
	 * @param args the command line arguments
	 */
	public static void main(String[]args) {
		System.out.println("HRApp Starts");
		Employee e1 = new Employee(230,"Jerry",333998);
		Employee e2 = new Employee(420,"Gracie",333994);
		System.out.println("Emp"+e1);
		System.out.println("Emp"+e2);
		Department de=new Department("Education");
		de.addEmp(e1);
		de.addEmp(e2);
		de.addEmp(new Employee(772,"Jack",2998));
		Employee[] emps =de.getEmployees();
		for(Employee emp:emps) {
			System.out.println("Emp"+emp);
			//System.out.println("Emp"+e2);
		}
		System.out.println("Total"+de.getTotalSalary());
		System.out.println("Avg"+de.getAverageSalary());
		System.out.println("Emp"+de.getEmployeeByID(233122));
		
	}

}
