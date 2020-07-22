import java.util.Scanner;

public class Beginner1006 {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        double A = read.nextDouble();
        double B = read.nextDouble();
        double C = read.nextDouble();

        double avg = ((A * 2) + (B * 3) + (C * 5)) / 10;

        System.out.println("MEDIA = " +avg);

        read.close();
    }
}
