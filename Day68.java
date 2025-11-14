import java.util.Scanner;
public class Day68 {
    public static void main(String[] args) {
        Scanner tes = new Scanner(System.in);
        System.out.print("Masukkan ukuran n: ");
        int n = tes.nextInt();
        for (int i = 0; i < n; i++) {       
            for (int j = 0; j < n; j++) {   
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
