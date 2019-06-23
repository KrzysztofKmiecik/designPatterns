package pl.sdacademy.designpatterns.singleton;

import java.util.ArrayList;
import java.util.List;

public class AppConnections {

    private  List<String> connectedUsers;
    private int currentConnections=0;
    private long timeout;
///singleton eager
//  private static AppConnections appConnections=new AppConnections();
//eager
//   public static AppConnections getInstance(){
//        return appConnections;
//    }

//lazy
   private static AppConnections appConnections;
//lazy
//    public static AppConnections getInstance(){
//        if(appConnections==null){
//            appConnections=new AppConnections();
//            System.out.println("Initializad AppConnections");
//        }
//
//        return appConnections;
//    }

 //double check
 public static AppConnections getInstance(){
     if(appConnections==null){
         synchronized (AppConnections.class){
             if(appConnections==null){
                 appConnections=new AppConnections();
                 System.out.println("Initializad AppConnections");
             }
         }
     }

     return appConnections;
 }

    private AppConnections(){
      connectedUsers=new ArrayList<>();
    }

    public void setConnectedUsers(List<String> connectedUsers) {
        this.connectedUsers = connectedUsers;
    }

    public void setCurrentConnections(int currentConnections) {
        this.currentConnections = currentConnections;
    }

    public void setTimeout(long timeout) {
        this.timeout = timeout;
    }

    public static void setAppConnections(AppConnections appConnections) {
        AppConnections.appConnections = appConnections;
    }

    public int getCurrentConnections() {
        return currentConnections;
    }

    public long getTimeout() {
        return timeout;
    }

    public static AppConnections getAppConnections() {
        return appConnections;
    }



    public List<String> getConnectedUsers(){
        return connectedUsers;
    }


    public void connectUser(final String username){
        connectedUsers.add(username);
    }
}
