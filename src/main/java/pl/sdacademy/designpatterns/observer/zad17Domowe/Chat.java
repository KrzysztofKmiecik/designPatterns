package pl.sdacademy.designpatterns.observer.zad17Domowe;

import java.util.List;

public class Chat {
    final private List<User> userList;
    final private List<String> newsList;

    public Chat(final List<User> userList, final List<String> newsList) {
        this.userList = userList;
        this.newsList = newsList;
    }

    public List<String> getNewsList() {
        return newsList;
    }

    public void subscribeUser(User user) {
        userList.add(user);
    }

    public void createNews(String news) {
        newsList.add(news);
        userList.forEach(User::update);

    }
}
