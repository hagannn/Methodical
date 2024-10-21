public class CtoFTableDisplay {
    public static double CtoF(double cel) {
        return (cel * 9/5) + 32;
    }

    public static void main(String[] args) {

        System.out.print("    Cel");

        System.out.print("        Feh");
        System.out.println();

        //System.out.println("│  Cel   │  Feh  │");
        for (double i = -100; i < 101; i++) {
            System.out.printf("│ %06.2f │ %06.2f │", i, CtoF(i));
            System.out.println();
        }
    }

}
