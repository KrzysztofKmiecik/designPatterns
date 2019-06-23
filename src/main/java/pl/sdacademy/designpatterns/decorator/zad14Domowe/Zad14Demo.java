package pl.sdacademy.designpatterns.decorator.zad14Domowe;

public class Zad14Demo {
    public static void main(String[] args) {
        //   final Pizza pizza=new PizzaBase();
        //   final Pizza pizza=new FlatPizzaBase(new PizzaBase());
        //  final Pizza pizza=new ThickPizzaBase(new PizzaBase());
        final Pizza pizza1 = new WithHamPizza(new ThickPizzaBase(new PizzaBase()));
        final Pizza pizza2 = new WithSalamiPizza(new FlatPizzaBase(new PizzaBase()));

        System.out.println("pizza1");
        pizza1.displayPizzaContent().forEach(p -> System.out.println(p));
        System.out.println();
        System.out.println("pizza2");
        pizza2.displayPizzaContent().forEach(p -> System.out.println(p));
    }
}
