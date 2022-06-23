import java.util.Scanner;

class Homework {
    public static void main(String[] args) {
//    Task1();
//        System.out.println( sumDigits(1234));
    Task2();
    }



    public static void Task1() {
//        Написать программу вычисления n-ого треугольного числа.
        Scanner inputScanner = new Scanner(System.in);
        System.out.printf("Введите n: ");

        //    Проверка на соответствие получаемого типа

        boolean flag = inputScanner.hasNextInt();
        System.out.println(flag);
        int n = inputScanner.nextInt();
        System.out.println(n);

//        Вычисляем результат
        int t = (int)(1d/2*n*(n+1));


        System.out.printf("Результат %d", t);
    }

    public static void Task2() {
//        Написать программу возрващающее число, которе без остатка делится на сумма цифр этого числа.

        for (int i = 50; i <= 100; i++) {

            if (i % sumDigits(i) == 0) System.out.println(i);

        }


    }
//    Метод находит сумму цифр числа с помощью рекурсии
    public static int sumDigits(int num){
        if (num==0) return 0;
        int sum = num%10 + sumDigits(num/10);
        return sum;


    }

}
