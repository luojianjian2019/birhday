package birthday.greetings;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import static java.time.Month.FEBRUARY;
import static java.util.stream.Collectors.toList;

public class EmployeeFinder {
    private final EmployeeRepository employeeRepository;

    public EmployeeFinder(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public List<Employee> finder(LocalDate date) {
        List<Employee> employees = employeeRepository.getEmployees();
        return employees.stream()
                .filter(employee -> isSatisfied(date, employee))
                .collect(toList());
    }

    private boolean isSatisfied(LocalDate date, Employee employee) {
        return (employee.getDate().getMonth().equals(date.getMonth())
                && employee.getDate().getDayOfMonth() == date.getDayOfMonth())
                || (employee.getDate().isLeapYear()
                && date.getMonth().equals(FEBRUARY) && employee.getDate().getMonth().equals(date.getMonth()) &&
                employee.getDate().getDayOfMonth() == (date.getDayOfMonth() - 1));
    }
}
