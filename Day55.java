import java.util.Scanner;
    public class EvaluasiSoal1 {
        public static void main(String[] args) {
            Scanner tes = new Scanner(System.in);
            System.out.println(" Batas Bawah: ");
            int batasBawah = tes.nextInt();
            System.out.println(" Batas Atas: ");
            int batasAtas = tes.nextInt();
            System.out.println(" Angka: ");
            int angka = tes.nextInt();

            if (angka >=batasBawah && angka <= batasAtas) {
                System.out.println("YAYAYA");
            }else{
                System.out.println("NONONO");
            }
        }
    }


import java.util.Scanner;
    public class EvaluasiSoal2 {
        public static void main(String[] args) {
            Scanner tes= new Scanner(System.in);
            System.out.print(" Masukkan nilai ujian: ");
            int nilai = tes.nextInt();
            if (nilai > 70) {
                System.out.println(" Ujian Kroco Ji Pale ");
            } else {
                System.out.println(" Sa Jappo'ka Aih ");
            }
        }
    }

import java.util.Scanner;
public class EvaluasiSoal3 {
        public static void main(String[] args) {
            Scanner tes = new Scanner(System.in);
            System.out.print(" Masukkan sebuah angka: ");
            int angka = tes.nextInt();
            if (angka % 2 == 0) {
                System.out.println(" Iyaaji ");
            } else {
                System.out.println(" Tidakji ");
            }
        }
    }
