package Home_Task_Netology.Three_Високостный_год;

/*
писание
Нужно написать программу, которая будет рассчитывать количество дней в году.
Зачем это бывает нужно? Варианты бывают разные: например, для расчета продолжительности долгосрочных проектов в днях
или чтобы узнать, сколько дней потребуется для космической экспедиции на Марс. Для расчета количества дней в году
требуется знать несколько правил:

В високосном году 366 дней, в обычном 365.
Високосный год — это год, номер которого делится без остатка на 400 (например 2000 или 2400), либо делится
на 4 но не делится на 100 (например 2008, 2096, но не 2100).
Функционал программы
Вывод сообщения в консоли Введите год в формате "yyyy".
Ввод года в формате yyyy (например 2004).
Чтение значения из консоли и расчет количества дней.
Результат работы программы: напечатать в консоли количество дней в году Количество дней 365 или Количество дней 366.
 */
import java.util.Scanner;
import static java.lang.System.*;

public class HomeTask3 {
    public static void main(String[] args) {
        String color = (char) 27 + "[32m";

        Scanner scanner = new Scanner(in);
        int result = 0;
        while (true) {
            out.println(color + "Введите год в формате: 'yyyy' и количество дней в формате: 'n'");

            int year = scanner.nextInt();
            int days = scanner.nextInt();

            int checkDaysOfYear = daysOfYear(year);
            if (checkDaysOfYear==days) {
                result++;
            }
            else {
                out.println("Неправильно! В этом году " + checkDaysOfYear + " дней!");
                out.println("Набрано очков: " + result);
                break;
            }
        }
    }
        public static int daysOfYear (int year) {
            int daysOfYear = (year % 4 == 0 && !(year % 100 == 0)) ? 366 : 365;
            return daysOfYear;

    }
}
