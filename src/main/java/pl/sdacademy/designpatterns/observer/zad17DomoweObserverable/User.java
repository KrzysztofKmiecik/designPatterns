package pl.sdacademy.designpatterns.observer.zad17DomoweObserverable;


import java.util.Observable;
import java.util.Observer;

class User implements Observer {
    final private Chat chat;
    final private String nickName;

    User(final Chat chat, final String nickName) {
        this.chat = chat;
        this.nickName = nickName;
    }

    @Override
    public void update(final Observable chat, final Object arg) {
        if (this.chat == chat) {
            System.out.println("nickName=" + this.nickName + "\tmsg=" + this.chat.getNewsList().get(this.chat.getNewsList().size() - 1));
        }
    }
}
