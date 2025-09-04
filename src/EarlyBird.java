
import java.util.Scanner;

public class EarlyBird {
    final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        greet("EarlyBird", "2020");
        remindName();
        guessAge();
        count();
        test();
        end();
    }

    static void greet(String assistantName, String birthYear) {
        System.out.println("Hello! My name is " + assistantName + ".");
        System.out.println("I was created in " + birthYear + ".");
        System.out.println("Remind me your name, please.");
    }

    static void remindName() {
        String name = scanner.nextLine();
        System.out.println("I really like your name, " + name + "!");
    }

    static void guessAge() {
        System.out.println("Let me guess your age ;)");
        System.out.println("Enter remainders of dividing your age by 3, 5 and 7.");
        int rem3 = scanner.nextInt();
        int rem5 = scanner.nextInt();
        int rem7 = scanner.nextInt();
        int age = (rem3 * 70 + rem5 * 21 + rem7 * 15) % 105;
        System.out.println("Your age is " + age + " :)");
    }

    static void count() {
        System.out.println("Now I will prove to you that I can count to any number you want.");
        int num = scanner.nextInt();
        for (int i = 0; i <= num; i++) {
            System.out.printf("%d!\n", i);
        }
    }

    static void test() {
        System.out.println("Let's test your knowledge.");
        System.out.println("Who created Java on May 23, 1995 ?");
        System.out.println(" 1. Bill Joy");
        System.out.println(" 2. Timothy John Berners-Lee");
        System.out.println(" 3. James Gosling");
        System.out.println(" 4. Guido van Rossum");

        for (int answer = scanner.nextInt(); answer != 3; ) {
            System.out.println("Please, try again.");
            answer = scanner.nextInt();
        }
    }

    static void end() {
        System.out.println("Exactly! Congratulations!");
    }
}
