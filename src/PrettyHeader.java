public class PrettyHeader {
    public static void prettyHeader(String msg) {
        int cols = 54;
        int messageLen = msg.length();
        int padding = (cols - messageLen)/2;
        int offset = 0;
        if (messageLen % 2 == 0) {
            offset = 2;
        } else {
            offset = 1;
        }

        System.out.println("**********************************************************");
        System.out.print("***");
        for (int i = 0; i < padding; i++) {
            System.out.print(" ");
        }
        System.out.print(msg);
        for (int y = 0; y < padding - offset; y++) {
            System.out.print(" ");
        }
        System.out.print("***");
        System.out.println();
        System.out.println("**********************************************************");

    }
}

