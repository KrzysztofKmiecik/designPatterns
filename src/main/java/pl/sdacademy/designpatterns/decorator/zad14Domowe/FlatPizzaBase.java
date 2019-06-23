package pl.sdacademy.designpatterns.decorator.zad14Domowe;

import java.util.ArrayList;
import java.util.List;

public class FlatPizzaBase implements Pizza {
    private Pizza pizza;

    public FlatPizzaBase(final Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public List<String> displayPizzaContent() {
       List<String> list=new ArrayList<>();
       list=pizza.displayPizzaContent();
       list.set(0, "FLAT_BASE");
        return list;


    }
}
