import java.util.Scanner;

public class Main {
    public static final Scanner stdin = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter a sentence: ");
        String userInput = stdin.nextLine();
        System.out.println(userInput.replace(" ", "*"));



    }
}