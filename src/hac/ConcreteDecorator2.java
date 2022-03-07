package hac;

public class ConcreteDecorator2 extends Decorator {

    public ConcreteDecorator2(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        super.operation();
        System.out.println("--------------------");
    }
}