import java.util.Scanner;

public class Beginner1005 {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        double A = read.nextDouble();
        double B = read.nextDouble();

        double media = ((A * 3.5) + (B * 7.5)) / 11;

        System.out.printf("MEDIA = %.5f\n", media);
    }
}
