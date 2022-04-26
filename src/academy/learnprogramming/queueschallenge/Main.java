package academy.learnprogramming.queueschallenge;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {

        // should return true
        System.out.println(checkForPalindrome("abccba"));
        // should return true
        System.out.println(checkForPalindrome("Was it a car or a cat I saw?"));
        // should return true
        System.out.println(checkForPalindrome("I did, did I?"));
        // should return false
        System.out.println(checkForPalindrome("hello"));
        // should return true
        System.out.println(checkForPalindrome("Don't nod"));
    }

    public static boolean checkForPalindrome(String string) {
        string = string.toLowerCase();
        string = string.replaceAll("[^a-zA-Z0-9]", "");
        Stack<Character> stack = new Stack<Character>();
        Queue<Character> queue = new LinkedList<Character>();
        for(int i = 0; i < string.length(); i++) {
            stack.push(string.charAt(i));
            queue.add(string.charAt(i));
        }
        /* stack pop thing */
        for (int i = 0; i < string.length(); i++) {
            Character c = stack.pop();
            Character c2 = queue.remove();
            if (c != c2) {
                return false;
            }
        }
        return true;
    }
}
