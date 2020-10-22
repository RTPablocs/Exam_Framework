package validate;

import javax.swing.*;

public class validator {
    public static int validate_integer() {
        int num = 0;
        try {
            num = Integer.parseInt(JOptionPane.showInputDialog(null, "Insert your integer here"));
        } catch (Exception not_an_int) {
            JOptionPane.showMessageDialog(null, "You've inserted the wrong number");
            num = 0;
        }
        return num;
    }

    public static float validate_float() {
        float num = 0;
        try {
            num = Float.parseFloat(JOptionPane.showInputDialog(null, "Insert"));
        } catch (Exception not_a_float) {
            JOptionPane.showMessageDialog(null, "That's not a float");
            num = 0;
        }
        return num;
    }

    public static char validate_char() {
        String s = " ";
        char character = ' ';
        s = JOptionPane.showInputDialog(null, "Insert your character: ");
        character = s.charAt(0);

        if (Character.toString(character).matches("^/[a-zA-Z]?$")) {
            JOptionPane.showMessageDialog(null, "Character Validated");
        } else {
            JOptionPane.showMessageDialog(null, "Character Not Valid");
        }
        return character;
    }

    public static boolean translate_boolean(String message) {
        int confirm = 0;
        confirm = JOptionPane.showConfirmDialog(null, message);
        return JOptionPane.OK_OPTION == confirm;
    }

}
