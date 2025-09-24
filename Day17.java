import java.util.Scanner;
    public class Day17 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Masukkan jumlah permen: ");
            int permen = sc.nextInt();

            System.out.print("Masukkan jumlah murid: ");
            int murid = sc.nextInt();

            System.out.println("-----------------------------");
            System.out.println("Setiap murid menerima: " + (permen / murid) + " permen");
            System.out.println("Sisa permen yang tidak terbagi: " + (permen % murid));
        }
    }
