package com.tci.service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tci.entity.Employee;
import com.tci.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository empRepo;
	
	
	public List<Employee> saveAll(List<Employee> employee) {
		return empRepo.saveAll(employee);
	}
	public List<Employee> findAllByJoiningDate(String joiningDate){
		List<Employee> employeeList = new ArrayList<>();
		employeeList = empRepo.findByJoiningDate(joiningDate);
	
		Comparator<Employee> c = (e1,e2)->e1.getCurrency().compareTo(e2.getCurrency());
		employeeList.sort(c);	
		
		return employeeList;
	}
	
	

}
