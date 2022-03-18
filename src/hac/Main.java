package hac;

public class Main {

    public static void main(String[] args) {

        System.out.println("The original component:");
        new ConcreteComponent().operation();

        System.out.println("Decorating the component: ");

        // compose your decorators as you want
        Decorator decorator = new ConcreteDecorator2 (new ConcreteDecorator1(new ConcreteComponent()));
        decorator.operation();
    }
}
