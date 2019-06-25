package pl.sdacademy.designpatterns.observer.zad17DomoweObserverable;


import java.util.List;
import java.util.Observable;

class Chat extends Observable {
    final private List<String> newsList;

    Chat(final List<String> newsList) {
        this.newsList = newsList;
    }

    List<String> getNewsList() {
        return newsList;
    }

    void createNews(String news) {
        newsList.add(news);
        setChanged();
        notifyObservers();
    }
}
