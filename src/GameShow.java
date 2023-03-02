import java.util.Random;

/**
 *
 * Monty Hall Program - Tyler Smith
 *
 */
/**
 * Problem Answer:
 * a)
 * P(G) = 1/3, P(D1) = 1/3, P(D2) = 1/3
 * so the probability that the contestant picks the door with the prize is 1/3 or 33.3%
 *
 * b)
 * 	i. The probability that the contestant wins the good prize if she stays with her initial choice is 1/3 or 33.3%
 *  ii. If the contestant originally chose the good prize but switched doors, the result will be she would ultimately select a dud. Making the probability she wins 0.
 *  iii. If the contestant originally chose a dud, and switched her door, the result will be that she won the good prize. Making the probability that she wins 1.
 *  iv. If the contestant switches her initial choice after being showed a dud, the probability sshe wins the good prize is 2/3, or 66.7%
 *	v. Switching doors would maximize the contestant's probability of winning the good prize.
 */

public class GameShow {
    private Random random;

    public GameShow(){
        this.random = new Random();
    }

    // Play a single game of the Game Show
    public boolean montyHall(boolean changeDoor) {
        int goodPrize = random.nextInt(3) + 1;
        int initialChoice = random.nextInt(3) + 1;
        int openedDoor = 0;

        // Determine which door to open
        if (initialChoice == goodPrize) {
            int remainingDoor = random.nextInt(2) + 1;
            if (remainingDoor == 1) {
                openedDoor = 2;
            } else {
                openedDoor = 1;
            }
        } else if (goodPrize == 1) {
            openedDoor = (initialChoice == 2) ? 3 : 2;
        } else if (goodPrize == 1) {
            openedDoor = (initialChoice == 3) ? 2 : 1;
        } else if (goodPrize == 2) {
            openedDoor = (initialChoice == 1) ? 3 : 1;
        } else if (goodPrize == 2) {
            openedDoor = (initialChoice == 3) ? 2 : 3;
        } else if (goodPrize == 3) {
            openedDoor = (initialChoice == 2) ? 1 : 3;
        }  else if (goodPrize == 3) {
            openedDoor = (initialChoice == 1) ? 2 : 1;
        }  else {
            openedDoor = (initialChoice == 1) ? 2 : 1;
        }


        // Change the player's choice if changeDoor is true
        if (changeDoor) {
            initialChoice = 6 - initialChoice - openedDoor;
        }

        return initialChoice == goodPrize;
    }

    // Run a simulation of the Game Show
    public double runSimulation(boolean changeDoor, int numGames) {
        int winCount = 0;
        for (int i = 0; i < numGames; i++) {
            if (montyHall(changeDoor)) {
                winCount++;
            }
        }
        return (double) winCount / numGames;
    }

    public static void main(String[] args) {
        GameShow gameShow = new GameShow();
        double noChangeWinRate = gameShow.runSimulation(false, 10000);
        double changeWinRate = gameShow.runSimulation(true, 10000);
        System.out.println("Win rate when not changing doors: " + noChangeWinRate + " or roughly 33%" + "\nWin rate when not changing doors: " + changeWinRate + " or roughly 66%");

    }
}