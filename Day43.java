import java.util.Scanner;
public class Day43 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print(" Masukkan angka: ");
            int n = sc.nextInt();
            if (n % 3 == 0 && n % 5 == 0)
                System.out.println(" Angka " + n + " merupakan kelipatan 3 dan 5" );
            else if (n % 3 == 0)
                System.out.println(" Angka " + n + " merupakan kelipatan 3" );
            else if (n % 5 == 0)
                System.out.println(" Angka " + n + " merupakan kelipatan 5" );
            else
                System.out.println(" Angka " + n + " bukan kelipatan 3 maupun 5" );
        }
}
