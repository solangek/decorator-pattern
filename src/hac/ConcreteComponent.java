package hac;

public class ConcreteComponent implements Component {
    String data;

    public ConcreteComponent(String data) {
        this.data = data;
    }
    @Override
    public String operation() {
        return data;
    }
}