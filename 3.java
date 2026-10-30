import java.util.*;

public class main {


    public static Map<String, Integer> countWords(String[] words) {
        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < words.length; i++) {
            String word = words[i];

            if (map.containsKey(word)) {
                int old = map.get(word);
                map.put(word, old + 1);
            } else {
                map.put(word, 1);
            }
        }

        return map;
    }

    public static void sortByCount(List<Map.Entry<String, Integer>> entries) {
        for (int i = 0; i < entries.size(); i++) {
            for (int j = 0; j < entries.size() - 1 - i; j++) {
                int left = entries.get(j).getValue();
                int right = entries.get(j + 1).getValue();

                if (left < right) {
                    Map.Entry<String, Integer> temp = entries.get(j);
                    entries.set(j, entries.get(j + 1));
                    entries.set(j + 1, temp);
                }
            }
        }
    }

    public static List<String> getTopWords(List<Map.Entry<String, Integer>> entries, int n) {
        List<String> result = new ArrayList<>();

        for (int i = 0; i < n && i < entries.size(); i++) {
            String word = entries.get(i).getKey();
            result.add(word);
        }

        return result;
    }

    public static void main(String[] args) {
        String text = "java is great java is powerful " + "python is great too but java is java";
        int N = 3;
        String[] words = text.split(" ");

        Map<String, Integer> map = countWords(words);

        List<Map.Entry<String, Integer>> entries = new ArrayList<>(map.entrySet());
        sortByCount(entries);

        List<String> result = getTopWords(entries, N);

        System.out.println(result);
    }
}
