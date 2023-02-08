import java.util.HashMap;
import java.util.Map;

public class MostCommonCharacter {
    /**
     * Find the most common character in str.
     * You could use a HashMap that maps a Character key to an Int value to represent how many times a Character has
     * been spotted.
     * @param str A String.
     * @return the most common character within str.
     */
    public char recurringChar(String str) {
        Map<Character, Integer> map = new HashMap<>();
    for (char c : str.toCharArray()) {
        map.put(c, map.getOrDefault(c, 0) + 1);
    }
    int maxCount = 0;
    char maxChar = ' ';
    for (Map.Entry<Character, Integer> entry : map.entrySet()) {
        if (entry.getValue() > maxCount) {
            maxCount = entry.getValue();
            maxChar = entry.getKey();
        }
    }
    return maxChar;
}}
