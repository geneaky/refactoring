package me.whiteship.refactoring._06_mutable_data._18_split_variable;

public class Order {

    public double discount(final double inputValue, final int quantity) {
        double result = inputValue;
        if (inputValue > 50) result -= 2;
        if (quantity > 100) result -= 1;
        return result;
    }
}
