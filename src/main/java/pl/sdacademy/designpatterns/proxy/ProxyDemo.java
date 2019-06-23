package pl.sdacademy.designpatterns.proxy;

import pl.sdacademy.designpatterns.proxy.security.*;

import java.time.LocalDate;

public class ProxyDemo {
    public static void main(String[] args) {
        final ConfigLoader configLoader = new ConfigLoaderProxy(new DatabaseConfigLoader("jdbs:h2:mem:testdb"));
        configLoader.load();
        System.out.println("XXX");
        configLoader.load();
        System.out.println("XXX");
        configLoader.load();

        final long timeStamp = System.currentTimeMillis();
        final long msInYear = 365L * 24 * 60 * 60 * 1000;
        System.out.println(timeStamp / msInYear);


        final Person admin = new Person("Andrez", "admin@gmai.com", "1212", LocalDate.now(), Role.ADMIN, 2, true);
        final Person user = new Person("Michal", "user@gmai.com", "1212", LocalDate.now(), Role.USER, 2, true);
        final PersonManager personManager = new PersonManagerProxy(new SimplePersonManager(), user);
        personManager.addPerson((admin));
        personManager.getAllPeople().forEach(System.out::println);

    }
}
