package myprograms1;
import java.util.*;

public class QueueAndStack {
	
	Stack<Character> s=new Stack<>();
    Queue<Character> q=new LinkedList<>();

    void pushCharacter(char ch) {
        s.push(ch);
    }
    void enqueueCharacter(char ch) {
        q.add(ch);
    }
    char popCharacter() {
        return s.pop();
    }
    char dequeueCharacter() {
        return q.remove();
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String input = in.nextLine();
        // Convert input String to an array of characters:
        char[] s = input.toCharArray();
        QueueAndStack p = new QueueAndStack();

        for (char c : s) {
            p.pushCharacter(c);
            p.enqueueCharacter(c);
        }

        // Pop/Dequeue the chars at the head of both data structures and compare them:
        boolean isPalindrome = true;
        for (int i = 0; i < s.length/2; i++) {
            if (p.popCharacter() != p.dequeueCharacter()) {
                isPalindrome = false;                
                break;
            }
        }
        System.out.println( "The word " + input + " is " + ( (!isPalindrome) ? "not a palindrome." : "a palindrome." ) );
        in.close();
    }
}
