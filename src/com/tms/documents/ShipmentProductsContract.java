package com.tms.documents;

import java.util.Date;

/**
 * Класс 1. Контракт на поставку товаров
 * Содержит поля:
 * 	- Номер документа
 * 	- Тип товаров
 * 	- Количество товаров
 * 	- Дата документа
 *
 * 	Каждый класс для описания документов должен содержать конструктор с параметрами и без;
 * 	В классе, описывающием документ, следует переопределить метод toString().
 */

public class ShipmentProductsContract extends Documents{
    String typeOfProducts;
    int amountOfProducts;

    public ShipmentProductsContract() {
        //empty
    }

    public ShipmentProductsContract(int numberOfDoc, String typeOfProducts, int amountOfProducts, Date dateOfDoc) {
        this.numberOfDoc = numberOfDoc;
        this.typeOfProducts = typeOfProducts;
        this.amountOfProducts = amountOfProducts;
        this.dateOfDoc = dateOfDoc;
    }

    @Override // Переопределяем метод toString(); В методе предоставления информации о документе следует выводить на экран информацию о переданном входным параметром документе
    public String toString() {
        String docProfile = "Номер документа: " + numberOfDoc + ", тип товаров: " + typeOfProducts + ", количество товаров: " + amountOfProducts + ", дата документа: " + dateOfDoc;
        return docProfile;
    }
    // - интерфейс IDocuments для метода toString создавать не нужно, т.к. этот метод уже есть в классе Object,
    // а значит возможность вызвать этот метод без создания интерфейса для этого, есть у каждого объекта любого класса

}
