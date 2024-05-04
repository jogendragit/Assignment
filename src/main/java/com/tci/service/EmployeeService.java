package com.tci.service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.tci.entity.Employee;
import com.tci.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository empRepo;
	private static final Logger logger = Logger.getLogger(EmployeeService.class.getName());

	
	public List<Employee> saveAll(List<Employee> employee) {
		return empRepo.saveAll(employee);
	}
	public List<Employee> findAllByJoiningDate(String joiningDate){
	
		List<Employee> employeeList = new ArrayList<>();
		try {
		employeeList = empRepo.findByJoiningDate(joiningDate);
		}catch (Exception e) {
			logger.log(Level.SEVERE, "An error occurred while fetching employees by joining date", e);
		}
		Comparator<Employee> c = (e1,e2)->e1.getCurrency().compareTo(e2.getCurrency());
		employeeList.sort(c);	
		
		return employeeList;
	}
	
	

}
