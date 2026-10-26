import java.util.*;

public class main {
    public static void main(String[] args) {
        String text = "java is great java is powerful " + "python is great too but java is java";
        int N = 3;
        String[] words = text.split(" ");
        Map<String, Integer> map = new HashMap<>();
        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        List<Map.Entry<String, Integer>> entries = new ArrayList<>(map.entrySet());
        entries.sort((a, b) -> b.getValue() - a.getValue());
        List<String> result = new ArrayList<>();
        for (int i = 0; i < N && i < entries.size(); i++) {
            result.add(entries.get(i).getKey());
        }

        System.out.println(result);

    }
}
