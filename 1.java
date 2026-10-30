


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static void main() {
        List<String> tasks = new ArrayList<>();

        while (true) {

            System.out.println("---------------------- \n" +
                    "1 - Добавить задачу \n" +
                    "2 - Удалить первую задачу \n" +
                    "3 - Удалить задачу по номеру \n" +
                    "4 - Показать все задачи \n" +
                    "5 - Выход \n" +
                    "---------------------- ");
            System.out.println("Список:" + tasks);
            Scanner scanner = new Scanner(System.in);
            int UserChoice = scanner.nextInt();

            switch (UserChoice) {
                case 1:
                    scanner.nextLine();
                    System.out.println("Введите задачу");
                    String userTask = scanner.nextLine();
                    tasks.add(userTask);
                    break;
                case 2:
                    if (tasks.isEmpty()) {
                        System.out.println("список пуст");
                    } else {
                        tasks.removeFirst();
                    }
                    break;
                case 3:
                    scanner.nextLine();
                    System.out.println("Введите номер задачи для удаления");
                    int userNumber = scanner.nextInt();
                    if (userNumber < 1 || userNumber > tasks.size()){
                        System.out.println("Неверный номер");
                    }
                    else{
                        tasks.remove(userNumber-1);
                    }
                    break;
                case 4:
                    for(int i = 0; i <= tasks.size()-1; i++){
                        String task = tasks.get(i);
                        System.out.println(i+1 + " - " + task);
                    }
                    break;
                case 5:
                    System.exit(0);


            }
        }

    }

}
