package tests;

import org.junit.jupiter.api.Test;
import utils.sorter;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class sorterTest {

    @Test
    void sort_high_to_low() {
        ArrayList<Integer> sort = new ArrayList<>(Arrays.asList(10,201,13,145));
        String result = sorter.sort_high_to_low(sort);
        System.out.println(result);
    }
}