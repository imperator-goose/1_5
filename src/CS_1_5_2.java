import java.util.Scanner;

public class CS_1_5_2 {
    static Scanner scanner;
    public static int dnk(String dnk) {
        int maxRepetition = 1;
        int currentRepetition = 1;

        for (int i = 1; i < dnk.length(); i++) {
            if (dnk.charAt(i) == dnk.charAt(i - 1)) {
                currentRepetition++;
                maxRepetition = currentRepetition;
            } else {
                currentRepetition = 1;
            }
        }
        return maxRepetition;
    }

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        System.out.println("Введите dnk");
        String dnk = scanner.next();
        System.out.println(dnk(dnk));
    }
}
