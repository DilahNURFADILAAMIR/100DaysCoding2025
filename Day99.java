import java.util.Scanner;
public class Day99 {
        public static void main(String[] args) {
            Scanner tes = new Scanner(System.in);
            System.out.print(" masukkan batas atas: ");
            int n = tes.nextInt();
            for (int i = 2; i <= n; i++) {
                boolean prima = true;
                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        prima = false;
                        break;
                    }
                }
                if (prima) {
                    System.out.print(i + " ");
                }
            }
        }
    }
