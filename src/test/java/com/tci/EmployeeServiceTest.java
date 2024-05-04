package com.tci;
import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.tci.entity.Employee;
import com.tci.repository.EmployeeRepository;
import com.tci.service.EmployeeService;

@ExtendWith(MockitoExtension.class)
public class EmployeeServiceTest {

    @Mock
    private EmployeeRepository empRepo;

    @InjectMocks
    private EmployeeService employeeService;

    @Test
    public void testProcessEmployeeBonuses() {
        String joiningDate = "may-20-2022";
        
        // Mocking the behavior of your repository
        when(empRepo.findByJoiningDate(joiningDate)).thenReturn(Arrays.asList(
            new Employee("raj singh", "accounts", 5000, "INR", "may-20-2022", "may-20-2023")
        ));

        List<Employee> expectedEmployees = Arrays.asList(
            new Employee("raj singh", "accounts", 5000, "INR", "may-20-2022", "may-20-2023")
        );

        // Testing the service method
        List<Employee> actualEmployees = employeeService.findAllByJoiningDate(joiningDate);

        // Assertion
        assertEquals(expectedEmployees, actualEmployees);
    }

	private void assertEquals(List<Employee> expectedEmployees, List<Employee> actualEmployees) {
		// TODO Auto-generated method stub
		
	}
}
