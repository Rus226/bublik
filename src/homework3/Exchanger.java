package homework3;

public class Exchanger {

    private String delimiter;

    public Exchanger(String delimiter){
        this.delimiter = delimiter;
    }

    public String format(double value){
        int intPart = (int) value;
        String newS = Double.toString((value - intPart));
        String newValue = newS.substring(2);
        String format = intPart + delimiter + newValue;
        return format;
    }
}
