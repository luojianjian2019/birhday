package birthday.greetings;

import java.time.LocalDate;
import java.util.Date;

public class Employee {
    private String firstName;
    private String lastName;
    private LocalDate date;
    private String email;
    private Date birthday;
    private String eamil;

    public Employee(String firstName, String lastName, LocalDate date, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.date = date;
        this.email = email;
    }

    public Employee() {

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

    public void setLastName(String lastName) {
        this.firstName = lastName;
    }

    public String getLastName() {
        return firstName;
    }

    public void setBirthday(LocalDate birthday) {
        this.date = birthday;
    }

    public LocalDate getBirthday() {
        return date;
    }

    public void setEamil(String eamil) {
        this.eamil = eamil;
    }

    public String getEamil() {
        return eamil;
    }
}
