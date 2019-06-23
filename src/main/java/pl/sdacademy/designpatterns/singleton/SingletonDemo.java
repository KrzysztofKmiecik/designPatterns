package pl.sdacademy.designpatterns.singleton;

public class SingletonDemo {
    public static void main(String[] args) {
        final CounterEager counterA = CounterEager.getInstance();
        final CounterEager counterB = CounterEager.getInstance();
        counterA.addOne();
        counterA.addThree();
        counterB.addTwo();
        counterB.addThree();


        final AppConnections appConnectionsA = AppConnections.getInstance();
        final AppConnections appConnectionsB = AppConnections.getInstance();

        appConnectionsA.connectUser("Andrzej");
        appConnectionsA.connectUser("Michal");
        appConnectionsA.getConnectedUsers().forEach(System.out::println);


        final EnumSingleton enumSingletonA=EnumSingleton.INSTANCE;
        final EnumSingleton enumSingletonB=EnumSingleton.INSTANCE;

    }
}
