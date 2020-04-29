/*1. В приложении задано параметром количество студентов. Приложение генерирует абстрактные  фамилии студентов с номером(фамилия1,фамилия2.....) и   месяцы их рождения. Приложение имеет еще 1 параметр- число от 1 до 12 .
 Задачей приложения является вывод всех фамилий студентов, которые родились в месяц, заданный параметром. Необходимо также выводить вначале список всех студентов с датами рождения. Обработайте ошибки при введении параметров.*/

import java.util.Scanner;
import java.util.regex.*;
import java.io.IOException;

class lab1 {
    public static void main(String args[]) {
        String students, months;
        int student = 0, month = 0;
        Scanner s = new Scanner(System.in);
        try {
            students = s.nextLine();
            student = Integer.parseInt(students);
        } catch (Exception e) {
            System.out.println("Неправильный формат числа.");
        }
        if (student > 0) {
            try {
                months = s.nextLine();
                month = Integer.parseInt(months);
            } catch (Exception e) {
                System.out.println("Неправильный формат числа.");
            }
            s.close();
            if (month >= 1 && month <= 12) {

                String[] StudentsList = new String[student];
                int[] MonthStud = new int[student];

                for (int k = 0; k < student; k++) {
                    StudentsList[k] = "Family" + (k + 1);
                    MonthStud[k] = (int) (Math.random() * 12) + 1;
                    System.out.println(StudentsList[k] + "   " + MonthStud[k]);
                }
                for (int k = 0; k < student; k++) {
                    if (MonthStud[k] == month)
                        System.out.println(StudentsList[k] + "   " + MonthStud[k]);
                }
            } else System.out.println("Введите число от 1 до 12.");
        }else System.out.println("Введите число от 1 и выше.");
    }
}






