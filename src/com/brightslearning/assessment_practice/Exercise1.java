package com.brightslearning.assessment_practice;


import com.brightslearning.assessment_practice.accounts.Account;
import com.brightslearning.assessment_practice.accounts.Category;
import com.brightslearning.assessment_practice.test.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise1 {

    protected void protectedMethod() {

    }

    private void privateMethode() {}

    void packagePrivateMethod(){

    }

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
        Account facebook = new Account("Facebook", "fAmouss77", Category.SOCIAL);
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
        List<Account> allAccounts = List.of(facebook, boe, vodafone, bon, o3, locals);
        Test.equals(List.of(facebook, boe, vodafone), findValidAccounts(allAccounts));

        /*
        Exercise 1d: Implement the method findValidAccountsByCategory, which for given list of accounts
        and a given category returns a new list, that contains all accounts with valid passwords that match
        the category.

        The new list shall be ordered alphabetically (according to their name)
         */
        List<Account> larsAccounts = List.of(crypto, o3, boe, boa, bon, vodafone);
        Test.equals(List.of(boa, boe, crypto), findValidAccountsByCategory(larsAccounts, Category.BANKING));
    }

    static boolean isValidPassword(String password) {
        return password != null &&
                password.length() >= 8 &&
                Character.isLowerCase(password.charAt(0)) &&
                containsAtLeastOneUpperCaseLetter(password) &&
                endsWithANumberDividableBySeven(password);
    }

    private static boolean endsWithANumberDividableBySeven(String password) {
        if (isLastCharacterADigit(password)) return false;

        int i = password.length();
        while (i > 0 && Character.isDigit(password.charAt(i - 1))) {
            i--;
        }
        //System.out.println("password: " + password);
        int trailingNumber = Integer.parseInt(password.substring(i));
        //System.out.println("trailingNumber: " + trailingNumber);
        return trailingNumber % 7 == 0;
    }

    private static boolean isLastCharacterADigit(String password) {
        char lastChar = password.charAt(password.length() - 1);
        if (!Character.isDigit(lastChar)) return true;
        return false;
    }

    private static boolean containsAtLeastOneUpperCaseLetter(String password) {
        for (int i = 0; i < password.length(); i++) {
            if (Character.isUpperCase(password.charAt(i)))
                return true;
        }
        return false;
    }

    private static boolean hasValidPassword(Account account) {
        //TODO: 1b
        return isValidPassword(account.getPassword());
    }

    private static List<Account> findValidAccounts(List<Account> accountList) {
        // TODO: 1c with a for loop
        List<Account> validAccounts = new ArrayList<>();
        // this for loop is a bit nicer to read since it does not need to use any index variable like i
        for (Account account : accountList) {
            if (hasValidPassword(account)) {
                validAccounts.add(account);
            }
        }
        return validAccounts;
    }

    private static List<Account> findValidAccountsWithStreams(List<Account> accountList) {
        return accountList
                .stream()
                .filter(account -> hasValidPassword(account))
                .collect(Collectors.toList());
    }


    private static List<Account> findValidAccountsByCategory(List<Account> accountList, Category cat) {
        //TODO: 1d
        List<Account> validAccountsByCategory = new ArrayList<>();
        List<Account> validAccounts = findValidAccounts(accountList);
        for (Account validAccount : validAccounts) {
            if (validAccount.getCategory().equals(cat)) {
                validAccountsByCategory.add(validAccount);
            }
        }

        Collections.sort(validAccountsByCategory);
        return validAccountsByCategory;

    }
     private static List<Account> findValidAccountsByCategoryWithStreams(List<Account> accountList, Category cat) {
        return accountList
                .stream()
                .filter(account ->
                        account.getCategory().equals(cat) && hasValidPassword(account)
                )
                .sorted()
                .collect(Collectors.toList());
    }
}
