import java.util.Scanner;
public class Day65 {
        public static void main(String[] args) {
            Scanner tes = new Scanner(System.in);
            int N;
            long hasil = 1;
            System.out.print("Masukkan angka (N): ");
            N = tes.nextInt();
            for (int i = N; i >= 1; i--) {
                hasil *= i;
            }
            System.out.println("Hasil dari " + N + "! adalah: " + hasil);
        }
}
