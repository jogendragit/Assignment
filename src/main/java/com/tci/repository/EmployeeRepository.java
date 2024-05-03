package com.tci.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.tci.entity.Employee;


@EnableJpaRepositories
public interface EmployeeRepository extends JpaRepository<Employee, Long>{	
	
	List<Employee> findByJoiningDate(String joiningDate);

}
