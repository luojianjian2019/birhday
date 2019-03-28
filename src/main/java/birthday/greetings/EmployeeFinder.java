package birthday.greetings;

import com.google.common.collect.Lists;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeFinder {
    public List<Employee> finder(LocalDate date) {
        List<Employee> employees = Lists.newArrayList(new Employee("ddd","ggg",LocalDate.of(2019,2,23),"fdfd@qq.com"),new Employee("kkk","fff",LocalDate.of(2019,2,22),"4545@qq.com"));
        return employees.stream().filter(employee -> employee.getDate().getMonth().equals(date.getMonth()) && employee.getDate().getDayOfMonth()==date.getDayOfMonth()).collect(Collectors.toList());
    }
}
