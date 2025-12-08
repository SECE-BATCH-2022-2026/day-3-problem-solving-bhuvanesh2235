import java.util.Scanner;

class UserMainCode {
    public static String repeatPrint(String str, int n) {
        String front;

        if (str.length() < 3) {
            front = str;              
        } else {
            front = str.substring(0, 3);  
        }

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < n; i++) {
            result.append(front);     
        }

        return result.toString();
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();        
        int n = Integer.parseInt(sc.nextLine().trim());  
        String output = UserMainCode.repeatPrint(s, n);

        System.out.println(output);
    }
}
