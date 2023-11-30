public class форм_вывод {
    public static void main(String[] args) {
        int a = 1, b = 2;
        int c = a + b;
        String res = a + " + " + b + " = " + c;
        System.out.println (res);

        int i = 1, j = 2;
        int f = i + j;
        String res1 = String. format ("%d + %d = %d \n", i, j, f);
        System.out.printf ("%d + %d = %d \n", i, j, f);
        System.out.println (res1);
    }
}
