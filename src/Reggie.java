import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Reggie {
    public static void main(String[] args) throws IOException {
        InputStreamReader sr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(sr);

        String menuText = "O) Open\nS) Save\nV) View\nS) Save\nQ) Quit";

        //123-45-6789
        String ssn = Methods.getRegExString(br, "Input SSN: ", "^\\d{3}-\\d{2}-\\d{4}$");
        String mnumber = Methods.getRegExString(br, "Enter m-number: ", "^(M|m)\\d{5}$");
        System.out.println(menuText+"\n");
        String menuChoice = Methods.getRegExString(br, "Enter menu choice: ", "^[OoSsVvQq]$");

    }
}
