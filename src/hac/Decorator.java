package hac;

/**
 * Decorator class
 */
public abstract class Decorator implements Component{

    protected Component component;

    /**
     * ctor for the decorator
     * @param component the component to wrap
     */
    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void operation() {
        component.operation();
    }
}