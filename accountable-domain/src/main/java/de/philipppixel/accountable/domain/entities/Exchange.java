package de.philipppixel.accountable.domain.entities;

import java.util.Currency;
import java.util.Date;

public class Exchange {
    Date conversionDate;
    double conversionRate;
    Currency from;
    Currency to;
}
