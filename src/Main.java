import java.util.Scanner;

public class Main {


	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please input the number of employees!");
		int numberOfEmployees = scanner.nextInt();
		
		Employee[] employees = new Employee[numberOfEmployees];
		
		for (int i = 0; i < employees.length; i++) {
			System.out.println("Please input the name of the employee!");
			String tempName = scanner.next();
			System.out.println("Please input the age of the employee!");
			int tempAge = scanner.nextInt();
			employees[i] = new Employee(tempName, tempAge);
			System.out.println(employees[i]);
		}
		
		Employee.setPensionRemainingAge(75);
		
		for (Employee employee : employees) {
			System.out.println(employee);
		}
		
		for (Employee employee : employees) {
			if (employee.getRemainingYearsUntilPension() < 5) {
				System.out.println(employee);
			}
		}
		
		int avgAgeRemaining = 0;
	
		for (Employee employee : employees) {
			avgAgeRemaining = employee.getRemainingYearsUntilPension();
		}
		
		avgAgeRemaining /= employees.length;
		
		for (Employee employee : employees) {
			if (employee.getRemainingYearsUntilPension() > avgAgeRemaining) {
				System.out.println(employee);
			}
		}
	
		for (int i = 0; i < employees.length; i++) {
			
			int max = i;
			
			for (int j = i+1; j < employees.length; j++) {
				if (employees[max].getRemainingYearsUntilPension() < employees[j].getRemainingYearsUntilPension()) {
					max = j;
				}	
			}
			
			Employee tempEmployee = new Employee(employees[i].getEmployeeName(), employees[i].getAge());
			employees[i] = new Employee(employees[max].getEmployeeName(), employees[max].getAge());
			employees[max] = new Employee(tempEmployee.getEmployeeName(), tempEmployee.getAge());
		}
		
		for (Employee employee : employees) {
			System.out.println(employees);
		}
		
		for (int i = 0; i < employees.length; i++) {
			
			int min = i;
			
			for (int j = i+1; j < employees.length; j++) {
				if (employees[min].getRemainingYearsUntilPension() > employees[j].getRemainingYearsUntilPension()) {
					min = j;
				}	
			}
			
			Employee tempEmployee = new Employee(employees[i].getEmployeeName(), employees[i].getAge());
			employees[i] = new Employee(employees[min].getEmployeeName(), employees[min].getAge());
			employees[min] = new Employee(tempEmployee.getEmployeeName(), tempEmployee.getAge());
		}
		
		for (Employee employee : employees) {
			System.out.println(employees);
		}
	}
}