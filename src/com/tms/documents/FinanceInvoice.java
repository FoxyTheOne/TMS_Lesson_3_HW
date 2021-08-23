package com.tms.documents;

import java.util.Date;

/**
 * Класс 3. Финансовая накладная
 * Содержит поля:
 * 	- Итоговая сумма за месяц
 * 	- Дата документа
 * 	- Номер документа
 * 	- Код департамета
 *
 * 	Каждый класс для описания документов должен содержать конструктор с параметрами и без;
 * 	В классе, описывающием документ, следует переопределить метод toString()
 */

public class FinanceInvoice extends Documents{
    int totalSumPerMonth;
    int departmentCode;

    public FinanceInvoice() {
        // empty
    }

    public FinanceInvoice(int totalSumPerMonth, Date dateOfDoc, int numberOfDoc, int departmentCode) {
        this.totalSumPerMonth = totalSumPerMonth;
        this.dateOfDoc = dateOfDoc;
        this.numberOfDoc = numberOfDoc;
        this.departmentCode = departmentCode;
    }

    @Override // Переопределяем метод toString(); В методе предоставления информации о документе следует выводить на экран информацию о переданном входным параметром документе
    public String toString() {
        String docProfile = "Итоговая сумма за месяц: " + totalSumPerMonth + ", дата документа: " + dateOfDoc + ", номер документа: " + numberOfDoc + ", код департамета: " + departmentCode;
        return docProfile;
    }
    // - интерфейс IDocuments для метода toString создавать не нужно, т.к. этот метод уже есть в классе Object,
    // а значит возможность вызвать этот метод без создания интерфейса для этого, есть у каждого объекта любого класса

}
