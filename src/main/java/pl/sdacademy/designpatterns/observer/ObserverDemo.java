package pl.sdacademy.designpatterns.observer;

public class ObserverDemo {
    public static void main(String[] args) {
        final Subject subject = new Subject();
        final Observer observerA = new ConcreteValueObserver(subject);
        final Observer observerB = new ValueLoweredObserver(subject);
        final Observer observerC = new ByTenChangedObserver(subject);

        subject.changeValueby(2);
        subject.changeValueby(-1);
        subject.changeValueby(5);
        subject.changeValueby(-15);


    }
}

//OUTPUT
/*
Subject value changed and is now2
Subject value changed and is now1
Value lowered and is now 1
Subject value changed and is now6
Subject value changed and is now-9
Value lowered and is now -9
Value changed by at least 10 is now -9
 */