import java.util.Scanner;
public class Day71 {
    public static void main(String[] args) {
        Scanner tes = new Scanner(System.in);
        System.out.print(" Segitiga Siku Siku : ");
        int N = tes.nextInt();
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
                System.out.println();
            }
        }
}
