import java.util.Scanner;
public class Day82 {
        public static void main(String[] args) {
            Scanner tes = new Scanner(System.in);
            System.out.print("Berapa tamu? ");
            int jml = tes.nextInt();
            tes.nextLine();
            String[] tamu = new String[jml];
            for (int i = 0; i < jml; i++) {
                System.out.print("Nama tamu ke-" + (i + 1) + ": ");
                tamu[i] = tes.nextLine();
            }
            System.out.println("Daftar Tamu:");
            for (int i = 0; i < jml; i++) {
                System.out.println((i + 1) + ". " + tamu[i]);
            }
        }
}
