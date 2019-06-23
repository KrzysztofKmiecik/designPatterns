package pl.sdacademy.designpatterns.adapter.systemc;

import pl.sdacademy.designpatterns.adapter.User;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class SystemCUserAdapter implements User {
    private SystemCUser systemCUser;

    public SystemCUserAdapter(final SystemCUser systemCUser) {
        this.systemCUser = systemCUser;
    }

    @Override
    public String getFullname() {
        return systemCUser.getFirstName()+ ""+ systemCUser.getLastName();
    }

    @Override
    public String getUsername() {
        return systemCUser.getLastName();
    }

    @Override
    public Integer getAge() {
        final long timeStamp = systemCUser.getBirthDateTimeStamp();//System.currentTimeMillis();
        final long msInYear = 365L * 24 * 60 * 60 * 1000;
        Integer age=(int)(timeStamp / msInYear);
        return age;


    }

    @Override
    public List<String> getRoles() {
      // return  systemBUser.getRoles().stream().collect(Collectors.toList());
       List<String> list=new ArrayList<>();
       list.add(systemCUser.getRole());
        return list;
    }
}
