import java.util.Arrays;

public class Division {
    private InputUser inputUser;
    private int firstNumber;
    private int secondNumber;
    private final String[] romNumber = {"I", "II", "III", "IV", "V", "VI", "VII", " VIII", "IX", "X", "XI", "XII", "XIII", "XIV", "XV", "XVI",
            "XVII", "XVIII", "XIX", "XX", "XXI", "XXII", "XXIII", "XXIV", "XXV", "XXVI", "XXVII", "XXIII", "XXIX", "XXX",
            "XXXI", "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI", "XXXVII", "XXXVIII","XXXIX", "XL", "XLI", "XLII",
            "XLIII", "XLIV", "XLV", "XLVI", "XLVII", "XLVIII", "XLIX", "L", "LI", "LII", "LIII", "LIV", "LV", "LVI",
            "LVII", "LVIII", "LIX", "LX", "LXI", "LXII", "LXIII", "LXVI", "LXV", "LXVI", "LXVII", "LXVIII", "LXIX", "LXX",
            "LXXI", "LXXII", "LXXIII", "LXXIV", "LXXV", "LXXVI", "LXXVII", "LXXVIII", "LXXIX", "LXXX", "LXXXI", "LXXXII",
            "LXXXIII", "LXXXIV", "LXXXV", "LXXXVI", "LXXXVII", "LXXXIII", "LXXXIX", "CX", "CXI", "CXII", "CXIII", "CXIV",
            "CXV", "CXVI", "CXVII", "CXVIII", "CXIX", "C"};


    public Division(InputUser inputUser){
        this.inputUser = inputUser;
    }

    private boolean arabOrRomNumber() {
        boolean rsl = false;
        if (Arrays.asList(romNumber).contains(inputUser.getNumberFirstStr()) && Arrays.asList(romNumber).contains(inputUser.getNumberSecondStr())) {
            rsl = true;
        }
        return rsl;
    }

    public void divider() {
        if (arabOrRomNumber()) {
            for (int index = 0; index < 10; index++) {
                if (inputUser.getNumberFirstStr().equals(romNumber[index])) {
                    firstNumber = index + 1;
                    break;
                }
            }
            for (int index = 0; index < 10; index++) {
                if (inputUser.getNumberSecondStr().equals(romNumber[index])) {
                    secondNumber = index + 1;
                    break;
                }
            }
            System.out.println(romNumber[(firstNumber / (secondNumber) - 1)]);
        }else {
            firstNumber = Integer.parseInt(inputUser.getNumberFirstStr());
            secondNumber = Integer.parseInt(inputUser.getNumberSecondStr());
            if (firstNumber >= 0 && firstNumber <= 10 && secondNumber >= 0 && secondNumber <= 10) {
                System.out.println(firstNumber / secondNumber);
            }
        }
    }
}

