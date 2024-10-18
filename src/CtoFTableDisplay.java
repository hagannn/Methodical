public class CtoFTableDisplay {
    public static double CtoF(double cel) {
        return (cel * 9/5) + 32;
    }

    public static void main(String[] args) {
        int padding = 20;
        System.out.print("┌");
        for (int i = 0; i < padding; i++) {
            System.out.print("─");
        }
        System.out.println("┐");
        System.out.print("│");

        for (int i = 0; i < padding/4-1; i++) {
            System.out.print(" ");
        }
        System.out.print("Cel");
        for (int i = 0; i < padding/4-1; i++) {
            System.out.print(" ");
        }
        for (int i = 0; i < padding/4-1; i++) {
            System.out.print(" ");
        }
        System.out.print("Feh");
        for (int i = 0; i < padding/4-1; i++) {
            System.out.print(" ");
        }
        System.out.println();

        //System.out.println("│  Cel   │  Feh  │");
        for (double i = -100; i < 101; i++) {
            System.out.printf("│ %3.2f │ %3.2f │", i, CtoF(i));
            System.out.println();
        }
    }

}
