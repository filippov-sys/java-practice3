import java.util.*;

public class main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(List.of(4, 2, 7, 2, 9, 4, 1, 7, 3, 9));
        List<Integer> uniquenumbers = new ArrayList<>();
        for (Integer num : numbers) {
            if (uniquenumbers.contains(num) == false) {
                uniquenumbers.add(num);
            }
        }
        for (Integer uniquenum : uniquenumbers) {
            int count = 0;
            for (Integer num : numbers) {
                if (num.equals(uniquenum)) {
                    count++;
                }
            }
            System.out.println(uniquenum + " встречается " + count + " раз");
        }
        int max = numbers.get(0);
        int min = numbers.get(0);

        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        System.out.println("максимальное: " + max);
        System.out.println("минимальное: " + min);

        int summa = 0;
        for (int num : numbers) {
            summa += num;
        }
        float avaragematem = summa / numbers.size();
        System.out.println("сумма: " + summa);
        System.out.println("средняя: " + avaragematem);
    }

}
