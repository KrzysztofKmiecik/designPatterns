package pl.sdacademy.designpatterns.observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    //musi miec liste obserwatorow
    private List<Observer> observers = new ArrayList<>();
    private int value = 0;

    public int getValue() {
        return value;
    }

    //mozliwosc dodania obserwatora
    public void subscribe(final Observer observer) {
        observers.add(observer);
    }

    //zmiana wartosci
    public void changeValueby(final int changed) {
        value += changed;
        //poinformuj obserwatorow o zmianach
        observers.forEach(Observer::update); //hej jest nowa wiadomosc
    }

}
