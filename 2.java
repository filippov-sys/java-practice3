import java.util.*;

public class main {

    public static String sortLetters(String word) {
        char[] letters = word.toCharArray();

        for (int i = 0; i < letters.length; i++) {
            for (int j = 0; j < letters.length - 1 - i; j++) {
                if (letters[j] > letters[j + 1]) {
                    char temp = letters[j];
                    letters[j] = letters[j + 1];
                    letters[j + 1] = temp;
                }
            }
        }

        String result = new String(letters);
        return result;
    }

    public static Map<String, List<String>> makeGroups(String[] words) {
        Map<String, List<String>> groups = new HashMap<>();

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            String key = sortLetters(word);

            if (!groups.containsKey(key)) {
                List<String> newList = new ArrayList<>();
                groups.put(key, newList);
     
            List<String> list = groups.get(key);
            list.add(word);
        }

        return groups;
    }

    public static void main(String[] args) {
        String[] words = { "listen", "silent", "enlist",
                "hello", "world",
                "cat", "act", "tac" };

        Map<String, List<String>> groups = makeGroups(words);

        System.out.println(groups);
    }
}
