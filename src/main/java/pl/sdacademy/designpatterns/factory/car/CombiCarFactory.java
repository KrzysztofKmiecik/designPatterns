package pl.sdacademy.designpatterns.factory.car;

import pl.sdacademy.designpatterns.factory.AbstractFactory;

public class CombiCarFactory  implements AbstractFactory<Car> {
    @Override
    public Car create(String type) {
        switch (type){
            case "TC":
                return createCorollaCombi(); // przy returnach nie trzeba break
            case "A4":
                return createA4Combi();
        }
        throw new RuntimeException("Unknown sedan type");




    }

    private Car createA4Combi() {
        return  new Toyota("Corolla",EngineType.GASOLINE_NATURALLY_ASPIRATED,2.0D,4,BodyType.COMBI);
    }

    private Car createCorollaCombi() {
        return new Audi("Audi A4",EngineType.DIESE,2.5D,4,BodyType.COMBI);
    }
    //TC - toyata corolla combi- 2.0
    //A4-audi a4 combi- 2.5 silnik

}
