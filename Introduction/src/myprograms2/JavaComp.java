package myprograms2;
import java.util.*;
class Checker implements Comparator<Player>{
    public int compare(Player a,Player b){
        if(a.score==b.score){
            return a.name.compareTo(b.name);
        } else{
            return a.score>b.score?-1:1;
        }
    }
} 
class Player{
    String name;
    int score;
    
    Player(String name, int score){
        this.name = name;
        this.score = score;
    }
}
public class JavaComp {
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number of textcases: ");
        int n = scan.nextInt();

        Player[] player = new Player[n];
        Checker checker = new Checker();
        
        for(int i = 0; i < n; i++){
        	System.out.print("Enter Player name and Score: ");
            player[i] = new Player(scan.next(), scan.nextInt());
        }
        Arrays.sort(player,checker);
        for(int i = 0; i < player.length; i++){
            System.out.printf("%s %s\n", player[i].name, player[i].score);
        }
        scan.close();
    }
}
