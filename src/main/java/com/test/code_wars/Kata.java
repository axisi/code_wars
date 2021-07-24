package com.test.code_wars;

import org.yaml.snakeyaml.util.ArrayUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


class Kata {
    public static String multiTable(int num) {
        String response = "";
        for (int i = 1; i < 11; i++) {
            response += i + " * " + num + " = " + num * i + "\n";
        }
        return response.substring(0, response.length() - 2); // good luck

    }

    public static String mouthSize(String animal) {
        return animal.toLowerCase().equals("alligator") ? "small" : "wide";
    }

    public static boolean solution(String str, String ending) {

        for (int i = ending.length() - 1, j = 0; i >= 0; i--, j++) {
            if (ending.charAt(i) != str.charAt(str.length() - j - 1)) return false;
        }
        return true;

    }

    public static boolean isValid(char[] walk) {
        if (walk.length != 10) return false;
        int v = 0, h = 0;
        for (Character c : walk
        ) {
            switch (c) {
                case 'n':
                    h += 1;
                    break;
                case 's':
                    h -= 1;
                    break;
                case 'e':
                    v += 1;
                    break;
                case 'w':
                    v -= 1;
                    break;
                default:
                    return false;
            }
        }
        if (h == 0 && v == 0)
            return true;
        else
            return false;
    }

    public static int bouncingBall(double h, double bounce, double window) {
        int result = 1;
        if (h <= 0d || bounce <= 0d || bounce >= 1d || window >= h) return -1;
        while (h * bounce > window) {
            result += 2;
            h = h * bounce;
        }
        return result;

    }

    static int changes = 0;

    public static String order(String words) {
        if (words.length() == 0) return "";

        String[] strings = words.split(" ");
        for (int j = 0; j < 2; j++) {


            for (int i = 0; i < strings.length; i++) {
                for (char c : strings[i].toCharArray()
                ) {

                    if (Character.isDigit(c)) {

                        int a = Character.getNumericValue(c);

                        String temp = strings[a - 1];
                        strings[a - 1] = strings[i];
                        strings[i] = temp;
                        break;
                    }

                }
            }
        }
        return String.join(" ", strings);
    }

    public static String order1(String words) {
        String[] arr = words.split(" ");
        StringBuilder result = new StringBuilder("");
        for (int i = 0; i < 9; i++) {
            for (String s : arr) {
                if (s.contains(String.valueOf(i))) {
                    result.append(s + " ");
                }
            }
        }
        return result.toString().trim();
    }

    public static boolean check(String sentence) {


        return sentence.chars().filter(Character::isLetter).map(Character::toLowerCase).distinct().count() == 26;
    }

    public static int getCount(String str) {
        String aaa = "aeiou";

        return (int) str.chars().filter(c -> aaa.indexOf(c) >= 0).count();
    }

    public static int roundToNext5(int number) {
        return number % 5 == 0 ? number : number + (5 - number % 5);
    }

    public static boolean check(int[][] sudoku) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (sudoku[i][j] == 0) {
                    return false;
                }
            }
        }

            Integer[] box = {1,2,3,4,5,6,7,8,9};
        for (int i = 0; i < 9; i++) {
            List<Integer> check = new ArrayList<Integer>(Arrays.asList(box));
            List<Integer> check1 = new ArrayList<Integer>(Arrays.asList(box));
            int sum = 0;
            int sum1 = 0;
            for (int j = 0; j < 9; j++) {
                sum += sudoku[i][j];
                if(check.contains(sudoku[i][j])){
                   check.remove(Integer.valueOf(sudoku[i][j]));
                }else{
                    return false;
                }
                sum1 += sudoku[j][i];
                if(check1.contains(sudoku[j][i])){
                    check1.remove(Integer.valueOf(sudoku[j][i]));
                }else{
                    return false;
                }
            }
            if (sum != 45 || sum1!=45) return false;

        }

        for (int i = 0; i <7 ; i+=3) {
            for (int j = 0; j < 7; j += 3) {
                Integer sum = 0;
                List<Integer> check = new ArrayList<Integer>(Arrays.asList(box));
                for (int k = 0; k < 3; k++) {
                    for (int l = 0; l < 3; l++) {
                        sum+=sudoku[i+k][j+l];
                    }
                }
                if(sum!=45)
                    return false;
            }
        }


        return true;
    }


}



