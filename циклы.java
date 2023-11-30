/*Цикл - это многократное выполнение одинаковой последовательности действий.
B java доступны следующие циклы:
• цикл while:
• цикл do while;
• цикл for; и его модификация for in*/
public class циклы {
    public static void main(String[] args) {
        int value = 321;
        int count = 0;

        while (value != 0) {
            value /= 10;
            count++;
            System.out.println (count);
        }
    }
}
/*continue, break
Операторы для управления циклами - continue n break.
Выполнение следующей итерации цикла - continue
Прерывание текущей итерации цикла - break.
* ближайшего к оператору */

for (int i = 0; i < 10; i++) {
    if (i % 2 == 0) {
        continue; // перебирает все числа подходящие под условия
        //а break только первое подходящее
    }
    System.out.println(i);
}

public class Program {
    public static void main (String[] args) {
        int s = 0;
        for (int i = 1; i <= 10; i++) {
            s += i;
        System.out.println(s);
        }
    }
}

public class Program {
    public static void main (String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++){
        System.out.print ("* ");
        }
        System.out.println();
        }
    }
}

//коллекции
public class program {
    
    public static void main(String[] args) {

    int[] arr = new int[] {1, 2, 3, 4, 5, 77};
    // for (int i = 0; i < arr.length; i++) {
    //     arr[i] =10;
    // }
    for (int item : arr) {
        item = 13;
        //System.out.println (item);
    }
    for (int item : arr) {
       
        System.out.println(item);

    }
}
}
