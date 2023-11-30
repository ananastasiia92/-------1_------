public class операции {
// Присваивание: =
// Арифметические: *, /, +, -, %, ++,
// Операции сравнения: <, >, ==, !=, >=
// Логические операции: |1, &&, ^, !
// Побитовые операции <<, ›>, &, 1, ^
    public static void main(String[] args) {
        int s = 123;

        System.out.println(s++);//123
        System.out.println(s);//124  приоритет вывода инкримента ниже,
        // чем вывод операции(кроме предфиксного) (++s)
        int a = 5;
        int b = 2;
        System.out.println(a ^ b);
        System.out.println(a | b);
        System.out.println(a & b);
        // 101
        // 010
        // 111
        String i = "awer"; // 4, 0..3
        //boolean r = i.length() >= 5 && i.charAt(4) == '1';
        // длина больше или равна 5 и 4 символ равен 1
        boolean r = i.length() >= 5 & i.charAt(4) == '1';
        System.out.println(r);
}
}
