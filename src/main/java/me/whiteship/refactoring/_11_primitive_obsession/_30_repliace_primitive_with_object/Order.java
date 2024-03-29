package me.whiteship.refactoring._11_primitive_obsession._30_repliace_primitive_with_object;

public class Order {

    private Priority priority;

    public Order(Priority priority) {
        this.priority = priority;
    }

    public Order(String prorityValue) {
        this(new Priority(prorityValue));
    }

    public Priority getPriority() {
        return priority;
    }
}
