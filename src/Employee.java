import java.time.LocalDate;


public class Employee {

	private String employeeName;
	private long salary;
	private LocalDate birthday;
	
	static int pensionRemainingAge = 65;
	
	public Employee(String employeeName, long salary, int age) {
		super();
		this.employeeName = employeeName;
		this.salary = salary;
		this.birthday = birthday;
	}
	
	public Employee(String employeeName, int age) {
		super();
		this.employeeName = employeeName;
		this.birthday = birthday;
		
		this.salary = LocalDate.now().getYear()-birthday.getYear()*10000;
	}
	
	public int getRemainingYearsUntilPension() {
		
		
		return pensionRemainingAge - getAge();
	}

	public static int getPensionRemainingAge() {
		return pensionRemainingAge;
	}

	public static void setPensionRemainingAge(int pensionRemainingAge) {
		Employee.pensionRemainingAge = pensionRemainingAge;
	}
	
	public static Employee getYoungerEmployee(Employee employee1, Employee employee2) {
		
		if(employee1.getRemainingYearsUntilPension() > employee2.getRemainingYearsUntilPension())
			return employee1;
		else
			return employee2;
	}

	@Override
	public String toString() {
		return "Employee [employeeName=" + employeeName + ", salary=" + salary
				+ ", birthday=" + birthday
				+ ", getRemainingYearsUntilPension()="
				+ getRemainingYearsUntilPension() + "]";
	}

	public int getAge() {
		return LocalDate.now().getYear()-birthday.getYear()*10000;
	}

	public long increaseSalary(long increase, long employeeSalary) {
		
		return employeeSalary+=increase;
		
	}
	
	public String displayInfo() {
		
		return "Salary:" +this.salary+ " Name: "+ this.employeeName;
	}

	public String getEmployeeName() {
		
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		
		this.employeeName = employeeName;
	}

	public long getSalary() {
		
		return salary;
	}

	public void setSalary(long salary) {
		
		this.salary = salary;
	}
	
	public boolean isInSalaryRange(long salaryStart, long salaryEnd) {
		
		if (this.salary<salaryEnd && this.salary>=salaryStart) {
			
			return true;
		}
		
		else return false;

	}
	
	public long getTax() {
		
		return (long) (this.salary*0.16);
	}
	
	public boolean hasHigherSalary(Employee employee) {
		
		if (this.salary>employee.salary) {
		
			return true;
		}
		
		else return false;
	}
	
}
