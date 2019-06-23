package pl.sdacademy.designpatterns.builder.zad6Domowe;

public class zad6Demo {
    public static void main(String[] args) {

        final Person person1=Person.builder().name("Franek").surname("Kolasa").age(34).build();
        final Person person2=Person.builder().name("Zosia").surname("Kolasa").age(30).build();

        System.out.println(person1.toString());
        System.out.println(person2.toString());

    }
}
