package pl.sdacademy.designpatterns.observer.zad17DomoweObserverable;

import java.util.ArrayList;
import java.util.List;

public class zad17Demo {

    public static void main(String[] args) {
        //  Zad17Demo zad17Demo = new Zad17Demo();

        final List<String> newsList = new ArrayList<>();
        final Chat chat = new Chat(newsList);
        final User user1 = new User(chat, "bolo");
        final User user2 = new User(chat, "kolo");
        final User user3 = new User(chat, "rolo");

        chat.addObserver(user1);

        chat.createNews("news no1");
        chat.createNews("news no2");
        chat.createNews("news no3");
    }
}
