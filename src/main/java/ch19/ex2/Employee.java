package ch19.ex2;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Collectors;

public class Employee {
	private String firstName;
	private String lastName;
	private String email;
	
	public static List<Employee> load(InputStream in) {
		return new BufferedReader(new InputStreamReader(in)).lines().map(line -> {
			var cells = line.split(",");
			var employee = new Employee();
			employee.setFirstName(cells[0]);
			employee.setLastName(cells[1]);
			employee.setEmail(cells[2]);
			return employee;
		}).collect(Collectors.toList());
	}
	
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	
}
