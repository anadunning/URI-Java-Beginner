import java.util.Scanner;

public class Beginner1002 {

    private static final double Pi = 3.14159;

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        double R = read.nextDouble();

        double A = Pi * R * R;
        System.out.printf("A=%.4f", A);
        System.out.println("\n");

        read.close();
    }
}
