package Home_Task_Netology.Four.ИПшник;
/*
Описание
Нужно написать программу-помощника индивидуальному предпринимателю (далее - ИП),
которая помогает ему выбрать лучшую систему налогооблажения.
ИП будет заносить суммы доходов и расходов, а программа будет выбирать для него лучшую систему налогообложения из двух:

УСН доходы - налог 6% от доходов;
УСН доходы минус расходы - налог 15% от разницы доходов и расходов.

Функционал программы
Ввод сумм доходов и расходов ИП;
ИП может несколько раз вносить доходы и расходы, они должны суммироваться с введёнными ранее данными;
При выборе ИП опции определения наиболее выгодной системы налогообложения, программа должна вывести название
такой системы (УСН доходы или УСН доходы минус расходы);
При выводе самой выгодной системы налогооблажения, программа должна вывести также сумму, которую удастся сэкономить, если выбрать эту систему;
Программа должна завершаться при вводе слова end;
Нужно помнить, что налог не может быть отрицательным;
Программа должна быть структурирована в методы
(например, расчёт налога для одной системы налогооблажения должен представлять собой отдельный статический метод)
 */

import java.util.Scanner;
import static java.lang.System.*;

class Main {

    static int income = 0;  // переменная для ввода доходов
    static int spendings = 0; // переменная для ввода расходов

    static String colorRed = (char) 27 + "[31m";  //Красный цвет консоли
    static Scanner scanner = new Scanner(in);

    public static void main(String[] args) {

        while (true) {
            out.println("Введите номер желаемой операции: \n1.Добавить новый доход.\n2.Добавить новый расход.\n3.Выбрать систему налогооблажения. \nЛибо введите \"end\" для выхода");
            String userNumber = scanner.nextLine();

            if(userNumber.equalsIgnoreCase("end")) {
                out.println(colorRed + "Вы завершили работу программы");
                break;
            }

            int operation = Integer.parseInt(userNumber);
            switch (operation) {
                case 1:
                    System.out.println("Введите сумму дохода: ");
                    String moneyStr = scanner.nextLine();
                    int userMoney = Integer.parseInt(moneyStr);
                    income += userMoney;
                    out.println();
                    break;

                case 2:
                    System.out.println("Введите сумму расхода: ");
                    moneyStr = scanner.nextLine();
                    userMoney = Integer.parseInt(moneyStr);
                    spendings += userMoney;
                    out.println();
                    break;

                case 3:
                    int resultIncomeMinusSpending = calculateTaxIncomeMinusSpendings(income, spendings);//100
                    int resultSixPercent = calculateTaxIncome(income);//90

                    if (resultIncomeMinusSpending>=resultSixPercent) {   //если у первой системы налогов больше - рекомендуем вторую и наоборот.
                        int economy = resultIncomeMinusSpending-resultSixPercent; // экономия
                        out.println("Мы советуем вам систему: \"УСН доходы\"");
                        out.println("Ваш налог составит: " + resultSixPercent);
                        out.println("Экономия составит: " + economy);
                        out.println();
                    }
                    else {
                        out.println("Мы советуем вам систему: \"УСН доходы минус расходы\"");
                        int economy = resultSixPercent-resultIncomeMinusSpending; // экономия
                        out.println("Ваш налог составит: " + resultIncomeMinusSpending);
                        out.println("Экономия составит: " + economy);
                        out.println();
                    }
                    break;
                default:
                    System.out.println("Такой операции нет");
            }
        }
    }


    public static int calculateTaxIncomeMinusSpendings(int income, int spendings) {
        int tax = (income - spendings) * 15 / 100;
        if (tax >= 0) {
            return tax;
        } else {
            return 0;
        }
    }
    public static int calculateTaxIncome(int income){
        int tax = income * 6 / 100;
        return tax;
    }
}
