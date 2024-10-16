import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FavNumbers {
    public static void main(String[] args) throws IOException {
        InputStreamReader sr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(sr);
        int num = Methods.getInt(br, "Enter your favorite int: ");
        double doub = Methods.getDouble(br, "Enter your favorite double: ");
    }
}
