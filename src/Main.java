import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isTrue = true;
        String choose = "10";
        Random random = new Random();
        do {
            System.out.println("Head or Tail?\n 1.Head\n 2.Tail");
            choose = scanner.next();
            if (choose.equals("1") || choose.equals("2")) {
                String randomString = String.valueOf(random.nextInt(2) + 1);
                if (choose.equals(randomString)) {
                    System.out.println("You won");
                } else {
                    System.out.println("You lost");
                }
            } else {
                System.out.println("Wrong choose, try again");
            }
            System.out.println("Would you like to play again? T/N");
            choose = scanner.next();
            if (choose.equalsIgnoreCase("T")) {
                for (int i = 0; i < 20; i++) {
                    System.out.println("");
                }
            } else if (choose.equalsIgnoreCase("N")) {
                System.out.println("Bye :D");
                isTrue = false;
            } else {
                System.out.println("Invalid value, exiting");
            }
        } while (isTrue);
    }
}
