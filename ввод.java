import java.util.Scanner;
public class ввод {
    public static void main(String[] args) {
        // Scanner iScanner = new Scanner (System.in);
        // System.out.printf ("name: ");
        // String name = iScanner.nextLine() ;
        // System.out.printf ("Привет, %s!", name);
        // iScanner.close();

        Scanner iScanner = new Scanner (System.in);
        System.out.printf ("int a: ");
        int x = iScanner.nextInt () ;
        System.out.printf ("double a: ");
        double y = iScanner.nextDouble () ;
        System.out.printf ("8d + 8f = 8f", x, y, x + y) ;
        iScanner.close () ;

        // Проверка на соответсвие получаемых данных
        // Scanner iScanner = new Scanner (System.in);
        // System.out.printf ("int a: ");
        // boolean flag = iScanner.hasNextInt () //******  проверка
        // System.out.printIn (flag);
        // int i = iScanner.nextInt () ;
        // System.out.printin (i);
        // iScanner.close ();
    }
}
