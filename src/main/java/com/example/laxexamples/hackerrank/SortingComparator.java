import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class SortingComparator {

	static class Checker implements Comparator<Player> {
		public int compare(Player in1, Player in2) {
			if (in1.score == in2.score) {
			    return (in1.name.compareTo(in2.name));
			}

			return in2.score - in1.score;
		}
	}
	
	static class Player {
	    String name;
	    int score;
	    
	    Player(String name, int score){
	        this.name = name;
	        this.score = score;
	    }
	}


	    public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);
	        int n = scan.nextInt();

	        Player[] player = new Player[n];
	        Checker checker = new Checker();
	        
	        for(int i = 0; i < n; i++){
	            player[i] = new Player(scan.next(), scan.nextInt());
	        }
	        scan.close();

	        Arrays.sort(player, checker);
	        for(int i = 0; i < player.length; i++){
	            System.out.printf("%s %s\n", player[i].name, player[i].score);
	        }
	    }
	
}
