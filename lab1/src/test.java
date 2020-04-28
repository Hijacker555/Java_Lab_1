/*1. В приложении задано параметром количество студентов. Приложение генерирует абстрактные  фамилии студентов с номером(фамилия1,фамилия2.....) и   месяцы их рождения. Приложение имеет еще 1 параметр- число от 1 до 12 .
 Задачей приложения является вывод всех фамилий студентов, которые родились в месяц, заданный параметром. Необходимо также выводить вначале список всех студентов с датами рождения. Обработайте ошибки при введении параметров.*/

import java.util.Scanner;

class lab1
{
    public static void main (String args[])
    {
        Scanner stud = new Scanner(System.in);
        int student = Integer.parseInt(stud.nextLine());
        if(student >0) {
            Scanner month = new Scanner(System.in);
            int months = Integer.parseInt(month.nextLine());
            if (months>=1 && months<=12) {
                String[] StudentsList = new String[student];
                int[] MonthStud = new int[student];
                for (int i = 0; i < student; i++) {
                    StudentsList[i] = "Family" + (i + 1);
                    MonthStud[i] = (int) (Math.random() * 12) + 1;
                    System.out.println(StudentsList[i] + "   " + MonthStud[i]);
                }
                for (int i = 0; i < student; i++) {
                    if (MonthStud[i] == months) {
                        System.out.println(StudentsList[i] + "   " + MonthStud[i]);
                    }
                }
            }
        }
    }
}


