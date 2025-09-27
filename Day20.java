import java.util.Scanner;
public class Day20{
        public static void main(String[] args) {
            Scanner tes = new Scanner(System.in);

            System.out.print("Masukkan tahun masuk : ");
            int tahunMasuk = tes.nextInt();

            System.out.print("Masukkan nomor urut  : ");
            int nomorUrut = tes.nextInt();

            String idKaryawan = "KRY-" + tahunMasuk + "-" + nomorUrut;

            System.out.println("ID Karyawan : " + idKaryawan);
        }
    }
