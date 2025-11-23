import java.util.Scanner;
public class Day77 {
        public static void main(String[] args) {
            Scanner tes = new Scanner(System.in);
            System.out.print("Masukkan Hashtag:");
            String tagAsli = tes.nextLine();
            String bersih = tagAsli.trim();
            bersih = bersih.replace("-", " ");
            bersih = bersih.substring(1);
            bersih = bersih.toUpperCase();
            System.out.println("\n--- Hasil Data Cleaning ---");
            System.out.println("Tag Asli   : " + tagAsli);
            System.out.println("Tag Bersih : " + bersih);
        }
    }
