package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        ApplicationContext applicationContext =  SpringApplication.run(Main.class, args);

        EmployeeService employeeService = applicationContext.getBean(EmployeeService.class);

        employeeService.addEmployee(new Employee(100L, "ramesh", "fadatare", "ramesh@gmail.com"));

        employeeService.getEmployeeById(100L);

        employeeService.getAllEmployees();
    }
}