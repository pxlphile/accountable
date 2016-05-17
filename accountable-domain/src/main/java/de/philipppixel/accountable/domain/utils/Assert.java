package de.philipppixel.accountable.domain.utils;

public class Assert {
    public static void assertNotNull(Object object, String message) {
        if (object == null) {
            throw new IllegalArgumentException(message);
        }
    }

    public static void assertNotEmpty(String value, String message) {
        if (value.trim().isEmpty()) {
            throw new IllegalArgumentException(message);
        }
    }

    public static void assertNotBlank(String value, String message) {
        assertNotNull(value, message);
        assertNotEmpty(value, message);
    }
}
