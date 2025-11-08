import java.util.Scanner;
public class Day62 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N, total = 0;
        System.out.print("Masukkan batas angka (N): ");
        N = input.nextInt();
        for (int i = 1; i <= N; i++) {
            total = total + i;
        }
        System.out.println("Total penjumlahan dari 1 sampai " + N + " adalah: " + total);
    }
}
