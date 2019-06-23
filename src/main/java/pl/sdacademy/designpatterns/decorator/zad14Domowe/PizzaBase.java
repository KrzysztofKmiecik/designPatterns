package pl.sdacademy.designpatterns.decorator.zad14Domowe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PizzaBase implements Pizza {
    @Override
    public List<String> displayPizzaContent() {
        List<String> list=new ArrayList<>();
        list.add("Base");
        return list;
    }
}
