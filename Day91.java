public class Day91 {
    static void hitungGaji(String n, int j) {
            int hasil = j * 50000;
            System.out.println("karyawan " + n + " bekerja " + j + " jam, mendapatkan gaji Rp " + hasil);
        }
        public static void main(String[] args) {
            hitungGaji("aika", 5);
            hitungGaji("kayla", 8);
        }
    }
