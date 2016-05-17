package de.philipppixel.accountable.domain.entities;

public class AccCurrency {
    //TODO das hier ist doch quatsch, das muss raus
    static AccCurrency createDefaultInstance() {
        return new AccCurrency("Default Currency", "DEF", "def");
    }

    private final String name;
    private final String abbreviation;
    private final String symbol;

    public AccCurrency(String name, String abbreviation, String symbol) {
        this.name = name;
        this.abbreviation = abbreviation;
        this.symbol = symbol;
    }

    public String getName() {
        return name;
    }

    public String getSymbol() {
        return symbol;
    }

    public String getAbbreviation() {
        return abbreviation;
    }
}
