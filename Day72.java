import java.util.Scanner;
public class Day72 {
    public static void main(String[] args) {
        Scanner tes = new Scanner(System.in);
        System.out.print(" segitiga siku siku : ");
        int N = tes.nextInt();
        for (int i = N; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");

            }
            System.out.println();
        }

    }
}
