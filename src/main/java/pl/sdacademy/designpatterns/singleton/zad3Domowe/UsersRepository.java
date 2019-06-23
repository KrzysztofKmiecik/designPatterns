package pl.sdacademy.designpatterns.singleton.zad3Domowe;

import java.util.HashMap;
import java.util.Map;

public enum UsersRepository {
    INSTANCE;


    private Map<String, String> usernamesToEmails = new HashMap<>();

    public Map<String, String> getUsernamesToEmails() {
        return usernamesToEmails;
    }

    public void addUser(String username, String email) {
        usernamesToEmails.put(username, email);
    }
}
