package utils;

public class InputValidator {
    public static boolean isGuessNumInRange(int guessNum, int range) {
        
        if (guessNum > range) {
            System.out.println("....GUESSED NUMBER OUT OF RANGE......");
            return false;
        }
        return  false;
         
    }

    public static boolean isString(String choice){
        if( choice.equalsIgnoreCase("l")|| choice.equalsIgnoreCase(" m")||
         choice.equalsIgnoreCase(" h")|| choice.equalsIgnoreCase(" e")){
            return true;
        }
        return false;
    }

}
