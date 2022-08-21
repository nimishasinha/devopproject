package com.simplilearn.employeeservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.simplilearn.employeeservice.entity.emp;

public interface EmployeeRepository extends JpaRepository<emp, Integer> {

}
