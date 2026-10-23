import java.util.Scanner;

public class Trinnskatt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Skriv inn bruttoinntekt i NOK: ");
        double inntekt = scanner.nextDouble();

        if (inntekt < 0) {
            System.out.println("Inntekt kan ikke være negativ.");
            return;
        }

        double trinnskatt = 0.0;

        double grense1 = 226100;
        double grense2 = 318800;
        double grense3 = 725050;
        double grense4 = 980100;
        double grense5 = 1467200;

        if (inntekt > grense1) {
            double del = Math.min(inntekt, grense2) - grense1;
            trinnskatt += del * 0.017;
        }

        if (inntekt > grense2) {
            double del = Math.min(inntekt, grense3) - grense2;
            trinnskatt += del * 0.04;
        }

        if (inntekt > grense3) {
            double del = Math.min(inntekt, grense4) - grense3;
            trinnskatt += del * 0.137;
        }

        if (inntekt > grense4) {
            double del = Math.min(inntekt, grense5) - grense4;
            trinnskatt += del * 0.168;
        }

        if (inntekt > grense5) {
            double del = inntekt - grense5;
            trinnskatt += del * 0.178;
        }

        System.out.printf("Trinnskatt: %.2f kr%n", trinnskatt);
    }
}