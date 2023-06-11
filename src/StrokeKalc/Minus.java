package StrokeKalc;

import org.apache.commons.lang3.StringUtils;

public class Minus {
   public static String minus(String a,String b) throws Exception {
//          Поверка 1 операнда на строку
       boolean hasDigits1 = false;
       for (int i = 0; i < a.length() && !hasDigits1; i ++) {
           if (Character.isDigit(a.charAt(i))) {
           hasDigits1 = true;
           throw new Exception("1 операнд должен быть строкой без цифр");
           }
       }
//        Проверка длины 1 операнда
       if (a.length() > 10) {
           throw new Exception("операнд дложен быть не более 10 символов");
       }

//        Проверка 2 операнда на строку
        boolean hasDigits2 = false;
        for (int i = 0; i < b.length() && !hasDigits2;i ++)
            if (Character.isDigit(b.charAt(i))) {
                hasDigits2 = true;
                throw new Exception("2 операнд должен быть строкой");
            }
//        Прверка длины 2 операнда
       if (b.length() > 10) {
           throw new Exception("операнд должен быть не более 10 символов");
       }

//        Результат вычитания
        String c = a.replace(b,"");
        return c;
    }

//    2-ой способ
    public static String minusi(String a,String b) throws Exception {
//       Проверка 1 операнда на цифру
        boolean hasDigital1 = StringUtils.isNumeric(a);
        if (hasDigital1) throw new Exception("1 операнд должен быть строкой без цифр");
//        Проверим на длину 1 операнд
        if (a.length() > 10) throw new Exception(" 1 операнд должен быть не более 10 символов");
//        Проверить 2 операнд на цифру
        boolean hasDigital2 = StringUtils.isNumeric(b);
        if (hasDigital2) throw new Exception("2 операнд должен быть строкой без цифр");
        if (b.length() > 10) throw new Exception("2 операнд должен быть не более 10 символов");
        return a.replace(b, "");
    }
}
