import java.util.Scanner;
public class Day63 {
    public static void main(String[] args) {
        Scanner tes = new Scanner(System.in);
        int N;
        long total = 1;
        System.out.print("Masukkan batas angka (N): ");
        N = tes.nextInt();
        for (int i = 1; i <= N; i++) {
            total *= i;
        }
        System.out.println("Total perkalian dari 1 sampai " + N + " adalah: " + total);
    }
}
