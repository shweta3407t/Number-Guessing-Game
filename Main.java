import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            boolean isRunning = true;
            while (isRunning) {

                System.out.println("""
                        -----NUMBER GUESSING GAME-----
                        ENTER L - LOW LEVEL GAME RANGE(1-50).
                        ENTER M - MEDIUM LEVEL GAME RANGE (1-100).
                        ENTER H - HIGH LEVEL GAME RANGE(1-500).

                        ENTER E -EXITE GAME.
                        """);
                System.out.print("YOUR CHOICE : ");
                String choice = sc.next() ;

                boolean isValide=utils.InputValidator.isString(choice);
                if(isValide){
                    System.out.println("..... WRONG OPTION SELECTED.....");
                 }

                switch (choice) {
                    case "l":
                        service.GameService.lowLevelGame(sc);

                        break;
                    case "m":
                        service.GameService.meduimLevelGame(sc);
                        break;
                    case "h":
                        service.GameService.highLevelGame(sc);
                        break;
                    case "e":
                        System.out.println("<<<<<<<EXITING GAME>>>>>>>>");
                        isRunning = false;
                        break;

                    default:
                        System.out.println(".....INVALI OPTION SELECTED....");
                        continue;
                }

            }
        } catch (NoSuchElementException e) {
            System.out.println("EXCEPTION HANDLED.");
            System.out.println(e);
        }

        sc.close();

    }
}

 
