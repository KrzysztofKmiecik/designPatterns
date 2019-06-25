package pl.sdacademy.designpatterns.observer.zad17Domowe;

import java.util.ArrayList;
import java.util.List;

public class Zad17Demo {
    public static void main(String[] args) {
        final List<User> userList = new ArrayList<>();
        final List<String> newsList = new ArrayList<>();

        final Chat chat = new Chat(userList, newsList);
        final User user1 = new User(chat, "bobo");
        final User user2 = new User(chat, "frodo");
        final User user3 = new User(chat, "kodo");

        chat.createNews("news no 1");
        chat.createNews("news no 2");
        chat.createNews("news no 3");


    }
}
