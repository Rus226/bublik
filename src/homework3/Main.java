package homework3;

public class Main {

    public static void main(String[] args) {
        Gap gap = new Gap();
        System.out.println(gap.format(34.52452));

        Point point = new Point();
        System.out.println(point.format(34.52452));

        Comma comma = new Comma();
        System.out.println(comma.format(34.52452));
    }
}
