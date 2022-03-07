package hac;

public class ConcreteComponent implements Component {
    @Override
    public void operation() {
        System.out.println("I am concrete component 1");
    }
}