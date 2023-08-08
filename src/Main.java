import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        Department dept1 = new Department("Accounting");
        Department dept2 = new Department("IT");
        Department dept3 = new Department("Sales");

        List<Department> departments = new ArrayList<>();
        departments.add(dept1);
        departments.add(dept2);
        departments.add(dept3);

        // Address object
        Address address = new Address("281 Pineapple Way", "Vineland", "Atlantic", "08033");

        // Company object
        Company MSCSNJ = new Company("MSCSNJ", address);

        SalariedEmployee emp1 = new SalariedEmployee("Elon Musk", 75000, dept1);
        SalariedEmployee emp2 = new SalariedEmployee("Bill Gates", 75000, dept2);
        SalariedEmployee emp3 = new SalariedEmployee("Rupert Murdoch", 75000, dept3);
        SalariedEmployee emp4 = new SalariedEmployee("Jeff Bezos", 75000, dept3);
        SalariedEmployee emp5 = new SalariedEmployee("Charlie Koch", 75000, dept1);

        // Employee Array
        Employee[] employees = {emp1, emp2, emp3, emp4, emp5};

        // Print info
        List<Employee> employeeList = Arrays.asList(employees);

        // Print Stream
       // employeeList.stream().forEach(System.out::println);

        // Group
        System.out.println("Employees Grouped");
        Map<String, List<Employee>> groupedByDepartment =
                employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment));
        groupedByDepartment.forEach(
                (department, employeesInDepartment) ->
                {
                    System.out.println(department);
                    employeesInDepartment.forEach(
                      employee -> System.out.printf("  %s%n", employee)
                    );
                }
        );


    }
}