package utils;

import java.util.ArrayList;

public class extractors {
    public static ArrayList<Integer> extract_digits(int num) {
        ArrayList<Integer> digits = new ArrayList<>();

        while (num > 0) {
            digits.add(num % 10);
            num /= 10;
        }
        return digits;
    }

    public static ArrayList<Integer> extract_odd_numbers(ArrayList<Integer> numbers) {
        ArrayList<Integer> odd_numbers = new ArrayList<>();

        for (Integer number : numbers) {
            if ((number % 2) != 0) {
                odd_numbers.add(number);
            }
        }
        return (odd_numbers);
    }

    public static ArrayList<Integer> extract_even_numbers(ArrayList<Integer> numbers){
        ArrayList<Integer> even_numbers = new ArrayList<>();

        for (Integer number : numbers){
            if ((number % 2 ) == 0){
                even_numbers.add(number);
            }
        }
        return (even_numbers);
    }
}
