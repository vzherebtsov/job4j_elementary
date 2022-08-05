package ru.job4j.array;

import static java.lang.Character.isDigit;

public class JavaNameValidator {
    public static boolean isNameValid(String name) {
        boolean rsl = !name.isEmpty() && !isUpperLatinLetter(name.codePointAt(0))
                && !isDigit(name.codePointAt(0));
        if (rsl) {
            for (int i = 1; i < name.length(); i++) {
                int code = name.codePointAt(i);
                if ((!isSpecialSymbol(code) && !isUpperLatinLetter(code)
                        && !isLowerLatinLetter(code) && !isDigit(code))) {
                    rsl = false;
                    break;
                }
            }
        }
        return rsl;
    }

    public static boolean isSpecialSymbol(int code) {
        return code == 36 || code == 95;
    }

    public static boolean isUpperLatinLetter(int code) {
        return code >= 65 && code <= 90;
    }

    public static boolean isLowerLatinLetter(int code) {
        return code >= 97 && code <= 122;
    }
}
