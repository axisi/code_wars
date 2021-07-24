package com.test.code_wars;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CodeWarsApplication {

    public static void main(String[] args) {
        SpringApplication.run(CodeWarsApplication.class, args);

        /*System.out.println( Kata.multiTable(1));
        System.out.println( Kata.mouthSize("ALLIGATOR"));

        System.out.println("");
        System.out.println( Kata.solution("abc","bc"));
        System.out.println( Kata.order1("4of Fo1r pe6ople g3ood th5e the2 7hah 9bah kah8"));
        System.out.println( Kata.check("he quick brown fox jumps over he lazy dogasdasdasdasdasdasdasdagsdgfdhdfh sdg dsfgerdss4 sr4 56343456 3265346 456 ."));
        System.out.println( Kata.getCount("abracadabra"));*/
        //System.out.println( Kata.roundToNext5(-1));
        int[][] sudoku = {
                {5, 3, 4, 6, 7, 8, 9, 1, 2},
                {6, 7, 2, 1, 9, 5, 3, 4, 8},
                {1, 9, 8, 3, 4, 2, 5, 6, 7},
                {8, 5, 9, 7, 6, 1, 4, 2, 3},
                {4, 2, 6, 8, 5, 3, 7, 9, 1},
                {7, 1, 3, 9, 2, 4, 8, 5, 6},
                {9, 6, 1, 5, 3, 7, 2, 8, 4},
                {2, 8, 7, 4, 1, 9, 6, 3, 5},
                {3, 4, 5, 2, 8, 6, 1, 7, 9}
        };
        System.out.println( Kata.check(sudoku));



    }




}
