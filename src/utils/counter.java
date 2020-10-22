package utils;

import java.util.ArrayList;

public class counter {
    public static int count_even_numbers(ArrayList<Integer> numbers){

        return (int) numbers.stream().filter(number -> (number % 2) == 0).count();
    }
 }
