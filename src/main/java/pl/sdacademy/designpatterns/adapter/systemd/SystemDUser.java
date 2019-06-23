package pl.sdacademy.designpatterns.adapter.systemd;

import java.time.LocalDate;

/*
birthDate(LocalDate)
•role(String)
•alias(String)
•name(String)
•Stwórz adapter klasy
 */
public class SystemDUser {
    private LocalDate birthDate;
    private String alias;
    private String name;
    private String role;

    public SystemDUser(final LocalDate birthDate, final String alias, final String name,final String role) {
        this.birthDate = birthDate;
        this.alias = alias;
        this.name = name;
        this.role=role;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(final LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public void setRole(final String role) {
        this.role = role;
    }

    public String getAlias() {
        return alias;
    }

    public String getRole() {
        return role;
    }

    public void setAlias(final String alias) {
        this.alias = alias;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "SystemDUser{" +
                "birthDate=" + birthDate +
                ", alias='" + alias + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
