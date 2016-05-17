package de.philipppixel.accountable.domain.entities;

import java.util.Date;

public abstract class NationalPayment {
    public NationalPayment(Amount amount, PayDirection accountDecreasing, Category category,
                           String description, Date billDate) {

    }
}
