package pl.sdacademy.designpatterns.singleton;


public class CounterEager {
//tworzenie singletona EAGER -> na starcie aplikacji
    private static CounterEager counter = new CounterEager();
    private int value = 0;

    public static CounterEager getInstance() {
        return counter;
    }

    private CounterEager() {

    }
/////////////////
    public void addOne() {
        value++;
        System.out.println("Value is now" + value);

    }

    public void addTwo() {
        value += 2;
        System.out.println("Value increased by 2 is now" + value);
    }

    public void addThree() {
        value += 3;
        System.out.println("Value increased by 3 is now" + value);
    }

}



