package pl.sdacademy.designpatterns.adapter.systemb;

import java.util.Set;

public class SystemBUser {
    private String fullName;
    private String displayName;
    private String age;
    private Set<String> roles;

    @Override
    public String toString() {
        return "SystemBUser{" +
                "fullName='" + fullName + '\'' +
                ", displayName='" + displayName + '\'' +
                ", age='" + age + '\'' +
                ", roles=" + roles +
                '}';
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setRoles(Set<String> roles) {
        this.roles = roles;
    }

    public String getFullName() {
        return fullName;
    }

    public String getDisplayName() {
        return displayName;
    }

    public String getAge() {
        return age;
    }

    public Set<String> getRoles() {
        return roles;
    }

    public SystemBUser(String fullName, String displayName, String age, Set<String> roles) {
        this.fullName = fullName;
        this.displayName = displayName;
        this.age = age;
        this.roles = roles;
    }
}
