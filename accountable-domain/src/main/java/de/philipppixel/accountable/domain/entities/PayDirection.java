package de.philipppixel.accountable.domain.entities;

public enum PayDirection {
    ACCOUNT_INCREASING("income"),
    ACCOUNT_DECREASING("expense");

    private final String directionAlias;

    PayDirection(String directionAlias) {
        this.directionAlias = directionAlias;
    }
}
