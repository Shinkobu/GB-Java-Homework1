import java.util.Scanner;

class Homework {
    public static void main(String[] args) {
    Task1();
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
        double t = 1d/2*n*(n+1);

        System.out.printf("Результат %f", t);
    }
}
