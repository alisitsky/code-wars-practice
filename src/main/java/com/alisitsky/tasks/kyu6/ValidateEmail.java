package com.alisitsky.tasks.kyu6;

public class ValidateEmail {

    public static boolean validateEmail(String email) {
        int atInd = email.indexOf("@");
        int dotInd = email.indexOf(".");
        int emLen = email.length();

        if (atInd <= 0
                || atInd == emLen - 1
                || dotInd <= 0
                || dotInd == emLen - 1
                || atInd > dotInd
                || dotInd - atInd < 2
                || atInd - dotInd > -2
        )
            return false;
        else
            return true;
    }
}
