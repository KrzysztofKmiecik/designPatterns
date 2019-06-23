package pl.sdacademy.designpatterns.adapter;

import pl.sdacademy.designpatterns.adapter.systema.SystemAUser;
import pl.sdacademy.designpatterns.adapter.systema.SystemAUserAdapter;
import pl.sdacademy.designpatterns.adapter.systemb.SystemBUser;
import pl.sdacademy.designpatterns.adapter.systemb.SystemBUserAdapter;
import pl.sdacademy.designpatterns.adapter.systemc.SystemCUser;
import pl.sdacademy.designpatterns.adapter.systemc.SystemCUserAdapter;
import pl.sdacademy.designpatterns.adapter.systemd.SystemDUser;
import pl.sdacademy.designpatterns.adapter.systemd.SystemDUserAdapter;

import java.time.LocalDate;
import java.time.Month;
import java.util.Collections;


public class AdapterDemo {
    public static void main(String[] args) {
        final SystemAUser systemAUser = new SystemAUser("Michal", "Bocian", 22, Collections.singletonList("USER"));
        final SystemBUser systemBUser = new SystemBUser("Andrzej Nowak", "Endrju", "33", Collections.singleton("ADMIN"));
        final SystemCUser systemCUser = new SystemCUser("Dany", "De", 933232933, "ADMIN");
        final SystemDUser systemDUser = new SystemDUser(LocalDate.of(2012, Month.JANUARY, 2), "Denio", "Ali", "ADMIN");
        final User userA = new SystemAUserAdapter(systemAUser);
        final User userB = new SystemBUserAdapter(systemBUser);
        final User userC = new SystemCUserAdapter(systemCUser);
        final User userD = new SystemDUserAdapter(systemDUser);

        System.out.println(userA.getFullname());
        System.out.println(userA.getAge());
        System.out.println(userA.getUsername());
        System.out.println(userA.getRoles());

        System.out.println(userB.getFullname());
        System.out.println(userB.getAge());
        System.out.println(userB.getUsername());
        System.out.println(userB.getRoles());

        System.out.println(userC.getFullname());
        System.out.println(userC.getAge());
        System.out.println(userC.getUsername());
        System.out.println(userC.getRoles());

        System.out.println(userD.getFullname());
        System.out.println(userD.getAge());
        System.out.println(userD.getUsername());
        System.out.println(userD.getRoles());
    }
}
