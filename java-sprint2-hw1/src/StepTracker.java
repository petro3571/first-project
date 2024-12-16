import java.util.Scanner;
public class StepTracker {
    int goalByStepsPerDay = 10000;
    MonthData[] monthToData = new MonthData[12];
    MonthData monthData = new MonthData();
    Converter converter = new Converter();
    Scanner scanner;

    StepTracker(Scanner scan) {
        scanner = scan;

        for (int i = 0; i < monthToData.length; i++) {
            monthToData[i] = new MonthData();
        }
    }

    void addNewNumberStepsPerDay() {
        System.out.print("Введите номер месяца: ");
        int month = scanner.nextInt();
        if (month < 1 || month > 12) {
            System.out.println("Номер месяца должен быть от 1 до 12 включительно. Вы ввели " + month);
            return;
        }

        System.out.print("Введите номер дня: ");
        int day = scanner.nextInt();
        if (day < 1 || day > 30) {
            System.out.println("Номер дня должен быть от 1 до 30 включительно. Вы ввели " + day);
            return;
        }

        System.out.print("Введите колличество шагов: ");
        int steps = scanner.nextInt();
        if (steps <= 0) {
            System.out.println("Количество шагов должно быть положительным числом");
            return;
        }

        monthData = monthToData[month - 1];
        monthData.days[day - 1] = steps;
    }

    void changeStepGoal() {
        System.out.print("Введите новую цель: ");
        int newStepGoal = scanner.nextInt();
        if (newStepGoal <= 0) {
            System.out.println("Цель не может быть меньше или равно нулю. Вы ввели: " + newStepGoal);
            return;
        }
        goalByStepsPerDay = newStepGoal;
        System.out.println("Новая цель: " + goalByStepsPerDay);
    }

    void printStatistic() {
        System.out.print("Введите номер месяца: ");
        int month = scanner.nextInt();
        if (month < 1 || month > 12) {
            System.out.println("Номер месяца должен быть от 1 до 12 включительно. Вы ввели " + month);
            return;
        }

        monthData = monthToData[month - 1];
        int sumSteps = monthData.sumStepsFromMonth();
        System.out.println("Общая статистика по дням");
        monthData.printDaysAndStepsFromMonth();
        System.out.println("Сумма шагов за месяца: " + sumSteps);
        System.out.println("Максимальное количество пройденных шагов за месяц: " + monthData.maxSteps());
        System.out.println("Среднее количество пройденных шагов за месяц: " + (sumSteps / monthData.days.length));
        System.out.println("Пройденная дистанция (в км): " + converter.convertToKm(sumSteps));
        System.out.println("Количество сожженых килокалорий за месяц: "
                + converter.convertStepsToKilocalories(sumSteps));
        System.out.println("Лучшая серия: " + monthData.bestSeries(goalByStepsPerDay));

    }
}

