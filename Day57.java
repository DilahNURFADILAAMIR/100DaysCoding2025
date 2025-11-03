import java.util.Scanner;
public class Day57 {
        public static void main(String[] args) {
            Scanner tes = new Scanner(System.in);
            System.out.print(" Masukkan ukuran sisi persegi (N): ");
            int N = tes.nextInt();
            for (int i = 1; i <= N; i++) {
                for (int j = 1; j <= N; j++) {
                    if (i == 1 || i == N || j == 1 || j == N) {
                        System.out.print( "* " );
                    } else {
                        System.out.print( "  " );
                    }
                }
                System.out.println();
            }
        }
    }
