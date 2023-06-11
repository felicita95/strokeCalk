package StrokeKalc;

public class Znak {
    //    ОПРЕДЕЛЕНИЕ ЗНАКА
    static String doZnak(String znak) throws Exception {
        String result     =     znak.contains("+") ? "+" :
                                znak.contains("-") ? "-" :
                                znak.contains("/") ? "/" :
                                znak.contains("*") ? "*" :
                                           null;
        if (result == null) {throw new Exception("Операция может быть только +,-,* или /");}
                                        return result;
    }

//    2 -ой способ
    static String doit(String znak) throws Exception {
        if (znak.contains("+")) return "+";
        if (znak.contains("-")) return  "-";
        if (znak.contains("/")) return "/";
        if (znak.contains("*")) return  "*";
        else throw new Exception("Операция может быть только +,-,* или /");
    }
}
