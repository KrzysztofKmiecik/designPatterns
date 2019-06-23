package pl.sdacademy.designpatterns.factory.car;

import pl.sdacademy.designpatterns.factory.AbstractFactory;

public class FactoryProvider {

    //na podstawie factory category zwroc odpowiednia implementacje AbstractFactory
    public static AbstractFactory<Car> getFactory(final FactoryCategory factoryCategory){
        switch(factoryCategory){
            case COMBIS:
                return new CombiCarFactory();
            case SEDANS:
                return new SedanCarFactory();
            case HATCHBACKS:
                return new HatchbackCarFactory();
        }
        throw new RuntimeException("Unknown factory category");

    }
}
