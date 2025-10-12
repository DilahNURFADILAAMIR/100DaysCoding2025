import java.util.Scanner;
public class Day35 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int y = input.nextInt();
        char arah = input.next().charAt(0);

        if (arah == 'U') {
            y = y + 1;
        } else if (arah == 'S') {
            y = y - 1;
        } else if (arah == 'T') {
            x = x + 1;
        } else if (arah == 'B') {
            x = x - 1;
        }
        System.out.println(x + ", " + y);
    }
}
