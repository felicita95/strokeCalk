package StrokeKalc;

import org.apache.commons.lang3.StringUtils;

public class Multiplication {

//    1-ый способ
   public static String multiplication(String a, String b) throws Exception {
//        Проверка 1 операнда на строку
        for (int i =0; i <a.length(); i++) {
            if (Character.isDigit(a.charAt(i))) {
                throw new Exception("1 операнд должен быть строкой");
            }
        }
//        Длина операнда
       if (a.length() > 10) {
           throw new Exception("операнд дложен быть не более 10 символов");
       }
//        Проверка 2 операнда на цифру
        boolean hasDigits2 = true;
        for (int i =0;i< b.length() && !hasDigits2;i++) {
            if (Character.isDigit(b.charAt(i))) {
                hasDigits2 = false;
                throw new Exception("2 операнд должен содержать цифры");
            }
        }
//        Проверка 2 операнда на 1 до 10
        int operand2 = Integer.parseInt(b);
        if (operand2 > 10 || operand2 < 1) {
            throw new Exception( " 2 операнд должен быть от 1 до 10");
        }

//      Результат умножения
        String resultat = a.repeat(operand2);
        return resultat;
    }
// 2 способ
    public static String multi(String a, String b)  throws Exception{
       String itog;
//       Проаерка 1 операнда на строку
       boolean hasDigital1 = StringUtils.isNumeric(a);
       if (hasDigital1) throw new Exception("1 операнд должен быть строкой");
//        Проверка 1 операнда на длину
       if (a.length() > 10) throw new Exception("1 операнд дложен быть не более 10 символов");
//        Проверка 2 операнда на цифру
        boolean hasDigital2 = StringUtils.isNumeric(b);
        if (hasDigital2) {
            if (Integer.parseInt(b) > 10 || Integer.parseInt(b) < 1) throw new Exception("2 операнд должен быть от 1 до 10");
//           Умножение
            itog = a.repeat(Integer.parseInt(b));
        } else throw new Exception("2 операнд должен содержать цифры");
        return itog;
    }
}
