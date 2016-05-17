package de.philipppixel.accountable.domain.entities;

import org.junit.Test;

public class BillBuilderTest {

    @Test(expected = IllegalArgumentException.class)
    public void buildShouldThrowException_noAmount() throws Exception {
        new BillBuilder().createBill();
    }

    @Test(expected = IllegalArgumentException.class)
    //TODO catchexception verwenden für message tests
    public void buildShouldThrowException_noCategory() throws Exception {
        // given
        Amount amount = new Amount(10, AccCurrency.createDefaultInstance());
        BillBuilder builder = new BillBuilder().amount(amount);

        // when
        builder.createBill();
    }

}