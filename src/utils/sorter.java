package utils;

import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.Collections;

public class sorter {
    public static void sort_low_to_high(ArrayList<Integer> numbers){
        Collections.sort(numbers);
        JOptionPane.showMessageDialog(null, "Lower number is: " + numbers.get(0) + " Higher is:" + numbers.get((numbers.size()-1)));
    }

    public static String sort_high_to_low(ArrayList<Integer> numbers){
        String result = " ";
        Collections.sort(numbers);
        result = " Higher number is: " + numbers.get((numbers.size()-1)) + " Lower is: " + numbers.get(0);
        return result;
    }
    public static void sort_all(ArrayList<Integer> numbers){
        Collections.sort(numbers);
        JOptionPane.showMessageDialog(null, "Sorted Array: " + numbers);
    }

    public static void sort_all_high_low(ArrayList<Integer> numbers){
        numbers.sort(Collections.reverseOrder());
        JOptionPane.showMessageDialog(null, "Sorted Array: " + numbers);
    }
}
