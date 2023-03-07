package hac;

public class ConcreteComponent implements Component {
    String data;

    public ConcreteComponent(String data) {
        // in a real world application, this would be for example a file name
        // and data would be the contents of the file
        this.data = data;
    }
    @Override
    public String operation() {
        return data;
    }
}