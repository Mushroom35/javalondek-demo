package pl.sda.javalondek4.java_demo.office_example;


import java.util.List;

public class DepartmentSalaryCalculator {

     public long calculateSalaryDorDepartment(List<? extends Employee> employees) {
         return employees.stream()
                 .mapToLong(employee -> employee.getSalary())
                 .sum();
     }
}
