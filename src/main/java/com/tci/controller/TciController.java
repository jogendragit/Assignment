package com.tci.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.tci.entity.Employee;
import com.tci.exception.FinalResponse;
import com.tci.service.EmployeeService;



@Controller("/tci")
public class TciController {
	
	@Autowired
	private EmployeeService service;
	
	private FinalResponse response;
	
	
	@PostMapping("/employee-bonus")
	public ResponseEntity<FinalResponse> saveAll(@RequestBody List<Employee> employee) {
		service.saveAll(employee);
		response = new FinalResponse(true, "success", null);
		ResponseEntity<FinalResponse> entity = ResponseEntity.ok(response);
		return entity ;
	}
	
	
	@GetMapping("/employee-bonus")
	public ResponseEntity<FinalResponse> getByJoiningDate(@RequestParam("date") String date) {
		
		List<Employee> employee = service.findAllByJoiningDate(date);
		response = new FinalResponse(true, "success", employee);
		ResponseEntity<FinalResponse> entity = ResponseEntity.ok(response);
		return entity ;
	}
	
	
	
	
	

}
