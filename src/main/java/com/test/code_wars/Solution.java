package com.test.code_wars;

import org.springframework.util.NumberUtils;
import org.springframework.util.StringUtils;

import java.util.regex.Pattern;

public class Solution {

    public static boolean validatePin(String pin) {
       return (pin.chars().count() == 4 || pin.chars().count() == 6) && Pattern.matches("[0-9]+[\\.]?[0-9]*",pin);

    }

}