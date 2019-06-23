package pl.sdacademy.designpatterns.observer;

public class ConcreteValueObserver extends Observer {
    private int previousValue;

    public ConcreteValueObserver(final Subject subject) {
        super(subject); //ten sam co obserwer ale musze go zapisac bo subject nie ma domyslnego konstruktura
    }

    @Override
    public void update() {

        System.out.println("Subject value changed and is now" + subject.getValue());


    }
}
