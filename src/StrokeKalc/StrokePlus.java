package StrokeKalc;

import java.util.Scanner;



public class StrokePlus {
    public static void main(String[] args) throws Exception {
        Scanner skan = new Scanner(System.in);
        System.out.println("Введите слова и их выражение:");
        String expression = skan.nextLine();
        String itog = result(expression);
//        Проверяем длину результата
        if (itog.length() > 40) {
            String cut = itog.substring(0,39) + "...";
            System.out.println("\"" + cut + "\"");
        } else System.out.println("\"" + itog + "\"");
        skan.close();
    }


// ОСНОВА
    static String result(String expression) throws Exception {
        String [] operands = expression.split("[+\\-/*]");
        String znak = Znak.doZnak(expression);
        if (!expression.contains(znak)) {
            throw new Exception("Операция должна содержать +,-,* или /");
        }
        String oper1 = operands[0];
        String oper2 = operands[1];
        String itog = "";
        switch (znak) {
            case "*" -> itog = Multiplication.multi(oper1,oper2);
            case "-" -> itog = Minus.minusi(oper1,oper2);
            case "/" -> itog = Divide.numeros(oper1,oper2);
            case "+" -> itog = Sum.plusani(oper1,oper2);
        }
        return itog;
    }
}





