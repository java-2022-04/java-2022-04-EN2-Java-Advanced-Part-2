package com.brightslearning.assessment_practice.accounts;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class EmployeeTester {

    private Employee employee;

    @Before
    public void setUp() throws Exception {
        employee = new Employee();
        employee.setCountry("Hungary");
        employee.setCompany("Brightslearning");
        employee.setName("Maria");
        employee.setSalary(50000);
    }

    @Test
    public void should_BeValid_When_CountryIsInTheGivenList() {
        String[] countries = {"Hungary", "Portugal", "Greece"};
        assertTrue(employee.isValid(countries));
    }

    @Test
    public void should_BeInValid_When_CountryIsNotInTheGivenList() {
        String[] countries = {"Portugal", "Greece"};
        assertFalse(employee.isValid(countries));
    }
}
