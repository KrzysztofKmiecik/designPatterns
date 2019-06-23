package pl.sdacademy.designpatterns.adapter.systemd;

import pl.sdacademy.designpatterns.adapter.User;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class SystemDUserAdapter implements User {
    private SystemDUser systemDUser;

    public SystemDUserAdapter(final SystemDUser systemDUser) {
        this.systemDUser = systemDUser;
    }

    @Override
    public String getFullname() {
        return systemDUser.getName();
    }

    @Override
    public String getUsername() {
        return systemDUser.getAlias();
    }

    @Override
    public Integer getAge() {
        LocalDate localDate = LocalDate.now();
        LocalDate years = LocalDate.now().minusYears(systemDUser.getBirthDate().getYear());
        return years.getYear();
    }

    @Override
    public List<String> getRoles() {
        List<String> list = new ArrayList<>();
        list.add(systemDUser.getRole());
        return list;
    }
}
