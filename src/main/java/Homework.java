import java.util.Scanner;

class Homework {
    public static void main(String[] args) {
    Task1();
    }


    public static void Task1() {
//        �������� ��������� ���������� n-��� ������������ �����.
        Scanner inputScanner = new Scanner(System.in);
        System.out.printf("������� n: ");

        //    �������� �� ������������ ����������� ����

        boolean flag = inputScanner.hasNextInt();
        System.out.println(flag);
        int n = inputScanner.nextInt();
        System.out.println(n);

//        ��������� ���������
        double t = 1d/2*n*(n+1);

        System.out.printf("��������� %f", t);
    }
}
