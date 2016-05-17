package de.philipppixel.accountable.domain.utils;

import org.junit.Test;

import static org.junit.Assert.*;

public class AssertTest {

    @Test
    public void assertNotNull_good() throws Exception {
        fail();
    }

    @Test
    public void assertNotNullShouldThrowException_nullObject() throws Exception {
        fail();
    }

    @Test
    public void assertNotEmpty_good() throws Exception {
        fail();
    }

    @Test
    public void assertNotEmptyShouldThrowException_null() throws Exception {
        fail();
    }

    @Test
    public void assertNotEmptyShouldThrowException_empty() throws Exception {
        fail();
    }

    @Test
    public void assertNotEmptyShouldThrowException_onlyWhiteSpaces() throws Exception {
        fail();
    }

    @Test
    public void assertNotBlankShouldThrowException_null() throws Exception {
        fail();
    }

    @Test
    public void assertNotBlankShouldThrowException_empty() throws Exception {
        fail();
    }

    @Test
    public void assertNotBlankShouldThrowException_onlyWhiteSpaces() throws Exception {
        fail();
    }
}