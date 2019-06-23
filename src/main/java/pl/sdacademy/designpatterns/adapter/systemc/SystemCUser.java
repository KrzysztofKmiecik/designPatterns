package pl.sdacademy.designpatterns.adapter.systemc;

import java.util.Set;

public class SystemCUser {
    private String firstName;
    private String lastName;
    private long birthDateTimeStamp;
    private String role;

    public SystemCUser(final String firstName, final String lastName, final long birthDateTimeStamp, final String role) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDateTimeStamp = birthDateTimeStamp;
        this.role = role;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(final String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(final String lastName) {
        this.lastName = lastName;
    }

    public long getBirthDateTimeStamp() {
        return birthDateTimeStamp;
    }

    public void setBirthDateTimeStamp(final long birthDateTimeStamp) {
        this.birthDateTimeStamp = birthDateTimeStamp;
    }

    public String getRole() {
        return role;
    }

    public void setRole(final String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "SystemCUser{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthDateTimeStamp=" + birthDateTimeStamp +
                ", role='" + role + '\'' +
                '}';
    }
}
