import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.security.Principal;
import java.util.List;
import java.util.Scanner;

/**
 * A_Team
 */
public class A_Team {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int count = 0;
        while (n-- > 0) {
            int p = scanner.nextInt();
            int v = scanner.nextInt();
            int t = scanner.nextInt();

            if ((p + v + t) >= 2) {
                count++;
            }
        }
        System.out.println(count);

    }
}