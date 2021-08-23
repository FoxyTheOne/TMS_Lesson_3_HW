package com.tms.documents;

import java.util.Date;

/**
 * Класс 2. Контракт с сотрудником
 * Содержит поля:
 * 	- Номер документа
 * 	- Дата документа
 * 	- Дата окончания контракта
 * 	- Имя сотрудника
 *
 * 	Каждый класс для описания документов должен содержать конструктор с параметрами и без;
 * 	В классе, описывающием документ, следует переопределить метод toString().
 */

public class WorkerContract extends Documents{
    Date dateEndOfContract;
    String nameOfWorker;

    public WorkerContract() {
        // empty
    }

    public WorkerContract(int numberOfDoc, Date dateOfDoc, Date dateEndOfContract, String nameOfWorker) {
        this.numberOfDoc = numberOfDoc;
        this.dateOfDoc = dateOfDoc;
        this.dateEndOfContract = dateEndOfContract;
        this.nameOfWorker = nameOfWorker;
    }

    @Override // Переопределяем метод toString(); В методе предоставления информации о документе следует выводить на экран информацию о переданном входным параметром документе
    public String toString() {
        String docProfile = "Номер документа: " + numberOfDoc + ", дата документа: " + dateOfDoc + ", дата окончания контракта: " + dateEndOfContract + ", имя сотрудника: " + nameOfWorker;
        return docProfile;
    }
    // - интерфейс IDocuments для метода toString создавать не нужно, т.к. этот метод уже есть в классе Object,
    // а значит возможность вызвать этот метод без создания интерфейса для этого, есть у каждого объекта любого класса

}
