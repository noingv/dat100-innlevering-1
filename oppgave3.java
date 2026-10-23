import java.math.BigInteger;
import java.util.Scanner;

public class oppgave3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;

        do {
            System.out.print("Skriv inn et heltall n > 0: ");
            while (!scanner.hasNextInt()) {
                System.out.print("Ugyldig input. Skriv inn et heltall n > 0: ");
                scanner.next();
            }
            n = scanner.nextInt();
        } while (n <= 0);

        BigInteger fakultet = BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
            fakultet = fakultet.multiply(BigInteger.valueOf(i));
        }

        System.out.println(n + "! = " + fakultet);
        scanner.close();
    }
}