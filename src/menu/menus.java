package menu;

import validate.validator;
import tasks.exercises;

import javax.swing.*;

public class menus {
    public static void main(String[] args) {
        String[] options = {"EX1", "EX2", "EX3","EX4"};
        int option = 0;
        boolean kill_switch = false, repeat = false;
        do {
            if (!repeat) {
                option = JOptionPane.showOptionDialog(null, "Choose exercise", "Menu", 0, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
            }
            if (option == -1) {
                System.exit(0);
            } else {
                switch (option) {
                    case 0 -> exercises.exercise_one();
                    case 1 -> exercises.exercise_two();
                    case 2 -> exercises.exercise_three();
                    case 3 -> exercises.exercise_four();
                }
            }
            repeat = validator.translate_boolean("Repeat?");
            if (repeat) {
                kill_switch = false;
            } else {
                kill_switch = validator.translate_boolean("Exit?");
            }
        } while (!kill_switch);
    }
}

