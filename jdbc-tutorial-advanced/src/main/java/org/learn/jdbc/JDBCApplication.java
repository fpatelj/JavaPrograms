package org.learn.jdbc;

import org.learn.jdbc.dao.EmployeeDao;
import org.learn.jdbc.domain.Employee;
import org.learn.jdbc.domain.impl.EmployeeDaoImpl;


public class JDBCApplication {


	public static void main(String[] args) {

		Employee employee = new Employee(1010, "Erich Maria Remarque");
		EmployeeDao employeeDao = new EmployeeDaoImpl();
		employeeDao.insert(employee);
	}

}
