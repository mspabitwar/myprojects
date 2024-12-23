package com.java.durga.concept09.predicates;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;

class Employee {
	String name;
	String designation;
	double salary;
	String city;

	public Employee(String name, String designation, double salary, String city) {
		super();
		this.name = name;
		this.designation = designation;
		this.salary = salary;
		this.city = city;
	}

	@Override
	public String toString() {
		return String.format("(%s,%s,%.2f,%s)", name, designation, salary, city);
	}

	@Override
	public int hashCode() {
		return Objects.hash(city, designation, name, salary);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(city, other.city) && Objects.equals(designation, other.designation)
				&& Objects.equals(name, other.name)
				&& Double.doubleToLongBits(salary) == Double.doubleToLongBits(other.salary);
	}
}

public class EmployeeManagementSystem {

	public static void main(String[] args) {
		
		List<Employee> employees = populate();
		System.out.println(employees);
		System.out.println("*************************************");
		
		Predicate<Employee> managerPredicate = emp -> emp.designation.equals("Manager");
		System.out.println("The employees who are managers are:");
		display(managerPredicate, employees);
		
		Predicate<Employee> banglorePredicate = emp -> emp.city.equals("Bangalore");
		System.out.println("The employees from Bangalore are:");
		display(banglorePredicate, employees);
		
		Predicate<Employee> salaryPredicate = emp -> emp.salary < 20000;
		System.out.println("The employees having salary < 20000 are:");
		display(salaryPredicate, employees);
		
		Predicate<Employee> bangloreManagers = banglorePredicate.and(managerPredicate);
		System.out.println("The managers from Bangalore location are:");
		display(bangloreManagers, employees);
		
		System.out.println("Employees who are managers or salary < 20000 are:");
		display(managerPredicate.or(salaryPredicate), employees);
		
		System.out.println("Employees who are not managers are:");
		display(managerPredicate.negate(), employees);
		
		Predicate<Employee> isCEO=Predicate.isEqual(new Employee("Durga","CEO",30000,"Hyderabad"));
		Employee e1=new Employee("Durga","CEO",30000,"Hyderabad");
		Employee e2=new Employee("Sunny","Manager",20000,"Hyderabad");
		System.out.println(isCEO.test(e1));//true
		System.out.println(isCEO.test(e2));//false
	}

	private static List<Employee> populate() {
		return Arrays.asList(
			new Employee("Durga", "CEO", 30000, "Hyderabad"),
			new Employee("Durga","CEO",30000,"Hyderabad"),
			new Employee("Sunny","Manager",20000,"Hyderabad"),
			new Employee("Mallika","Manager",20000,"Bangalore"),
			new Employee("Kareena","Lead",15000,"Hyderabad"),
			new Employee("Katrina","Lead",15000,"Bangalore"),
			new Employee("Anushka","Developer",10000,"Hyderabad"),
			new Employee("Kanushka","Developer",10000,"Hyderabad"),
			new Employee("Sowmya","Developer",10000,"Bangalore"),
			new Employee("Ramya","Developer",10000,"Bangalore")
		);
	}
	
	private static void display(Predicate<Employee> predicate, List<Employee> employees) {
		for(Employee emp: employees) {
			if(predicate.test(emp)) {
				System.out.println(emp);
			}
		}
		System.out.println("*************************************");
	}
}