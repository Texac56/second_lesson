import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первую зарпалату:\t");
        int salary1 = scanner.nextInt();

        System.out.println("зп первого сотрудника: " + salary1);

        System.out.print("Введите вторую:\t");
        int salary2 = scanner.nextInt();

        System.out.println("зп второго сотрудника: " + salary2);

        System.out.print("Введите третью:\t");
        int salary3 = scanner.nextInt();

        System.out.println("зп третьего: " + salary3);

        int maxSalary, minSalary;
        if (salary1 > salary2) {
            maxSalary = salary1;
        } else {
            maxSalary = salary2;
        }
        if (salary3 > maxSalary) {
            maxSalary = salary3;
        }

        System.out.println("Максимальная зарплата: " + maxSalary);

        if (salary1 < salary2) {
            minSalary = salary1;
        } else {
            minSalary = salary2;
        }
        if (salary3 < minSalary) {
            minSalary = salary3;
        }

        System.out.println("Минимальная зарплата: " + minSalary);

        int result = maxSalary - minSalary;
        System.out.println("Разница между зп: " + result);
    }
}