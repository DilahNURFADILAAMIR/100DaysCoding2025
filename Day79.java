import java.util.Scanner;
public class Day79 {
        public static void main(String[] args) {
            Scanner tes = new Scanner(System.in);
            System.out.println(" REGISTRASI AKUN ");
            String regUser, regPass;
            while (true) {
                System.out.print("Buat Username : ");
                regUser = tes.nextLine().trim();
                System.out.print("Buat Password : ");
                regPass = tes.nextLine().trim();
                if (regUser.isEmpty() || regPass.isEmpty()) {
                    System.out.println("Error: Username dan Password tidak boleh kosong!\n");
                } else {
                    System.out.println("Registrasi Berhasil!\n");
                    break; 
                }
            }
            System.out.println(" LOGIN KE AKUN ");
            while (true) {
                System.out.print("Masukkan Username : ");
                String inputUser = tes.nextLine();
                System.out.print("Masukkan Password : ");
                String inputPass = tes.nextLine();

                if (inputUser.equals(regUser) && inputPass.equals(regPass)) {
                    System.out.println("Login Berhasil!");
                    break; 
                } else {
                    System.out.println("Gagal: Username atau Password salah! Silakan coba lagi.\n");
                }
            }

        }}
