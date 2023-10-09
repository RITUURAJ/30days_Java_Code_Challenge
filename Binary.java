public class Binary {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        int c = 12;
        int d = 0;
        b = ++a; // pre increment and a++ post increment
        System.out.println(a);
        System.out.println(b);
        d = c--; // post drecement and --c pre decrement
        System.out.println(c);
        System.out.println(d);
        int x = 10;
        int y = 10;
        if (x == y) {
            System.out.println("Yes number are equal");
        } else {
            System.out.println("No numbers are not equal");
        }
    }
}
