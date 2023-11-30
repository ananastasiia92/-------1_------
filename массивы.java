

public class массивы {
    public static void main(String[] args) {
        // // Одномерные
        int[] arr = new int[10];
        arr[3] = 13;
        System.out.println(arr[3]); 

        // // Двумерные
        int []  brr [] = new int [3] [5];
        for (int[] line : brr) {
        for (int item : line) {

        System.out.printf ("%d ", item);
        }
        System.out.println () ;

        int grr[] [] = new int [3][5];
        for (int i = 0; i < grr.length; i++) {
            for (int j = 0; j< grr[i].length; j++) {
                System.out.printf("%d ", grr[i][j]);
            }
            System.out.println();
        }
    }
}
}
