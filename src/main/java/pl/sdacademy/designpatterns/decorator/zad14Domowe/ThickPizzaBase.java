package pl.sdacademy.designpatterns.decorator.zad14Domowe;

import java.util.ArrayList;
import java.util.List;

public class ThickPizzaBase implements Pizza {
    private Pizza pizza;

    public ThickPizzaBase(final Pizza pizza) {
        this.pizza = pizza;
    }


    @Override
    public List<String> displayPizzaContent() {
        List<String> list=new ArrayList<>();
        list=pizza.displayPizzaContent();
        list.set(0, "THICK_BASE");
        return list;    }
}
