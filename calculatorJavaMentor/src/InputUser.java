import java.util.Arrays;

public class InputUser {

    private String example;
    private String numberFirstStr = "";
    private String numberSecondStr = "";
    private char[] numberChar;


    public InputUser(String example) {
        this.example = example;
        numberChar = example.toCharArray();
        findFirstAndSecondNumber();
    }


    public String getNumberFirstStr() {
        return numberFirstStr;
    }

    public String getNumberSecondStr() {
        return numberSecondStr;
    }

    public String Operation() {
        String rsl = null;
        if (example.indexOf("+") != -1) {
            return rsl = "+";
        }
        if (example.indexOf("-") != -1) {
            return rsl = "-";
        }
        if (example.indexOf("*") != -1) {
            return rsl = "*";
        }
        if (example.indexOf("/") != -1) {
            return rsl = "/";
        }
        return rsl;
    }


    private void findFirstAndSecondNumber() {
        int startFirst = 0;
        int startSecond = 0;

        for (int index = 0; index < numberChar.length; index++) {
            if (numberChar[index] == '+' || numberChar[index] == '-' || numberChar[index] == '*' || numberChar[index] == '/') {
                startSecond = index;
            }
        }

        for (; startFirst < startSecond; startFirst++) {
           numberFirstStr += String.valueOf(numberChar[startFirst]);
        }

        for (int index = startSecond + 1; index < numberChar.length; index++) {
            numberSecondStr += String.valueOf(numberChar[index]);
        }
    }
}
