/*
Функции и методы - это технически одно и то же. 
Функции могут не принадлежать классам, а методы принадлежат.
B iava все функции являются методами.
Описание
Вызов
Возвращаемое значение
Рекурсия 
Можно создать файл отдельный с библиотеками и вызывать отдельно по названию
public static void main (String[] args) {
    lib.sayHi();
}
*/
public class фунции_и_методы {
    static void sayHi () {
        System.out.println ("hi!");
    }
    static int sum(int a, int b){
        return a + b;
    }
    static double factor (int n) {
        if (n==1) return 1;
        return n * factor (n-1);   
    }
    public static void main (String[] args){
        sayHi () ; // hi!
        System.out.println (sum (1, 3)); // 4
        System.out.println (factor (5)); // 120.0
    }
}
