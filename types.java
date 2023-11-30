/*Типы данных
- ссылочные
- примитивные

Создание переменной
<тип> <идентификатор>;
<идентификатор> = <значение>;*/

public class types {
    public static void main(String[] args) {
        String s = null;
        float f = 123.23f;//суффикс f идет в обязательном порядке
        double d = 123.23;// double d = 123.23D, но суффикс D ставить необязательно
        char ch = '{';// для хранения значений
        boolean r = true && false;// ||, |, & (вовращает неправдивое значение)
        boolean p = true ^ false;// ^(разделительная дизьюнкция, возвращает только истину)
        String tr = "Hello, World!";
        var i = 123;//неявная типизация(при компиляции подставляется тот тип данных, который
        // более вероятен для данного значения)
        


        System.out.println(s);
        System.out.println(f);
        System.out.println(d);
        System.out.println(ch);
        System.out.println(r);
        System.out.println(p);
        System.out.println(tr);
        System.out.println(i);
        System.out.println(getType(i));
    }
    static String getType(Object o){
        return o.getClass().getSimpleName();
    }
    
}