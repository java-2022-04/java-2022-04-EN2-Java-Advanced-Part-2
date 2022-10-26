package com.brightslearning.assessment_practice.accounts;

import java.util.Arrays;
import java.util.List;

public class Employee {
    private String name = "";
    private String company = "";

    private String country = "";
    private int salary = 0;


    public String getName() {
        return name;
    }

    public String getCompany() {
        return company;
    }

    public String getCountry() {
        return country;
    }

    public int getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    /**
     * The properties name and company are not empty.
     * - The property country is equal to one of the strings in the given array.
     * (It can be assumed that no property or entry of the array is null.)
     * - The property salary is >= 10000.
     */
    public boolean isValid(String[] countries) {
        List<String> stringList = Arrays.asList(countries);



        return stringList.contains(country) &&
                salary >= 10000;
    }
}
