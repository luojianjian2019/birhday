package birthday.greetings;

import java.time.LocalDate;

public class Employee {
    private String firstName;
    private String lastName;
    private LocalDate date;
    private String email;

    public Employee(String firstName, String lastName, LocalDate date, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.date = date;
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
