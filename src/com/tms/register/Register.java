package com.tms.register;

import com.tms.documents.Documents;

/**
 * Создать класс Регистр, который будет иметь методы:
 * - сохранения документа в регистре
 * - предоставление информации о документе
 *
 * Класс регистр должен содержать внутри себя массив и при добавлении документа в регистр
 * этот добавляемый документ должен добавляться в массив;
 * Массив для класса регистра должен быть размером 10;
 *
 * В методе предоставления информации о документе следует выводить на экран информацию о переданном входным параметром документе
 * (для этого в классе, описывающием документ, следует переопределить метод toString());
 */

public class Register {

    Documents[] docRegister = new Documents[10]; // это массив объектов
    // массив содержит в себе объекты - документы, создаваемые из классов com.tms.documents.FinanceInvoice, ShipmentProductsContact, WorkerContact которые связаны классом com.tms.documents.Documents
    // int[] documents = new int[10]; - пустой массив размером 10 из чисел

    // метод для заполнения массива добавляемыми в регистр документами:
    int i; // создаём переменную-счетчик, чтобы заполнять ячейки массива с документами по порядку
    public void savingDocInRegister(Documents doc) {
        docRegister[i] = doc; // сохраняем созданный объект (документ) в i-той ячейке массива
        i++; // увеличиваем переменную-счетчик, чтобы следующий документ сохранить в следующей ячейке массива
        System.out.println("Документ сохранён в регистре, ячейка массива " + i);
    }

    // Метод предоставления информации о документе; в doc передаётся интересующий нас объект (документ) определенного класса, что позволяет вызывать метод из соответствующего класса (FinanceInvoice, ShipmentProductsContact либо Worker Contract)
    public void getDocInfo(Documents doc) {
        doc.toString();
        System.out.println("Вот вся информация о документе - " + doc);
    }











}

