package pl.sdacademy.designpatterns.observer.zad17Domowe;

public class User {
   final  private Chat chat;
   final  private String nickName;

    public User(final Chat chat,String nickName) {
        this.chat = chat;
        this.nickName=nickName;
        chat.subscribeUser(this);
    }

    public void update() {
        System.out.println("nickName="+this.nickName+"\tmsg="+chat.getNewsList().get(chat.getNewsList().size()-1));

    }


}
