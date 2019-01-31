public class ObjectCreation {
    private int a;
    private String name;

    public static void main(String[] args) {
        ObjectCreation a = new ObjectCreation();
        a.a = 2;
        a.name = "Saurav";
        print(a);

    }

    private static void print(ObjectCreation x) {
        System.out.println("a = " + x.a + " and Name = " + x.name);
    }
}
