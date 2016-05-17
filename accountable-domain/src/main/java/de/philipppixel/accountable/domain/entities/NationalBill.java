package de.philipppixel.accountable.domain.entities;

import java.util.Date;

public class NationalBill extends NationalPayment {
    NationalBill(Amount amount, Category category, String description, Date billDate) {
        super(amount, PayDirection.ACCOUNT_DECREASING, category, description, billDate);
    }
}
