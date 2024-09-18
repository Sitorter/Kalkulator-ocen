import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        System.out.println("How much points did you get on the test?");
        Scanner scanner = new Scanner(System.in);
        int points = scanner.nextInt();
        if (points < 60) {
            System.out.println("You got F");
        }
        else if (points > 60 ) {
            if (points < 69) {
                System.out.println("You got D");
            }
        }
        else if (points > 70 ) {
            if (points < 79) {
                System.out.println("You got C");
            }
        }
        else if (points > 80 ) {
            if (points < 89) {
                System.out.println("You got B");
            }
        }
        else if (points > 90 ) {
            if (points < 100) {
                System.out.println("You got A");
            }
        }
        scanner.close();
    }
}