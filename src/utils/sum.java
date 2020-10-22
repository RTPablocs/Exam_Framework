package utils;

import java.util.ArrayList;

public class sum {
    public static int sum_odd_numbers_from_array(ArrayList<Integer> sums) {
        int result = 0;

        for (Integer sum : sums) {
            if ((sum % 2) != 0){
                result += sum;
            }
        }
        return result;
    }

    public static int sum_even_numbers_from_array(ArrayList<Integer> sums) {
        int result = 0;

        for (Integer sum : sums) {
            if ((sum % 2) == 0){
                result += sum;
            }
        }
        return result;
    }
        public static int sum_from_array (ArrayList<Integer> sums) {
            int result = 0;
            for (Integer sum : sums) {
                result += sum;
            }
            return result;
        }
    }
