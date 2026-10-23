import java.util.Scanner;

public class Oppgave2c {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= 10; i++) {
            int poeng;

            do {
                System.out.print("Skriv inn poengsum for student " + i + ": ");
                poeng = scanner.nextInt();

                if (poeng < 0 || poeng > 100) {
                    System.out.println("Feilmelding: Ugyldig poengsum. Må være mellom 0 og 100.");
                }
            } while (poeng < 0 || poeng > 100);

            if (poeng >= 90) {
                System.out.println("Karakter: A");
            } else if (poeng >= 80) {
                System.out.println("Karakter: B");
            } else if (poeng >= 60) {
                System.out.println("Karakter: C");
            } else if (poeng >= 50) {
                System.out.println("Karakter: D");
            } else if (poeng >= 40) {
                System.out.println("Karakter: E");
            } else {
                System.out.println("Karakter: F");
            }
        }
    }
}