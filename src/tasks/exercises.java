package tasks;

import utils.dividers;
import utils.extractors;
import utils.multipliers;
import utils.sorter;
import validate.validator;

import javax.swing.*;
import java.util.ArrayList;

public class exercises {
    public static void exercise_one() {
        int even_count = 0, num = 0;
        boolean kill_switch = false;
        ArrayList<Integer> ex_one = new ArrayList<>();
        String result = " ";

        while (!kill_switch) {
            num = validator.validate_integer();
            if (even_count == 3) {
                kill_switch = true;
            }
            if ((num % 2) == 0) {
                ex_one.add(num);
                even_count++;
            }
        }
        for (Integer number : ex_one) {
            System.out.println(number);
            ArrayList<Integer> dividends = dividers.extract_dividends(number);
            System.out.println(dividends);
            int sum = utils.sum.sum_even_numbers_from_array(dividends);
            result += "Sum from even dividers of " + number + " equals to: " + sum + "\n";
        }
        JOptionPane.showMessageDialog(null, result);
    }

    public static void exercise_two() {
        int loop_num = 0, num = 0, total = 0;
        StringBuilder result = new StringBuilder();
        loop_num = validator.validate_integer();
        for (int i = 0; i < loop_num; i++) {
            num = validator.validate_integer();
            ArrayList<Integer> digits = extractors.extract_digits(num);
            total = multipliers.multiply_odd_numbers_from_array(digits);
            result.append("Sum of odd digits from: ").append(num).append(" is: ").append(total).append("\n");
        }
        JOptionPane.showMessageDialog(null, result);
    }

    public static void exercise_three() {
        boolean kill_switch = false;
        int num = 0;
        StringBuilder result = new StringBuilder();

        while (!kill_switch) {
            num = validator.validate_integer();
            if (num == -1) {
                kill_switch = true;
            } else {
                ArrayList<Integer> digits = extractors.extract_digits(num);
                ArrayList<Integer> even_digits = extractors.extract_even_numbers(digits);
                String sort = sorter.sort_high_to_low(even_digits);
                result.append("Higher and lower even digits from: ").append(num).append(sort).append('\n');
            }
        }
        JOptionPane.showMessageDialog(null, result);
    }

    public static void exercise_four() {
        int cont = 0, num = 0, total = 0;
        StringBuilder result = new StringBuilder();

        do {
            total = 0;
            num = validator.validate_integer();
            ArrayList<Integer> dividends = dividers.extract_dividends(num);
            ArrayList<Integer> odd_dividends = extractors.extract_odd_numbers(dividends);
            System.out.println(odd_dividends);

            for (Integer number : odd_dividends) {
                total += number;
            }
            if (total >= 5) {
                result.append("Sum of Odd_dividends of: ").append(num).append(" are higher than 5 ").append(total).append("\n");
            } else {
                result.append("Sum of Odd dividends of: ").append(num).append(" are lower than 5 ").append(total).append("\n");
            }
            cont = JOptionPane.showConfirmDialog(null, "Do you want to continue? (Y/N)");
        } while (cont != 1);
        JOptionPane.showMessageDialog(null, result);
    }
}
