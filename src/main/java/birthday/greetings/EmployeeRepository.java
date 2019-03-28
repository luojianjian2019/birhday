package birthday.greetings;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class EmployeeRepository {
    public List<Employee> getEmployees() {
        return readFileToString().stream()
                .skip(1)
                .map(line -> line.split(","))
                .map(tempArr -> new Employee(tempArr[1], tempArr[0], LocalDate.parse(tempArr[2], DateTimeFormatter.ofPattern("yyyy/MM/dd")), tempArr[3]))
                .collect(toList());
    }
    private List<String> readFileToString() {
        try {
            return FileUtils.readLines(new File(""), "UTF-8");
        } catch (IOException e) {
            e.printStackTrace();
            return new ArrayList<>();
        }
    }
}