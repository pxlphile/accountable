package de.philipppixel.accountable.domain.entities;

import java.util.Date;

public abstract class Payment {
    PayDirection payDirection;
    Category category;
    Calculation calculation;
    Amount amount;
    String description;
    Date billDate;

    Payment(Amount amount, PayDirection payDirection, Category category, String description, Date billDate) {
        this.payDirection = payDirection;
        this.category = category;
        this.amount = amount;
        this.description = description;
        this.billDate = billDate;
    }

    Payment(Calculation calculation, PayDirection payDirection, Category category, String description, Date billDate) {
        this.payDirection = payDirection;
        this.category = category;
        this.amount = amount;
        this.description = description;
        this.billDate = billDate;
    }
}
