import java.util.Scanner;

/**
 * A_Watermelon
 */
public class A_Watermelon {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int n = scanner.nextInt();
            final String yes = "YES";
            final String no = "NO";

            if(n >= 1 && n <= 100)
            {
                if (n % 2 == 0 && n != 2) {
                    mOutput(yes);
                    
                } else {
                    mOutput(no);
                }
            }
        }


    }

    private static void mOutput(String output) {
        System.out.println(output);
    }
}