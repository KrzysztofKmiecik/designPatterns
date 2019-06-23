package pl.sdacademy.designpatterns.decorator.zad14Domowe;

import java.util.ArrayList;
import java.util.List;

public class WithMushroomPizza implements Pizza{
    private Pizza pizza;

    public WithMushroomPizza(final Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public List<String> displayPizzaContent() {
        List<String> list=new ArrayList<>();
        list=pizza.displayPizzaContent();
        list.add("MUSHROOMS");
        return list;
    }
}
