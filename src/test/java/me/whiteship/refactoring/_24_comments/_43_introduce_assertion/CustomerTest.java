package me.whiteship.refactoring._24_comments._43_introduce_assertion;

import org.junit.jupiter.api.Test;

class CustomerTest {

    @Test
    void setDiscountRate() throws Exception {
        Customer customer = new Customer();
        customer.setDiscountRate(-10d);
    }
}