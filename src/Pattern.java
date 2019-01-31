public class Pattern {
    public static void main(String[] args) {
        int tabs = 2;
        for (int i = 1; i <= 5; i=i+2) {
            for (int j = 1; j <= i; j++) {
                for (int t = 1; t <=tabs; t++) {
                    System.out.print(" ");
                }
                System.out.print("*");
                tabs--;
            }
            System.out.println();
        }
        tabs = 1;
        for (int i = 3; i >= 1; i=i-2) {
            for (int t = 1; t <=tabs; t++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {

                System.out.print("*");
            }
            tabs++;
            System.out.println();
        }
    }
}
