public class Day80 {
        public static void main(String[] args) {
            String[] lagu = {
                    "Bergema Sampai Selamanya",
                    "Perfect",
                    "Somebody's Pleasure",
                    "One in a Million",
                    "Say You Won't Let Go"
            };
            System.out.println("Lagu Juara: " + lagu[0]);
            System.out.println("Lagu Terakhir: " + lagu[4]);
            System.out.println("Wah, saya bosan dengan " + lagu[2] + ". Ganti jadi Until I Found You.");
            lagu[2] = "Until I Found You";
            System.out.println("Lagu ke-3 sekarang: " + lagu[2]);
            System.out.println("Total lagu: " + lagu.length);
        }
    }
