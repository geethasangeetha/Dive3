package spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import model.Employee;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          ApplicationContext  context =new  AnnotationConfigApplicationContext(Employee.class);
          Employee emp=(Employee)context.getBean(Employee.class);
          emp.setEmpId(12);
          emp.setEmpName("gaji");
          emp.setMobileNumber(9080706050L);
          System.out.println(emp);
          ((AbstractApplicationContext) context).close();
          
	}

}
