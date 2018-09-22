package ch19.ex2;

import static org.assertj.core.api.Assertions.assertThat;

import java.io.ByteArrayInputStream;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class EmployeeTest {

	@Test
	@DisplayName("テキストファイルを指定してメソッドを実行すると、名前、苗字、メールアドレスが反映されたEmployeeオブジェクトのリストを取得できる。")
	void testLoad() {
		var employee = new Employee();
		employee.setFirstName("Ichiro");
		employee.setLastName("Tanaka");
		employee.setEmail("ichiro@example.com");
		
		var in = new ByteArrayInputStream("Ichiro,Tanaka,ichiro@example.com".getBytes());
		var employees = Employee.load(in);
		assertThat(employees).hasSize(1);
		assertThat(employees.get(0)).isEqualToComparingFieldByField(employee);
	}

}
