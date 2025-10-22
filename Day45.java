import java.util.Scanner;
public class Day45 {
        public static void main(String[] args) {
            Scanner tes = new Scanner(System.in);
            System.out.print("Masukkan angka (1-7): ");
            int hari = tes.nextInt();
            String namaHari;
            switch (hari) {
                case 1:
                    namaHari = " Senin ";
                    break;
                case 2:
                    namaHari = " Selasa ";
                    break;
                case 3:
                    namaHari = " Rabu ";
                    break;
                case 4:
                    namaHari = " Kamis ";
                    break;
                case 5:
                    namaHari = " Jumat ";
                    break;
                case 6:
                    namaHari = " Sabtu ";
                    break;
                case 7:
                    namaHari = " Minggu ";
                    break;
                default:
                    namaHari = " Tidak ada hari dengan angka tersebut! (Jumlah hari hanya 7) ";
            }
            System.out.println(" Sekarang adalah hari " + (hari >= 1 && hari <= 7 ? namaHari : ""));
            if (hari < 1 || hari > 7) {
                System.out.println(namaHari);
            }
        }
            }
