import java.util.*;

public class main {
    public static void main(String[] args) {
        String[] words = { "listen", "silent", "enlist",
                "hello", "world",
                "cat", "act", "tac" };

        Map<String, List<String>> groups = new HashMap<>();

        for (String word : words) {
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String sorted = new String(chars);

            groups.putIfAbsent(sorted, new ArrayList<>());
            groups.get(sorted).add(word);
        }

        System.out.println(groups);
    }
}
