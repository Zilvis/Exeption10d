import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        intDivider intDivider = new intDivider();
        var input = new InputManager();
        input.askForInput();

        System.out.println(intDivider.divide(input.getSkaiciai()));
    }
}