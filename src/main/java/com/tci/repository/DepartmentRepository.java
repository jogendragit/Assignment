package com.tci.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tci.entity.Department;


public interface DepartmentRepository extends JpaRepository<Department, Long>{	

}
