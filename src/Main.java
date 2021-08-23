import com.tms.documents.FinanceInvoice;
import com.tms.documents.ShipmentProductsContract;
import com.tms.documents.WorkerContract;
import com.tms.register.Register;

import java.util.Date;

/**
 * Создать систему для учета документов.
 *
 * - Для полей "Дата документа" следует использовать тип данных Date;
 * - Для имитации работы системы создайте класс Main, который будет содержать только один метод public static void main;
 * - В этом методе напишите код для создания каждого из типов документов, добавления их в регистр и вывода информации о документе;
 * - Все классы разместить по пакетам
 */

public class Main {

    public static void main(String[] args) {

        // Создаём первый документ
        Date dateOfDoc1 = new Date(121, 9, 10); // Дата: Пример new Date(122, 09, 10), где (год от 1900, месяц - 1, число)
        FinanceInvoice doc1 = new FinanceInvoice(123, dateOfDoc1, 36, 1);

        Register register = new Register();
        register.savingDocInRegister(doc1); // Сохраняем первый документ в первую ячейку массива
        register.getDocInfo(doc1); // Вывод информации о первом документе

        // Создаём второй документ
        Date dateOfDoc2 = new Date(122, 1, 12);
        ShipmentProductsContract doc2 = new ShipmentProductsContract(23, "Мясные изделия", 450, dateOfDoc2);

        register.savingDocInRegister(doc2);
        register.getDocInfo(doc2);

        // Создаём третий документ
        Date dateOfDoc3 = new Date(120, 2, 29);
        Date dateEndOfContract3 = new Date(122, 2, 15);
        WorkerContract doc3 = new WorkerContract(241, dateOfDoc3, dateEndOfContract3, "Владимир");

        register.savingDocInRegister(doc3);
        register.getDocInfo(doc3);
    }

}
