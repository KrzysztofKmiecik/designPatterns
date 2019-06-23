package pl.sdacademy.designpatterns.proxy.security;

import java.util.ArrayList;
import java.util.List;

public class SimplePersonManager implements PersonManager {
    private List<Person> users = new ArrayList<>();

    @Override
    public void addPerson(Person person) {
//       boolean exists;
//        for (final Person p : users){
//            if(p.getEmail().equalsIgnoreCase(person.getEmail())){
//                exists=true;
//                break;
//            }
//        }
        final boolean emailExist = users.stream().anyMatch(p -> p.getEmail().equalsIgnoreCase(person.getEmail()));
        if (!emailExist) {
            users.add(person);
        } else {
            //tutaj powinien byc wyspecyfikowny typ wyjatku ktory dziedziczy
            throw new RuntimeException("User with email already exists");
        }
    }

    @Override
    public void deletePerson(String email) {
//        final Optional<Person> personToDelete = users.stream()
//                .filter(p -> p.getEmail().equalsIgnoreCase(email))
//                .findFirst();
//
//        if (personToDelete.isPresent()) {
//            users.remove(personToDelete.get());
//        }


        users.stream()
                .filter(p -> p.getEmail().equalsIgnoreCase(email))
                .findFirst()
                .ifPresent(p -> users.remove(p));

//

    }

    @Override
    public List<Person> getAllPeople() {
        return users;
    }

    @Override
    public boolean isPersonPresent(String name) {
        return users.stream().anyMatch(p -> p.getName().equalsIgnoreCase(name));
//Stream.of("asd,"qwe");

    }

    @Override
    public void validateEmail(String email) {
        users.stream()
                .filter(p -> p.getEmail().equalsIgnoreCase(email))
                .findFirst()
                .ifPresent(p -> p.setVerified(true));
    }
}
