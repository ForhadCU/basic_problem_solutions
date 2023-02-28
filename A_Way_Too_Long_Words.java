import java.util.Scanner;

/**
 * A_Way_Too_Long_Words
 */
public class A_Way_Too_Long_Words {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*
         * int a = 'a';
         * int z = 'z';
         * int A = 'A';
         * int Z = 'Z';
         * boolean isValid;
         */
        String[] strings = new String[scanner.nextInt()];

        // c: consuming the <enter> from input above
        scanner.nextLine();

        if (strings.length >= 1 && strings.length <= 100) {
            for (int i = 0; i < strings.length; i++) {
                String s = scanner.nextLine();
                // System.out.println(s+" "+i);
                strings[i] = s.toLowerCase();

            }

            for (int i = 0; i < strings.length; i++) {

                if (strings[i].length() <= 100 && strings[i].length() >= 1) {
                    if (strings[i].length() > 10) {
                        System.out.println(strings[i].charAt(0) + "" + (strings[i].length() - 2) + ""
                                + strings[i].charAt(strings[i].length() - 1));
                    } else
                        System.out.println(strings[i]);
                    /*
                     * isValid = true;
                     * for (int j = 0; j < strings[i].length(); j++) {
                     * if ((strings[i].charAt(j) >= A && strings[i].charAt(j) <= Z)
                     * || (strings[i].charAt(j) >= a && strings[i].charAt(j) <= z)) {
                     * continue;
                     * } else {
                     * isValid = false;
                     * break;
                     * }
                     * }
                     * if (isValid) {
                     * if (strings[i].length() > 10) {
                     * System.out.println(strings[i].charAt(0) + "" + (strings[i].length() - 2) + ""
                     * + strings[i].charAt(strings[i].length() - 1));
                     * } else
                     * System.out.println(strings[i]);
                     * }
                     */

                }

            }
        }
    }
}
