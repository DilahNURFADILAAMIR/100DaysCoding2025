import java.util.Scanner;
public class Day76 {
    public static void main(String[] args) {
        Scanner tes = new Scanner(System.in);

        while (true) {
            System.out.print("Masukkan Username : ");
            String username = tes.nextLine();
            
            if (username.equalsIgnoreCase("EXIT")) {
                System.out.println("Program dihentikan.");
                break;
            }
            if (username.isEmpty()) {
                System.out.println("Data tidak boleh kosong!");
                continue;
            }
            if (username.equalsIgnoreCase("joker")) {
                System.out.println("User ini telah dibanned.");
                continue;
            }
            System.out.print("Masukkan Komentar: ");
            String komentar = tes.nextLine();
            if (komentar.isEmpty()) {
                System.out.println("Data tidak boleh kosong!");
                continue;
            }
            String cek = komentar.toLowerCase();
            if (cek.contains("kasar") || cek.contains("bodoh") || cek.contains("promo")) {
                System.out.println("Komentar mengandung konten terlarang!");
                continue;
            }
            System.out.println("Komentar berhasil dipublikasikan!");
        }
    }
}
