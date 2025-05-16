
package sentencereverser;

import java.util.*;

public class SentenceReverser {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        Stack<String> reversed = new Stack<>();
        
        System.out.print("Enter a sentence to reversed: ");
        String sentence = scanner.nextLine();
        String[] sentenceArray = sentence.split(" ");
        
        for (String str : sentenceArray) {
            
            reversed.push(str);
            
        }
        
        System.out.print("Sentence reversed: ");
        while (!reversed.isEmpty()) {
            
            System.out.print(reversed.pop() + " ");
            
        }
        
    }
    
}
