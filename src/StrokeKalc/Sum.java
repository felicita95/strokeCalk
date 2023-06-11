package StrokeKalc;

import org.apache.commons.lang3.StringUtils;

public class Sum {
    public static String plus(String a,String b) throws Exception {
//        Проверка 1 операнда на наличие цифр и на 1 до 10
        boolean hasDigits1 = false;
        for (int i = 0;i < a.length() && !hasDigits1;i++) {
            if (Character.isDigit(a.charAt(i))) {
                hasDigits1 = true;
                    throw new Exception("1 операнд должен быть строкой");

            }
        }
        if (a.length() > 10) {
            throw new Exception("операнд дложен быть не более 10 символов");
        }

//        Проверка 2 операнда на наличие цифр и на 1 до 10
        boolean hasDigits2 = false;
        for (int i = 0; i <b.length() && !hasDigits2; i++) {
            if (Character.isDigit(b.charAt(i))) {
                hasDigits2 = true;
                int digB = Integer.parseInt(b);
                if (digB > 10 || digB < 1) {
                    throw new Exception("Операнд должен включать цифры от 1 до 10");
                }
            }
        }
        if (b.length() > 10) {
            throw new Exception("операнд дложен быть не более 10 символов");
        }
//          Результат суммы
        String resultat = a + b;
        return resultat;
    }



//    2-ой способ
    public static String plusani(String a, String b) throws Exception{
//        Проверить на цифру 1 операнд
        boolean hasDigital1 = StringUtils.isNumeric(a);
        if (hasDigital1) throw new Exception("1 операнд должен быть строкой");
//        проверить длину 1 операнда
        if (a.length() > 10) throw new Exception("операнд дложен быть не более 10 символов");
//        Проверить 2 операнд на длину
        if (b.length() > 10) throw new Exception("операнд дложен быть не более 10 символов");
//        Проверка 2 -ого операнда на цифру от 1 до 10
        if (Integer.parseInt(b) > 10 || Integer.parseInt(b) < 1) throw new Exception("Операнд должен включать цифры от 1 до 10");
        return a + b;
    }
}
