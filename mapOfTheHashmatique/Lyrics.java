import java.util.Map;
import java.util.HashMap;

/**
 * Lyrics
 */
public class Lyrics {

    public static void main(String[] args) {
        Map<String, String> lyrics = new HashMap<>();
        lyrics.put("Karma Police", 
            "Karma police, arrest this man\n" + 
            "He talks in maths, he buzzes like a fridge\n" +
            "He's like a detuned radio\n" +
            "Karma police, arrest this girl\n" +
            "Her Hitler hairdo is making me feel ill\n" +
            "And we have crashed her party\n"
        );

        lyrics.put("No Surprises", 
            "A heart that's full up like a landfill\n" +
            "A job that slowly kills you\n" +
            "Bruises that won't heal\n"
        );

        lyrics.put("Paranoid Android",
            "Please could you stop the noise, I'm trying to get some rest\n" +
            "From all the unborn chicken voices in my head\n" +
            "What's that...? (I may be paranoid, but not an android)\n" +
            "What's that...? (I may be paranoid, but not an android)\n"
        );

        lyrics.put("Creep",
            "When you were here before\n" +
            "Couldn't look you in the eye\n" +
            "You're just like an angel\n" +
            "Your skin makes me cry\n" +
            "You float like a feather\n" +
            "In a beautiful world\n" +
            "I wish I was special\n" +
            "You're so fucking special\n"
        );

        System.out.println(lyrics.get("Karma Police"));

        for (String title : lyrics.keySet()) {
            System.out.println(title + " : " + lyrics.get(title));
        }
    }
    
}