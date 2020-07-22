import java.util.Scanner;

public class Beginner1001 {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        int A = read.nextInt();
        int B = read.nextInt();

        System.out.println("X = " +(A+B));

        read.close();
    }
}
