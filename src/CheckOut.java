import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CheckOut {
    public static void main(String[] args)throws IOException {
        InputStreamReader sr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(sr);
        double userPrice = 0;
        boolean playing = true;

        while (playing) {
            userPrice += Methods.getRangedDouble(br, "Enter price of your item (.50-10.00): ", 0.10, 10.00);
            playing = Methods.getYNConfirm(br, "Do you want to enter more items (y/n): ");
        }
        System.out.println();
        System.out.printf("Total: $%.2f", userPrice);
    }
}
