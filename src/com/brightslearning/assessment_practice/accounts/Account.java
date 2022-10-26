package com.brightslearning.assessment_practice.accounts;

public class Account implements Comparable<Account>{
    private final Category category;
    private final String password;
    private final String name;

    public Account(String name, String password, Category category) {
        this.name = name;
        this.password = password;
        this.category = category;
    }

    public Category getCategory() {
        return category;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Account{" +
                "category=" + category +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Account o) {
        return name.compareTo(o.getName());
    }
}
