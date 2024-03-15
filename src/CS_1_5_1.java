import java.util.Scanner;

public class CS_1_5_1 {
    static Scanner scanner;

    public static int calculate(int n, int[] range){
        int sum = n * (n + 1) / 2;
        for (int num : range) {
            sum -= num;
        }
        return sum;
    }

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        System.out.println("Введите число n");
        int n = scanner.nextInt();

        int[] range = new int[n-1];

        for (int i = 0;i<range.length;i++){
            System.out.println("Введите значение для индекса " + i);
            range[i] = scanner.nextInt();
            if (range[i]>n){
                System.out.println("Число которое вы ввели больше чем n");
                i--;
            }
        }

        int number = calculate(n, range);
        System.out.println(number);


    }

}