package utils;

import validate.validator;

import java.util.ArrayList;

public class multipliers {
    public static int multiply_odd_numbers_from_array(ArrayList<Integer> multipliers) {
        int result = 1;

        for (Integer multiplier : multipliers) {
            if ((multiplier % 2) != 0) {
                result *= multiplier;
            }
        }
        return result;
    }

   public static int multiply_even_numbers_from_array(ArrayList<Integer> multipliers) {
        int result = 1;

        for (Integer multiplier : multipliers) {
            if ((multiplier % 2) == 0) {
                result *= multiplier;
            }
        }
        return result;
    }
    public static int multiply_from_array(ArrayList<Integer> multipliers){
        int result = 1;
        for (Integer multiplier: multipliers){
            result *= multiplier;
        }
        return result;
    }
}