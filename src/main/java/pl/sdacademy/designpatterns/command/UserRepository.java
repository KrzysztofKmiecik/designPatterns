package pl.sdacademy.designpatterns.command;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {

    public List<UserData> getUserData() {
        return userData;
    }

    List<UserData> userData = new ArrayList<>();

    public void addUser(final UserData user) {
        userData.add(user);
    }

    public void removeUser(final UserData user) {
        userData.remove(user);
    }
}
