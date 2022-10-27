package com.brightslearning.assessment_practice;

import org.junit.Test;

import static org.junit.Assert.*;

public class Exercise1Tester {

    @Test
    public void mytestCase() {
        assertFalse(Exercise1.isValidPassword("fdghjk"));
    }

    @Test
    public void should_BeTrue_When_PasswordIsValid() {
        assertTrue(Exercise1.isValidPassword("lUggi105"));
    }
}
