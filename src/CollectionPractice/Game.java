package CollectionPractice;
import java.util.LinkedList;
import java.util.Queue;
public class Game {
	public static void main(String[] args) {
        Queue<String> playersQueue = new LinkedList<String>();        
        playersQueue.add("Arun");
        playersQueue.add("Sudhir");
        playersQueue.add("Abhishek"); // Add players to the queue
        playersQueue.add("Sandeep");
        playersQueue.add("Rishav");
        playersQueue.add("Ankit");

        // Set the number of iterations before stopping the music
        int musicIterations = 3;

        while (playersQueue.size() > 1) {
            // Simulate passing the potato
            for (int i = 0; i < musicIterations - 1; i++) {
                String currentPlayer = playersQueue.poll();
                playersQueue.add(currentPlayer);
            }

            // Music stops, eliminate the player holding the potato
            String eliminatedPlayer = playersQueue.poll();
            System.out.println("Player eliminated: " + eliminatedPlayer);
        }

        // Display the winner
        System.out.println("Winner: " + playersQueue.poll());
    }
}
/*
  Output :Player eliminated: Abhishek
		  Player eliminated: Ankit
		  Player eliminated: Sandeep
		  Player eliminated: Sudhir
		  Player eliminated: Rishav
		  Winner: Arun

 */
