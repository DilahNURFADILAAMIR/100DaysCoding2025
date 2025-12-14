import java.util.Scanner;
public class Day98 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println(" masukkan jumlah deret : ");
            int n = sc.nextInt();
            int a = 0, b = 1;
            for (int i = 0; i < n; i++) {
                System.out.print(a + " ");
                b = a + b;
                a = b - a;
            }
        }
    }
