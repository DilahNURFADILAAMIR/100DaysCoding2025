import java.util.Scanner;
public class Day78 {
    public static void main(String[] args) {
        Scanner tes = new Scanner(System.in);
        System.out.println(" DAFTAR AKUN BARU ");
        System.out.print("Username: ");
        String user = tes.nextLine().trim();
        if (user.isEmpty()) {
            System.out.println("ERROR: Username kosong!");
            return;
        }
        if (user.length() > 12) {
            System.out.println("ERROR: Username terlalu panjang!");
            return;
        }
        System.out.print("Password: ");
        String pass = tes.nextLine();
        if (pass.length() < 8) {
            System.out.println("ERROR: Password minimal 8 karakter!");
            return;
        }
        if (pass.toLowerCase().contains("admin")) {
            System.out.println("ERROR: Password tidak boleh mengandung 'admin'!");
            return;
        }
        if (!Character.isUpperCase(pass.charAt(0))) {
            System.out.println("ERROR: Huruf pertama password harus kapital!");
            return;
        }

        System.out.print("Ulangi Password: ");
        String ulang = tes.nextLine();

        if (!ulang.equals(pass)) {
            System.out.println("ERROR: Password tidak cocok!");
            return;
        }

        System.out.println("SUKSES: Pendaftaran Berhasil!");
        System.out.println("Username '" + user.toLowerCase() + "' telah aktif.");
    }
}
