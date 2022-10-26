package com.brightslearning.assessment_practice;


import com.brightslearning.assessment_practice.accounts.Account;
import com.brightslearning.assessment_practice.accounts.Category;
import com.brightslearning.assessment_practice.test.Test;

import java.util.ArrayList;
import java.util.List;

public class Exercise1 {

    public static void main(String[] args) {
        /*
        Exercise 1a: Implement the method isValidPassword, which checks, whether
        a given String is a valid password (= return true) or not (= return false).
        A valid password has to fulfil the following requirements:
        - contains at least 8 characters
        - starts with a lowercase letter
        - contains at least one uppercase letter
        - ends with a number, which can be divided by 7 (e.g. 7, 21, 105)
         */

        // Examples of valid passwords
        Test.equals(true, isValidPassword("lUggi105"));
        Test.equals(true, isValidPassword("fAmouss77"));
        Test.equals(true, isValidPassword("aBCDEFGH7"));

        // Examples of invalid passwords
        Test.equals(false, isValidPassword("ABCDEFGH7"));
        Test.equals(false, isValidPassword(""));
        Test.equals(false, isValidPassword("a14Abcdef"));
        Test.equals(false, isValidPassword("aA21"));
        Test.equals(false, isValidPassword("fAmouss78"));

        /*
        Exercise 1b: Implement the method hasValidPassword, which checks an Account
        object, whether its password is valid.

        Use the method from 1a.

        Return true, if the password is valid - false otherwise
         */

        // Examples for valid accounts
        Account facebook = new Account("Facebook","fAmouss77", Category.SOCIAL);
        Account crypto = new Account("Crypto.com", "crypTiC84", Category.BANKING);
        Account boe = new Account("Bank of England", "sEcret147", Category.BANKING);
        Account boa = new Account("Bank of Australia", "topSecret35", Category.BANKING);
        Account vodafone = new Account("Vodafone", "cAllMe@35", Category.CONTRACT);

        Test.equals(true, hasValidPassword(facebook));
        Test.equals(true, hasValidPassword(boe));
        Test.equals(true, hasValidPassword(crypto));
        Test.equals(true, hasValidPassword(boa));
        Test.equals(true, hasValidPassword(vodafone));

        // Examples for invalid accounts
        Account bon = new Account("Bank of Nowhere", "sEcret141", Category.BANKING);
        Account o3 = new Account("O3", "5Ecret141", Category.CONTRACT);
        Account locals = new Account("Locals", "cooltosee7", Category.SOCIAL);

        Test.equals(false, hasValidPassword(bon));
        Test.equals(false, hasValidPassword(o3));
        Test.equals(false, hasValidPassword(locals));

        /*
        Exercise 1c: Implement the method findValidAccounts, which for a given list of accounts,
        returns a new list, which contains only the accounts with valid passwords.

        The new list must maintain the order of the accounts.
         */

        // Example
        List<Account> allAccounts = List.of(facebook,boe,vodafone,bon,o3,locals);
        Test.equals(List.of(facebook,boe,vodafone), findValidAccounts(allAccounts));

        /*
        Exercise 1d: Implement the method findValidAccountsByCategory, which for given list of accounts
        and a given category returns a new list, that contains all accounts with valid passwords that match
        the category.

        The new list shall be ordered alphabetically (according to their name)
         */
        List<Account> larsAccounts = List.of(crypto, o3, boe, boa, bon, vodafone);
        Test.equals(List.of(boa,boe,crypto), findValidAccountsByCategory(larsAccounts, Category.BANKING));
    }

    private static boolean isValidPassword(String password) {
        //TODO: 1a
        return false;
    }

    private static boolean hasValidPassword(Account a) {
        //TODO: 1b
        return false;
    }

    private static List<Account> findValidAccounts(List<Account> accountList) {
        //TODO: 1c
        return new ArrayList<>();
    }

    private static List<Account> findValidAccountsByCategory(List<Account> accountList, Category cat) {
        //TODO: 1d
        return new ArrayList<>();
    }
}
