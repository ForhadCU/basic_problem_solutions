import java.util.ArrayList;
import java.util.Scanner;

/**
 * A_Next_Round
 */
public class A_Next_Round {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numOfParticipant;
        int postion;
        ArrayList<Integer> participantsScores = new ArrayList<>();
        int totalOfScores;

        // input
        numOfParticipant = scanner.nextInt();
        postion = scanner.nextInt();

        // check pre-condition
        if (1 <= postion && postion <= numOfParticipant && numOfParticipant <= 50) {
            totalOfScores = 0;
            for (int index = 0; index < numOfParticipant; index++) {
                // input scores
                int temp = scanner.nextInt();
                if (temp >= 0 && temp <= 100) {

                    // score added to list
                    participantsScores.add(temp);
                    totalOfScores += temp;
                } else {

                    // if score does not match with condition
                    index--;
                }
            }

            if (totalOfScores > 0) {
                // get k-th place finisher's score
                int selectedScore = participantsScores.get(postion-1);
                // num of participants who can go to next round
                int numOfNextRoundParticipant = 0;

                for (int score : participantsScores) {
                    if (selectedScore > 0) {
                        if (score >= selectedScore) {
                            numOfNextRoundParticipant++;
                        }
                    } else{

                        // if k-th place score is 0, will count only greater than zero
                        if (score > selectedScore) {
                            numOfNextRoundParticipant++;
                        }
                    }
                    
                }

                // output
                System.out.println(numOfNextRoundParticipant);
            } else {

                // if all scores are 0 then output will be zero
                // output
                System.out.println(0);
            }

        }
    }
}