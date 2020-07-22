import java.util.Scanner;

public class Beginner1004 {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        int p1 = read.nextInt();
        int p2 = read.nextInt();

        int PROD = p1 * p2;

        System.out.println("PROD = " +PROD);
        System.out.println("\n");

        read.close();
    }
}