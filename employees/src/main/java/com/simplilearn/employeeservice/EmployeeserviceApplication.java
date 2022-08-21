package com.simplilearn.employeeservice;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.simplilearn.employeeservice.entity.emp;
import com.simplilearn.employeeservice.repository.EmployeeRepository;

@SpringBootApplication
public class EmployeeserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeserviceApplication.class, args);
	}
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Bean
	public CommandLineRunner commandLineRunner() {
		 
		CommandLineRunner runner = new CommandLineRunner() {
			@Override
			public void run(String... args) throws Exception {
				
				emp e1 = new emp();
				e1.setName("nimisha");
				e1.setAddress("noida");
				e1.setDateOfJoin(LocalDate.of(2022, 03, 20));
				
				emp e2 = new emp();
				e2.setName("sonam");
				e2.setAddress("delhi");
				e2.setDateOfJoin(LocalDate.of(2022, 03, 20));
				
				emp e3 = new emp();
				e3.setName("geeta");
				e3.setAddress("agra");
				e3.setDateOfJoin(LocalDate.of(2022, 03, 20));
				
				employeeRepository.save(e1);
				employeeRepository.save(e2);
				employeeRepository.save(e3);
				
			}
			
		};
		return runner;
		
	}

}
