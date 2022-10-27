package com.brightslearning.exceptions;

import java.io.IOException;

public class MyOwnException extends Exception {

    private IOException e;

    public MyOwnException(IOException e) {
       this.e = e;
    }

    public String getMeMoreInformationAboutThatException() {
        return e.getMessage();
    }
}
