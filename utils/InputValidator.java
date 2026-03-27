package utils;

public class InputValidator {
    public static boolean isGuessNumInRange(int guessNum, int range) {
        if (guessNum > range) {
            System.out.println("....GUESSED NUMBER OUT OF RANGE......");
            return false;
        }
        return true;
    }

}
