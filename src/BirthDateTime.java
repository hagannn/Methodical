import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BirthDateTime {
    public static void main(String[] args) throws IOException {
        InputStreamReader sr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(sr);

        int year = Methods.getRangedInt(br, "Enter birth year (1950-2015): ", 1950, 2015);
        int month = Methods.getRangedInt(br, "Enter birth month (1-12): ", 1, 12);
        int hour = Methods.getRangedInt(br, "Enter birth hour (1-24): ", 1, 24);
        int minutes = Methods.getRangedInt(br, "Enter birth minute (1-59): ", 1, 59);
        int day;

        switch (month) {
            case 4:
                day = Methods.getRangedInt(br, "Enter birth day (1-30): ", 1, 30);
                break;
            case 6:
                day = Methods.getRangedInt(br, "Enter birth day (1-30): ", 1, 30);
                break;
            case 9:
                day = Methods.getRangedInt(br, "Enter birth day (1-30): ", 1, 30);
                break;
            case 11:
                day = Methods.getRangedInt(br, "Enter birth day (1-30): ", 1, 30);
                break;
            case 2:
                day = Methods.getRangedInt(br, "Enter birth day (1-30): ", 1, 29);
                break;
            default:
                day = Methods.getRangedInt(br, "Enter birth day (1-30): ", 1, 31);
                break;
        }

    }
}
