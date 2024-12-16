import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StepTracker stepTracker = new StepTracker(scanner);

        while (true) {
            printMenu();
            int cmd = scanner.nextInt();
            if (cmd == 1) {
                stepTracker.addNewNumberStepsPerDay();

            } else if (cmd == 2) {
                stepTracker.changeStepGoal();

            } else if (cmd == 3) {
                stepTracker.printStatistic();

            } else if (cmd == 4) {
                System.out.println("Программа завершена.");
                return;
            } else {
                System.out.println("Такой команды нет.");
            }

            System.out.println();
            System.out.println("-".repeat(20));
            System.out.println();

        }
    }
         static void printMenu(){
             System.out.println("Что Вы хотите сделать?");
             System.out.println("1. Ввести количество шагов за определённый день");
             System.out.println("2. Изменить цель по количеству шагов в день");
             System.out.println("3. Напечатать статистику за определённый месяц");
             System.out.println("4. Выйти из приложения");
        }
    }
