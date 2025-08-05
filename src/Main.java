import java.util.Scanner;

public class Main {

    public static void contarRegressivamente(int n) {
        for (int i = n; i >= 0; i--) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        int numeroNatural;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe um número natural:");
        numeroNatural = scanner.nextInt();
        contarRegressivamente(numeroNatural);
    }
}