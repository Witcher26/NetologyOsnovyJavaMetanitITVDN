package Home_Task_Netology.Ten.Задача_от_Бухгалтеров;

import Home_Task_Netology.Ten.Задача_от_Бухгалтеров.Tax.*;

public class Main {
    public static void main(String[] args) {

        TaxService taxService = new TaxService();

        IncomeTaxType incomeTaxType = new IncomeTaxType("Подоходный налог");
        ProgressiveTaxType progressiveTaxType = new ProgressiveTaxType("Прогрессивный налог");
        VATaxType vaTaxType = new VATaxType("НДС");

        Bill[] payments = new Bill[]{
                new Bill(10000, incomeTaxType, taxService),
                new Bill(19000, progressiveTaxType, taxService),
                new Bill(69000, vaTaxType, taxService)
        };

        for (int i = 0; i < payments.length; ++i) {
            Bill bill = payments[i];
            bill.payTaxes();
            System.out.println("-------------------------------");
        }
    }
}

