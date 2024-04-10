import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class InputManager {
    private Scanner scanner;
    private ArrayList<String> skaiciai;

    public InputManager() {
        scanner = new Scanner(System.in);
        skaiciai = new ArrayList<>();
    }

    public ArrayList<String> getSkaiciai() {
        return skaiciai;
    }

    private String insertDigits () {

        int sk = 0;
        do {
            System.out.println("Iveskite skaiciu: ");

            while (!scanner.hasNextInt()) {
                System.out.println("Ivedete neteisingai:");
                scanner.next();
            }
            sk = scanner.nextInt();
        } while (sk < 0);

        return String.valueOf(sk);
    }

    public ArrayList askForInput() {
        String sk1 = insertDigits();
        skaiciai.add(sk1);
        String sk2 = insertDigits();
        skaiciai.add(sk2);

        return skaiciai;
    }
}
