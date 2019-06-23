package pl.sdacademy.designpatterns.decorator;

public class CarEngineStatusAfterLoggingDecorator implements EngineStarter {
    private EngineStarter engineStarter;

    public CarEngineStatusAfterLoggingDecorator(final EngineStarter engineStarter) {
        this.engineStarter = engineStarter;
    }

    @Override
    public void startEngine() {
        engineStarter.startEngine();
        System.out.println("Engine was started");
    }


    @Override

    public void stopEngine() {
        engineStarter.stopEngine();
        System.out.println("Engine was stopped");
    }
}
