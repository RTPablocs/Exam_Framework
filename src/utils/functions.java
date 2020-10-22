package utils;

import java.util.ArrayList;

public class functions {

    static float calculate_median_from_array(ArrayList<Integer> median_numbers) {
        float result = 0;

        for (Integer number : median_numbers) {
            result += number;
        }
        result /= median_numbers.size();

        return result;
    }

}
