public class Day10 {

        public static void main(String[] args) {
            final int KECEPATAN_CAHAYA = 300000;//km/s

            int waktu = 2;// detik 
            int jarak = KECEPATAN_CAHAYA * waktu;

            System.out.println("Jarak yang ditempuh cahaya dalam " + waktu + " detik adalah " + jarak + " km");
        }
    }
