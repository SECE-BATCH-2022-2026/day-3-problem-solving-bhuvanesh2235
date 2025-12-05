import java.util.Scanner;

public class Main {

    public static int calculate(int n1, int n2, int n3) {
        if (n3 == 13) {
            return 0;
        } else if (n2 == 13) {
            return n1;
        } else if (n1 == 13) {
            return n2 + n3;
        } else {
            return n1 + n2 + n3;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();

        int result = calculate(n1, n2, n3);

        System.out.println(result);
    }
}
