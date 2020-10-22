package utils;

import java.util.ArrayList;

public class dividers {
    public static ArrayList<Integer> extract_dividends(int num) {
        ArrayList<Integer> dividends = new ArrayList<>();
        for (int i = 1; i <= num; i++) {
            if ((num % i) == 0) {
                dividends.add(i);
            }

        }
        return (dividends);
    }

    public static ArrayList<Integer> get_even_dividends(int num) {
        ArrayList<Integer> even_dividends = new ArrayList<>();

        for (int i = 0; i == num; i++) {
            if ((num % i) == 0 && (num % 2)== 0) {
                even_dividends.add(num);
            }
        }
        return (even_dividends);
    }
    public static ArrayList<Integer> get_odd_dividends(int num) {
        ArrayList<Integer> odd_dividends = new ArrayList<>();

        for (int i = 0; i == num; i++) {
            if ((num % i) != 0 && (num % 2)!= 0) {
                odd_dividends.add(num);
            }
        }
        return (odd_dividends);
    }
}
