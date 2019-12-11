import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();
        Human[] humans = new Human[10];
        for (int i = 0; i < humans.length; i++){

            int age = random.nextInt(50);

            char[] chars = new char[50];
            for (int j = 0; j<50; j++){
                chars[i] = (char)random.nextInt(150);
            }

            Human human = new Human(new String(chars), age);
            humans[i] = human;

            System.out.println(humans[2].getName());
           // System.out.println(humans[1].getAge);
        }






     //   Human human1 = new Human("vasek", 4, 4,5);
     //   human1.getName();

     //   Human[] humans = new Human[10];

       // for(int i = 0; i <= humans.length; i++);












        int p = 0;
        int z = 1;
        int q;

        for (int i = 0; i < 10; i++) {

            q = p + z;

            p = z;
            z = q;
            System.out.println(q);
        }

        int ty = 1;
        int ry = 0;
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Братишка, от какого числа факториал ты хочешь?");
        int index = scanner2.nextInt();
        for (int i = 1; i < index + 1; i++) {

            ry = ty * i;
            ty = ry;


            // if (i == index) {
            //     System.out.println("Лови, это факториал от " + index + " - " + ry);
            // }

        }
        System.out.println(ry);

        //  int x = new Random().nextInt(10);
        //if (x > 5) {
        //  System.out.println("x > 5");
        //     }
        //   if (x < 5) {
        //       System.out.println("x < 5");
        //  }
        // if (x == 10) {
        //    System.out.println("x == 10");
        // }
        //if (x >= 5) {
        //    System.out.println("x >= 5");
        // }
        // if (x <= 5) {
        //     System.out.println("x <= 5");
        //  }
        // if (x > 3 && x < 6) {
        //     System.out.println("x > 3 && x < 6");
        // } else {
        //     System.out.println("AND wrong!");
        // }
        // if (x < 3 || x > 6) {
        //    System.out.println("x < 3 || x > 6");
        // } else {
        //       System.out.println("OR wrong");
        //    }


        Scanner scanner = new Scanner(System.in);
        while (true) {
            String Login = "ronda";
            String password = "gora";


            System.out.println("Введите логин:");
            String a = scanner.nextLine();
            System.out.println("Введите пароль:");
            String b = scanner.nextLine();

            if (a.equals(Login) && b.equals(password)) {
                System.out.println("Ты чемпион!");
                break;
            } else {
                System.out.println("Ты где то промахнулся, попробуй еще разок");
            }


        }


        System.out.println("Введи любое число до 10 для таблицы умножения");
        int m = scanner.nextInt();
        int[][] ret = new int[m][m];

        for (int i = 1; i <= ret.length; i++) {
            for (int j = 1; j <= ret[i - 1].length; j++) {
                System.out.print(i * j + " ");
            }
            System.out.println();

        }


    }
}

