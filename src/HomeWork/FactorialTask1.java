package HomeWork;

import java.util.Scanner;

public class FactorialTask1 {
    public static void main(String[] args) {
        int num1 = 1;
        int numFactorial = 0;
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Братишка, от какого числа факториал ты хочешь?");
        int index = scanner2.nextInt();
        for (int i = 1; i < index + 1; i++) {

            numFactorial = num1 * i;
            num1 = numFactorial;


        }
        System.out.println("Лови, это факториал от " + index + " - " + numFactorial);
    }
}
