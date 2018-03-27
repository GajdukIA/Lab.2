package by.belstu.it.haiduk.basejava;

import java.io.UnsupportedEncodingException;
import java.util.Objects;

import static java.lang.Math.*;

public class JavaTest {

    static int sint;

    // Константы
    final int CONST_1 = 5;
    public final int CONST_2 = 6;
    public static final int CONST_3 = 7;

    /**
     *  return ничего не возвращает
     * @param args - аргументы комадной строки
     */
    public static void main(String[] args) {
        char a = 'g';
        int b = -7;
        short c = 3;
        byte d = 4;
        long r = 5;
        boolean f1 = false;
        boolean f2 = true;
        String g = "слово";
        double h = 6.4;
        String res1 = g+b;
        System.out.println("String + int = "+ res1);

        String res2 = g + a;
        System.out.println("String + char = "+ res2);

        String res3 = g + h;
        System.out.println("String + double = "+ res3);

        //byte res4 = d + b; (byte + int) -> error
        int res5 = (int)(h + r);
        System.out.println("int = double + long = "+ res5);

        long res6 = b + 2147483647;
        System.out.println("long = int + 2147483647 = "+ res6);

        System.out.println("static int sint без инициализации = " + sint); // 0

        boolean res7 = f1 && f2;
        System.out.println("boolean && boolean = "+ res7); // false

        boolean res8 = f1 ^ f2;
        System.out.println("boolean ^ boolean = "+ res8);

        //boolean res9 = f1 + f2; (boolean + boolean) -> error

        // подобрать тип данных
        float r1 = 9223372036854775807F;
        double r2 = 9223372036854775807D;
        long r3 = 9223372036854775807L;
        long r4 = 0x7fff_ffff_fffL;
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r4);

        char ch1 = 'a';
        char ch2 = '\u0061';
        char ch3 = 97;
        System.out.println("a + 0061 + 97 = " + ch1+ch2+ch3); // 'a' + '\u0061' + 97

        System.out.println("3.45 % 2.4 = " + (3.45 % 2.4));

        System.out.println("1.0 / 0.0 = " + 1.0/0.0); // Infinity
        System.out.println("0.0 / 0.0 = " + 0.0/0.0); // NaN

        double i = Math.log(-345);
        System.out.println("log(-345) = " + i); // NaN

        // Метод возвращает значение с плавающей точкой с тем же битовым шаблоном
        System.out.println(Float.intBitsToFloat(0x7F800000)); // Infinity
        System.out.println(Float.intBitsToFloat(0xFF800000)); // -Infinity

        double p = PI;
        double e = E;
        System.out.println("Math.PI = " + p);
        System.out.println("Math.E = " + e);
        System.out.println("Math.round(PI) = " + round(p));
        System.out.println("Math.round(E) = " + round(e));
        System.out.println("Math.min(p,e) = " + min(p,e));

        double q = random();
        System.out.println("random [0,1) = " + q);

        Boolean t1 = true;
        Character t2 = 'm';
        Integer t3 = 32;
        Byte t4 = 127;
        Short t5 = 55;
        Long t6 = 788888888L;
        Double t7 = 99.6D;
        Integer t8 = 5;

        System.out.println("Integer >> " + (t3 >> 2)); // Побитовый сдвиг вправо
        System.out.println("Short + Integer = " + (t5 + t3)); // Арифметическая операция
        System.out.println("Integer | Integer = " + (t3 | t8)); // Побитовое OR

        System.out.println("Long.MIN_VALUE = " + Long.MIN_VALUE);
        System.out.println("Long.MAX_VALUE = " + Long.MAX_VALUE);
        System.out.println("Double.MIN_VALUE = " + Double.MIN_VALUE);
        System.out.println("Double.MAX_VALUE = " + Double.MAX_VALUE);

        Integer i1 = t3;
        Byte i2 = t4;

        Integer p1 = Integer.parseInt("55");
        System.out.println("Integer.parseInt(string): " + p1);
        System.out.println("Integer.toHexString(Integer): " + Integer.toHexString(t8));
        System.out.println("Integer.compare(Integer, Integer): " + Integer.compare(t3, t8)); // 1
        System.out.println("Integer.toString(): " + t8.toString());
        System.out.println("Integer.bitCount(): " + Integer.bitCount(t8));

        String s34 = "2345";
        Integer s34New = new Integer(s34);
        System.out.println("Преобразование к int через конструктор: " + s34New);
        Integer sc = Integer.valueOf(s34); // возвращает объект new Integer()
        System.out.println("valueOf(2345): " + sc);
        Integer sd = Integer.parseInt(s34); // возвращает примитивный тип int
        System.out.println("parseInt(2345): " + sd);

        // перевод строки в массив байтов в строку и обратно
        byte[] b3 = s34.getBytes();
        System.out.println("Перевод строки в массив байтов: " + b3);
        try {
            String s341 = new String(b3, "cp1251");
            System.out.println("Перевод массива байтов в строку: " + s341);
        }
        catch (UnsupportedEncodingException ex) {
            ex.printStackTrace();
        }

        // преобразование строки в логический тип

        String s2 = "true";
        // с использованием метода parseBoolean
        boolean bool1 = Boolean.parseBoolean(s34); // false
        boolean boolean1 = Boolean.parseBoolean(s2); //true
        System.out.println("parseBoolean: " + bool1);
        System.out.println("parseBoolean: " + boolean1);

        // с использованием метода valueOf
        boolean bool2 = Boolean.valueOf(s34);
        boolean boolean2 = Boolean.valueOf(s2);
        System.out.println("valueOf: " + bool2);
        System.out.println("valueOf: " + boolean2);

        String str1 = "Hel";
        String str2 = "Hello";
        System.out.println("Hello == Hello: " + (str1 == str2)); //true
        System.out.println("Hello.equals(Hello): " + str1.equals(str2)); // true
        System.out.println("Hello.compareTo(Hello): " + str1.compareTo(str2)); // 0

        String str3 = null;
        System.out.println("Hello == null: " + (str1 == str3)); // false
        System.out.println("Hello.equals(null): " + str1.equals(str3)); // false
        //System.out.println("Hello.compareTo(null): " + str1.compareTo(str3)); // NullPointerException

        String[] parts = str1.split("e"); // разбивает строку на основании заданного регулярного выражения
        System.out.println("Hello.split(e):");
        System.out.println("                parts[0]: " + parts[0]);
        System.out.println("                parts[1]: " + parts[1]);

        System.out.println("Hello.contains(el): " + str1.contains("el")); // true
        System.out.println("Hello.contains(nn): " + str1.contains("nn")); // false
        System.out.println("Hello.hashCode(): " + str1.hashCode());
        System.out.println("Hello.indexOf(o): " + str1.indexOf('o'));
        System.out.println("Hello.length(): " + str1.length());
        System.out.println("Hello.replace(H, t): " + str1.replace('H','t'));

        char[][] c1;
        char[] c2[];
        char c3[][];

        char[] c4 = new char[0];
        System.out.println("Массив нулевой длины: " + c4.length);
        char[] c5 = new char[2];
        //c5[3] = 4; java.lang.ArrayIndexOutOfBoundsException

        c1 = new char[3][];
        int size = 0;
        for(int j = 0; j < c1.length; j++,size++) {
            c1[j] = new char[size];
        }
        System.out.println("Размер массива: " + c1.length);
        System.out.println("Длина каждого массива:");
        for(int k = 0; k < c1.length; k++) {
            System.out.println("c1[" + k + "].length = " + c1[k].length );
        }

        c2 = new char[][]{{'1', 'R', 'H', '5'}, {}, {'L', 'O', 'I'}};
        System.out.println("Вывод массива с помощью упрощенной конструкции foreach:");

        //получаем одномерный массив
        for(char[] c21: c2) {
            for(char c22: c21) {
                // печатаем строку из массива
                System.out.print(c22 + " ");
            }
            System.out.println();
        }

        c3 = new char[][] {{'A','B'},{'V','6'}};
        boolean comRez = c2 == c3;
        System.out.println("c2 == c3: " + comRez);
        c2 = c3; // ссылки можно присваивать
        System.out.println("Присвоение одному массиву другой:");

        for(char[] c21: c2) {
            for(char c22: c21) {
                // печатаем строку из массива
                System.out.print(c22 + " ");
            }
            System.out.println();
        }

        WrapperString wrappStr = new WrapperString("Старая строка");


        WrapperString anonym = new WrapperString("Привет мир!") {
            @Override
            public void replace(char oldchar, char newchar) {
                System.out.println("Hello World!");
            }
            public void delete(char newchar) {
                System.out.println("Удалил");
            }
        };
        anonym.replace('р','d');
    }
}

class WrapperString {
    private String stroka;

    public WrapperString(String stroka) {
        this.stroka = stroka;
    }

    public String getStroka() {
        return stroka;
    }

    public void setStroka(String stroka) {
        this.stroka = stroka;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WrapperString that = (WrapperString) o;
        return Objects.equals(stroka, that.stroka);
    }

    @Override
    public int hashCode() {

        return Objects.hash(stroka);
    }

    @Override
    public String toString() {
        return "WrapperString{" +
                "stroka='" + stroka + '\'' +
                '}';
    }
    public void replace (char oldchar, char newchar) {
        this.stroka.replace(oldchar,newchar);
    }


    /**
     * @author Igor
     * @version 1.0
     */
}
