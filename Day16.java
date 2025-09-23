import java.util.Scanner;
public class Day16 {

    public static void main(String[] args) {
        Scanner tes = new Scanner(System.in);
        int X = tes.nextInt();

        final int KapasitasPerBus = 50;
        final int biayaPerBus = 7500000;

        int totalKapasitas = X * KapasitasPerBus;
        int totalBiaya = X * biayaPerBus;
        int biayaPerKursi = totalBiaya / totalKapasitas;

        System.out.println("Total kapasitas penumpang:" + totalKapasitas+"orang");
        System.out.println("Biaya per kursi/penumpang:Rp" + biayaPerKursi);
    }
}
