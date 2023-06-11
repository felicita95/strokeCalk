package StrokeKalc;

import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;
import java.util.Scanner;

public class Divide {
     static String div(String a, String b) throws Exception {
        boolean hasDigits = false;
        for (int i = 0; i<a.length() && !hasDigits; i++) {
            if (Character.isDigit(a.charAt(i))) {
                hasDigits = true;
                throw new Exception("1-ый операнд должен быть строкой");
            }
        }
// Провекрка длины до 10 символов
         if (a.length() > 10) {
             throw new Exception("операнд дложен быть не более 10 символов");
         }
//            Проверка 2-ого операнда на цифру
        boolean hasDigital = false;
        for (int i =0;i<b.length() && !hasDigital;i++){
            if (Character.isDigit(b.charAt(i))) {
                hasDigital = true;
            } else {
                throw new Exception("2 операнд должен быть цифрой");
            }
        }
//            Проверка 2-ого операнда на 1 до 10
        int digital = Integer.parseInt(b);
        if (digital > 10 || digital < 1) {
            throw new Exception("Число должно быть от 1 до 10");
        }

//            Нахождение результата деления
        char [] achar = a.toCharArray();
        int c = achar.length;
        int d = c/digital;

//            Вывод нужных элементов без лишних символов
        var bob = Arrays.toString(Arrays.copyOfRange(achar,0,d));
        var s = bob.replaceAll("\\, | ", "");
        if (s.startsWith("[")) {
            s = s.replace("[", "");
        }
        if (s.endsWith("]")) {
            s = s.replace("]", "");
        }
        return s;
    }

// 2-ой способ
    public static String numeros(String a,String c) throws Exception {
        int v;
//        Проверили на цифру 1 операнд
        boolean hasDigital1 = StringUtils.isNumeric(a);
        if (hasDigital1) throw new Exception("должен содержать строку без цифр");
//       На длину 1 операнд
        if (a.length() > 10) throw new Exception("1 операнд дожлен быть не длинее 10 символов");
//        Проверили на цифру 2 операнд
        boolean hasDigital = StringUtils.isNumeric(c);
        if (hasDigital) {
//            Произвести деление
            v = a.length()/Integer.parseInt(c);
        } else throw new Exception("2 должен содержать цифру");
//        Выведи нужные элементы
        return a.substring(0,v);
    }
}



