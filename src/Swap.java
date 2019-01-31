public class Swap {
    public static void main(String[] args) {
        int x = 30, y = 20;
        print(x,y);
        x = x+y;
        y = x-y;
        x= x-y;
        print(x,y);

    }

    private static void print(int a, int b) {
        System.out.println("a = " + a + " and b = " + b);
    }
}
