package src.Module06.Task2;

import java.util.HashMap;

import static src.Module06.Task2.Constants.*;

public class Store {
    public static void main(String[] args) {
        // initial new balance
        HashMap<String, Integer> balanceWarehouse = new HashMap<String,Integer>();
        Warehouse warehouse = new Warehouse();

        int piano = 2;
        int guitar = 16;
        int trumpet = 7;
        balanceWarehouse.put(CONST_PIANO, piano);
        balanceWarehouse.put(CONST_GUITAR, guitar);
        balanceWarehouse.put(CONST_TRUMPET, trumpet);

        boolean statusBalanceWarehouse = warehouse.setInsruments(balanceWarehouse);

        if (statusBalanceWarehouse) {
            System.out.println("Start balance in warehouse is: piano=" + piano + "; guitar=" + guitar + "; trumpet=" + trumpet + ";");
        } else {
            System.out.println("Try is trouble");
        }

        HashMap<String, Integer> order = new HashMap<String,Integer>();
        ListInstrumentsValidator validatorNomenclatures = new ListInstrumentsValidator();
        NumberOfInstrumentsValidator validatorNumbers = new NumberOfInstrumentsValidator();

        // order#1
        piano = 0;
        guitar = 7;
        trumpet = 2;
        order.put(CONST_PIANO, piano);
        order.put(CONST_GUITAR, guitar);
        order.put(CONST_TRUMPET, trumpet);
        // номенклатура "drums", которая не предусмотрена на складе (для проверки работы исключения)
        //order.put("drums",new Integer(1));
        // проверка нет ли в заказе номенклатуры, которой не предусмотрено на складе (свое исключение)
        try {
            validatorNomenclatures.validate(order);
        } catch (IllegalArgumentException e) {
            System.out.println(e);
        }
        // проверка количества номенклатуры в заказе (=0 и <0)
        try {
            validatorNumbers.validate(order);
        } catch (IllegalArgumentException e) {
            System.out.println(e);
        }
        // попытка списания Заказа №1
        boolean statusOrder1 = warehouse.getInsruments(order);
        if (statusOrder1) {
            System.out.println("Order #1 is executed (piano=" + piano + ", guitar=" + guitar + ", trumpet=" + trumpet + ");");
        } else {
            System.out.println("Exception: order #1 is NOT executed, insufficient number, (try piano=" + piano + ", guitar=" + guitar + ", trumpet=" + trumpet + ");");
            return;
        }

        // order#2
        piano = 1;
        guitar = 0;
        trumpet = 0;
        order.clear();
        order.put(CONST_PIANO, piano);
        order.put(CONST_GUITAR, guitar);
        order.put(CONST_TRUMPET, trumpet);
        // номенклатура "drums", которая не предусмотрена на складе (для проверки работы исключения)
        //order.put("drums",new Integer(1));
        // проверка нет ли в заказе номенклатуры, которой не предусмотрено на складе (свое исключение)
        try {
            validatorNomenclatures.validate(order);
        } catch (IllegalArgumentException e) {
            System.out.println(e);
        }
        // проверка количества номенклатуры в заказе (=0 и <0)
        try {
            validatorNumbers.validate(order);
        } catch (IllegalArgumentException e) {
            System.out.println(e);
        }
        // попытка списания Заказа №2
        boolean statusOrder2 = warehouse.getInsruments(order);
        if (statusOrder2) {
            System.out.println("Order #2 is executed (piano=" + piano + ", guitar=" + guitar + ", trumpet=" + trumpet + ");");
        } else {
            System.out.println("Exception: order #2 is NOT executed, insufficient number, (try piano=" + piano + ", guitar=" + guitar + ", trumpet=" + trumpet + ");");
            return;
        }

        // order#3
        piano = 1;
        guitar = 8;
        trumpet = 6;
        order.clear();
        order.put(CONST_PIANO, piano);
        order.put(CONST_GUITAR, guitar);
        order.put(CONST_TRUMPET, trumpet);
        // номенклатура "drums", которая не предусмотрена на складе (для проверки работы исключения)
        //order.put("drums",new Integer(1));
        // проверка нет ли в заказе номенклатуры, которой не предусмотрено на складе (свое исключение)
        try {
            validatorNomenclatures.validate(order);
        } catch (IllegalArgumentException e) {
            System.out.println(e);
        }
        // проверка количества номенклатуры в заказе (=0 и <0)
        try {
            validatorNumbers.validate(order);
        } catch (IllegalArgumentException e) {
            System.out.println(e);
        }
        // попытка списания Заказа №3
        boolean statusOrder3 = warehouse.getInsruments(order);
        if (statusOrder3) {
            System.out.println("Order #3 is executed (piano=" + piano + ", guitar=" + guitar + ", trumpet=" + trumpet + ");");
        } else {
            System.out.println("Exception: order #3 is NOT executed, because insufficient number, (try piano=" + piano + ", guitar=" + guitar + ", trumpet=" + trumpet + ");");
            return;
        }
    }
}
