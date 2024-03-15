import java.util.Scanner;

public class CS_1_5_2 {
    static Scanner scanner;
    public static int dnk(String dnk) {
        int max = 1;
        int current = 1;

        for (int i = 1; i < dnk.length(); i++) {
            if (dnk.charAt(i) == dnk.charAt(i - 1)) {
                current++;
                max = current;
            } else {
                current = 1;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        System.out.println("Введите dnk");
        String dnk = scanner.next();
        System.out.println(dnk(dnk));
    }
}
