import java.util.*;
import javax.sound.midi.SysexMessage;

public class Lab03_5
{
    public static void main(String[] args)
    {
        System.out.print("522H0077-Tong Nguyen Gia Huy\n");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a chain:");
        String paragraph = sc.nextLine();

        System.out.println("Count num in chain:");
        countword(paragraph);
    }

    public static void countword(String paragraph)
    {
        String cleanStr = paragraph.toLowerCase().replaceAll("[,.!?;:()+-_*/<>=]", "");
        String[] words = cleanStr.split(" ");

        HashMap<String, Integer> wordCount = new HashMap<>();

        for(String word: words)
        {
            if(wordCount.containsKey(word))                                 
                wordCount.put(word, wordCount.get(word) + 1);                                                     
            
            else    
            {
                wordCount.put(word, 1);                                 
            }
        }
        for(String word : wordCount.keySet())                               
        {
            System.out.println(word + ": " + wordCount.get(word));
        }
    }
}