package de.philipppixel.accountable.domain.entities;

import java.util.Date;

import de.philipppixel.accountable.domain.utils.Assert;

public class BillBuilder {
    private Amount amount = null;
    private Category category = null;
    private String description = null;
    private Date billDate = null;

    public BillBuilder amount(Amount amount) {
        this.amount = amount;
        return this;
    }

    public BillBuilder category(Category category) {
        this.category = category;
        return this;
    }

    public BillBuilder description(String description) {
        this.description = description;
        return this;
    }

    public BillBuilder billDate(Date billDate) {
        this.billDate = billDate;
        return this;
    }

    public BillBuilder now() {
        this.billDate = getNow();
        return this;
    }

    Date getNow() {
        return new Date();
    }

    public NationalBill createBill() {
        Assert.assertNotNull(amount, "amount must not be null");
        Assert.assertNotNull(category, "category must not be null");
        Assert.assertNotNull(billDate, "billDate must not be null");
        return new NationalBill(amount, category, description, billDate);
    }
}