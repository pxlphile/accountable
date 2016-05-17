package de.philipppixel.accountable.domain.entities;

import java.math.BigDecimal;

public class Amount {
    private BigDecimal amount;
    private AccCurrency currency;

    public Amount(BigDecimal amount, AccCurrency currency) {
        this.amount = amount;
        this.currency = currency;
    }
    public Amount(double amount, AccCurrency currency) {
        this(BigDecimal.valueOf(amount), currency);
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public AccCurrency getCurrency() {
        return currency;
    }
}
