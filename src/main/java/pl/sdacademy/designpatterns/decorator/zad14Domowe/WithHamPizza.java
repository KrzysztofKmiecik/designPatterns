package pl.sdacademy.designpatterns.decorator.zad14Domowe;

import java.util.ArrayList;
import java.util.List;

public class WithHamPizza implements  Pizza{
    private Pizza pizza;

    public WithHamPizza(final Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public List<String> displayPizzaContent() {
        List<String> list=new ArrayList<>();
        list=pizza.displayPizzaContent();
        list.add("HAM");
       // list.add("ONION");
        return list;
    }
}
