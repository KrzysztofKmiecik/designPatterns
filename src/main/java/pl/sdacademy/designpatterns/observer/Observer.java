package pl.sdacademy.designpatterns.observer;

public abstract class Observer {
    protected Subject subject;


    public Observer(final Subject subject) {
        this.subject = subject;
        subject.subscribe(this); // sam chce sie zasubskrybowac
    }

    public abstract void update();
}

