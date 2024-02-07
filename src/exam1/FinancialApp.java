package exam1;
import java.math.BigDecimal;
import java.util.Scanner;

public class FinancialApp {
    private static final BigDecimal[] expenses = new BigDecimal[31];
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("Меню:");
            System.out.println("------------------------------------------");
            System.out.println("1 – Ввести расходы за определенный день");
            System.out.println("------------------------------------------");
            System.out.println("2 – Траты за месяц");
            System.out.println("------------------------------------------");
            System.out.println("3 – Самая большая сумма расхода за месяц");
            System.out.println("------------------------------------------");
            System.out.println("4 – Конвертер валюты");
            System.out.println("------------------------------------------");
            System.out.println("0 – Выход");
            System.out.println("------------------------------------------");
            System.out.print("Выберите пункт меню: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    enterExpenses();
                    break;
                case 2:
                    ExpensesMoth();
                    break;
                case 3:
                    MaxExpense();
                    break;
                case 4:
                    Converter();
                    break;
                case 0:
                    System.out.println("Прощайте!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Неверный выбор. Попробуйте снова.");
            }
        } while (choice != 0);
    }

    private static void enterExpenses() {
        System.out.print("Введите номер дня (от 1 до 30): ");
        int day = scanner.nextInt();
        System.out.print("Введите сумму трат: ");
        BigDecimal amount = scanner.nextBigDecimal();

        if (expenses[day] != null) {
            System.out.print("На этот день уже есть запись. Перезаписать? (1 – да, 0 – нет): ");
            int overwriteChoice = scanner.nextInt();
            if (overwriteChoice == 1) {
                expenses[day] = amount;
            }
        } else {
            expenses[day] = amount;
        }
    }

    private static void ExpensesMoth() {
        System.out.println("Траты за месяц:");
        for (int i = 1; i < expenses.length; i++) {
            if (expenses[i] != null) {
                System.out.println(i + " день – " + expenses[i] + " руб");
            }
        }
    }

    private static void MaxExpense() {
        int maxDay = -1;
        BigDecimal maxExpense = BigDecimal.ZERO;

        for (int i = 1; i < expenses.length; i++) {
            if (expenses[i] != null && expenses[i].compareTo(maxExpense) > 0) {
                maxDay = i;
                maxExpense = expenses[i];
            }
        }

        System.out.println("Самая большая сумма расхода за месяц:");
        System.out.println(maxDay + " день – " + maxExpense + " руб");
    }

    private static void Converter() {
        BigDecimal totalExpenses = BigDecimal.ZERO;
        for (int i = 1; i < expenses.length; i++) {
            if (expenses[i] != null) {
                totalExpenses = totalExpenses.add(expenses[i]);
            }
        }

        System.out.println("Конвертер валюты:");
        System.out.println("Все затраты за месяц:");
        System.out.println("В евро: " + totalExpenses.multiply(new BigDecimal("0.012")) + " EUR");
        System.out.println("В доллары: " + totalExpenses.multiply(new BigDecimal("0.014")) + " USD");
        System.out.println("В юани: " + totalExpenses.multiply(new BigDecimal("0.089")) + " CNY");
    }
}