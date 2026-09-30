package com.example.bankingproject.serviceImple;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bankingproject.entity.Employee;
import com.example.bankingproject.repository.EmployeeRepository;
import com.example.bankingproject.service.CreateEmployee;


@Service
public class CreateImpleEmp implements CreateEmployee {
@Autowired
	private EmployeeRepository employeeRepository;
	
	public CreateImpleEmp(EmployeeRepository employeeRepository) {
		super();
		this.employeeRepository = employeeRepository;
	}

	public CreateImpleEmp() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public Employee saveData(Employee employee) {
		// TODO Auto-generated method stub
		return employeeRepository.save(employee);
	}

	

}
