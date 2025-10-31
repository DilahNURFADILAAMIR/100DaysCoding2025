public class Day54 {
    public static void main(String[] args) {
            System.out.println(" Program mencetak angka 1–50 (kecuali kelipatan 5): ");
            for (int i = 1; i <= 50; i++) {
                if (i % 5 == 0) {
                    continue; 
                }
                System.out.print(i + " ");
            }
        }
    }
