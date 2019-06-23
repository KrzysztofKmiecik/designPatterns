package pl.sdacademy.designpatterns.factory.car;

import pl.sdacademy.designpatterns.factory.AbstractFactory;

public class HatchbackCarFactory implements AbstractFactory<Car> {
    @Override
    public Car create(final String type) {
        switch (type){
            case "TC":
                return createCorollaHatchback(); // przy returnach nie trzeba break
            case "A4":
                return createA4Hatchback();
        }
        throw new RuntimeException("Unknown hatchback type");
    }

    private Car createA4Hatchback() {
        return new Audi("Audi A4",EngineType.DIESE,2.0D,4,BodyType.HATCHBACK);
    }

    private Car createCorollaHatchback() {
        return  new Toyota("Corolla",EngineType.GASOLINE_NATURALLY_ASPIRATED,1.6D,4,BodyType.HATCHBACK);
    }
}
