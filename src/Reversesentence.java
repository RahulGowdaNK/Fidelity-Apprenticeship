import java.sql.SQLOutput;
import java.util.Scanner;

public class Reversesentence {
    public static String ReverseSentence(String sentence){
        String[] words = sentence.split(" ");
        StringBuilder reversedsentence  = new StringBuilder();

        for (int i = words.length-1; i >=0 ; i--) {
            reversedsentence.append(words[i]);
            if(i!=0){
                reversedsentence.append(" ");
            }

        }
        return reversedsentence.toString();

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Straing:");
        String sentence = sc.nextLine();

        String reversed = ReverseSentence(sentence);
        System.out.println(" Reversed Sentence:");
        System.out.println(reversed);
    }
}
