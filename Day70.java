import java.util.Scanner;
public class Day70 {
    public static void main(String[] args) {
        Scanner tes = new Scanner(System.in);
        System.out.print(" Masukkan Panjang (P): ");
        int P = tes.nextInt();
        System.out.print(" Masukkan Lebar   (L): ");
        int L = tes.nextInt();
        for (int i = 0; i < L; i++) {
            for (int j = 0; j < P ; j++) {
                System.out.print("*");
            }
            System.out.println();
            }
        }
        }
