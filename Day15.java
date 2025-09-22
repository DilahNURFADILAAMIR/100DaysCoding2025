public class Day15 {

        public static void main(String[] args) {
            String aStr = "100";
            String bStr = "25";

            // Operasi sebelum parse (String + String gabungan teks)
            System.out.println("Sebelum parse (penjumlahan): " + (aStr + bStr));

            // Parse ke integer
            int a = Integer.parseInt(aStr);
            int b = Integer.parseInt(bStr);

            // Operasi setelah parse
            System.out.println("Setelah parse (penjumlahan): " + (a + b));
            System.out.println("Setelah parse (pengurangan): " + (a - b));
        }
    }
