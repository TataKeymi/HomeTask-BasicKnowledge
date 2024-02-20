import java.util.HashMap;
import java.util.Map;

public class Task2 {
    public static char firstNonRepeatingLetter(String str) {
        Map<Character, Integer> charFrequency = new HashMap<>();

        for (char c : str.toLowerCase().toCharArray()) {
            charFrequency.put(c, charFrequency.getOrDefault(c, 0) + 1);
        }
        int i = 0;
        for (char c : str.toLowerCase().toCharArray()) {
            if (charFrequency.get(c) == 1) {
                return str.toCharArray()[i];
            }
            i++;
        }
        return '\0';
    }
}
