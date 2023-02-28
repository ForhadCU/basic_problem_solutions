import java.util.Scanner;

public class A_Boy_or_Girl {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            // input string
            String username = scanner.nextLine();
            // to lowercase
            username = username.toLowerCase();

            String s1 = "";
            String s2 = "";
            // username doesn't contain more than 100 chars
            if (username.length() <= 100) {
                for (int i = 0; i < username.length(); i++) {

                    for (int j = i + 1; j < username.length(); j++) {
                        if (username.charAt(i) != username.charAt(j)) {
                            s1 = s1 + username.charAt(j);
                        }
                    }

                    s2 = s2 + username.charAt(i);

                    username = s1;
                    s1 = "";
                    i = -1;

                }
                if (s2.length() % 2 == 0) {
                    System.out.println("CHAT WITH HER!");
                } else {
                    System.out.println("IGNORE HIM!");
                }

            }
        }
    }
}