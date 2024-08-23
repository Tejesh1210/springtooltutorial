package com.dailycodebuffer.springboot.tutorial.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.dailycodebuffer.springboot.tutorial.entity.Department;
import com.dailycodebuffer.springboot.tutorial.repository.DepartmentRepository;

@SpringBootTest
class DepartmentServiceTest {
	@Autowired
	private DepartmentService departmentService;

	@MockBean
	private DepartmentRepository departmentRepository;

	@BeforeEach
	void setUp()
	{
		Department department=Department.
	}

	@Test
	public void whenValidDepartmentName_thenDepartmentShouldFound() {
		String departName = "IT";
		Department found = departmentService.fetchDepartmentByName(departName);
		assertEquals(departName, found.getDepartmentName());

	}

}
