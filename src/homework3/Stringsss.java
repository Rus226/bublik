package homework3;

public class Stringsss {

    //    1. Получить длину строки
    public int getLength (String s){
        return s.length();
    }

    //    2. Сравнить 2 строки без учета регистра
    public boolean getCompare (String s, String d){
        return s.equals(d);
    }

    //    3. Создать новую строку с помощью конструктора и занести ее в пул литералов
    public void newString (String s){
        String d = new String(s);
    }

    //    4. Получить из строки массив символов
    public String[] ArraysStr (String s){
        String [] ss = s.split("");
        return ss;
    }

    //    5. Получить из строки массив байтов
    public byte[] buteArr (String s){
        byte [] ss = s.getBytes();
        return ss;
    }

    //    6. Привести строку к верхнему регистру
    public String strUpper (String s){
        String ss = s.toUpperCase();
        return ss;
    }

    //    7. Найти первую позицию символа "а" в строке
    public int strFirst (String s){
        int ss = s.indexOf('a');
        return ss;
    }

    //    8. Найти последнюю позицию символа "а" в строке
    public int strLast (String s){
        int ss = s.lastIndexOf('a');
        return ss;
    }

    //    9. Проверить содержит-ли строка слово "Sun"
    public boolean strY (String s){
        boolean ss = s.contains("Sun");
        return ss;
    }

    //    10. Проверить оканчивается-ли строка на "Oracle"
    public boolean strEnd (String s){
        boolean ss = s.endsWith("Oracle");
        return ss;
    }

    //    11. Проверить начинается-ли строка на "Java"
    public boolean strStart (String s){
        boolean ss = s.startsWith("Java");
        return ss;
    }

    //    12. Заменить все символы "а" в строке на символ "о"
    public String strReplace (String s){
        String ss = s.replace("a", "o");
        return ss;
    }

    //    13. Получить подстроку с 44 символа по 90 символ
    public String strIndex (String s){
        String ss = s.substring(44, 90);
        return ss;
    }

    //    14. Разбить строку по символу пробел (т.е. чтобы каждое слово было отдельным элементом массива)
    public String[] strEach (String s){
        String [] ss = s.split(" ");
        return ss;
    }

    //    15. Поменять последовательность символов в строке на обратную.
    public String strChange (String s){
        String ss = new StringBuffer(s).reverse().toString();
        return ss;
    }
}
