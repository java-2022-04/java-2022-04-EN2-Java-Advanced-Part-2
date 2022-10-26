package com.brightslearning.assessment_practice;

import com.brightslearning.assessment_practice.accounts.Employee;
import com.brightslearning.assessment_practice.test.Test;

public class Exercise2 {

    public static void main(String[] args) {

        /*
            Exercise 2: Create the class Employee, which
            contains information about an employee

            Follow the steps and remove the // to test your code!
         */

        /*
            (a) The class Employee has three string properties: name,
            company, and country. It also has one int property: salary

            Constructing an object must be possible without parameters. In
            this case, all properties are set to the empty string or to 0.

            All properties must be readable using getter methods.
         */

        Employee e1 = new Employee();
        Test.equals("", e1.getName());
        Test.equals("", e1.getCompany());
        Test.equals("", e1.getCountry());
        Test.equals(0, e1.getSalary());

        /*
            All properties must be writeable using setter methods.
         */
        e1.setName("Mira Musterfrau");
        Test.equals("Mira Musterfrau", e1.getName());
        e1.setCompany("Beispiel AG");
        Test.equals("Beispiel AG", e1.getCompany());
        e1.setSalary(50000);
        Test.equals(50000, e1.getSalary());
        e1.setCountry("Germany");
        Test.equals("Germany", e1.getCountry());



        /*
            (b) Add the method isValid to the class, which receives an array of
            country names (strings) as parameter and returns a boolean value.

            The return value must be true if all of the following conditions are
            met, otherwise false:

            - The properties name and company are not empty.
            - The property country is equal to one of the strings in the given array.
               (It can be assumed that no property or entry of the array is null.)
            - The property salary is >= 10000.
         */

        String[] countries = {"Germany", "Austria", "Switzerland"};
//
        Employee e2 = new Employee();
        Test.equals(false, e2.isValid(countries));

        e2.setName("Bert Beispiel");
        e2.setCompany("Brights");
        e2.setSalary(10000);
        Test.equals(false, e2.isValid(countries));
        e2.setCountry(new String("Austria"));
        Test.equals(true, e2.isValid(countries));
        Test.equals(false, e2.isValid(new String[]{"Belgium"}));

    }

}
