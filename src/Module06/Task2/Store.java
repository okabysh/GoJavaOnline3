package src.Module06.Task2;

import java.util.HashMap;
import java.util.Map;

public class Store {
    static int piano;
    static int guitar;
    static int trumpet;
    public static void main(String[] args) {
        // initial new balance
        HashMap balanceWarehouse = new HashMap<String,Integer>();
        piano = 2;
        guitar = 16;
        trumpet = 7;
        balanceWarehouse.put("piano",piano);
        balanceWarehouse.put("guitar",guitar);
        balanceWarehouse.put("trumpet",trumpet);
        boolean statusBalanceWarehouse = new Warehouse().setInsruments(balanceWarehouse);
        if (statusBalanceWarehouse) {
            System.out.println("Start balance in warehouse is: piano=" + piano + "; guitar=" + guitar + "; trumpet=" + trumpet + ";");
        } else {
            System.out.println("Try is trouble");
        }

        HashMap order = new HashMap<String,Integer>();
        final ListInstrumentsValidator validatorNomenclatures = new ListInstrumentsValidator();
        final NumberOfInstrumentsValidator validatorNumbers = new NumberOfInstrumentsValidator();

        // order#1
        piano = 0;
        guitar = 7;
        trumpet = 2;
        order.put("piano",piano);
        order.put("guitar",guitar);
        order.put("trumpet",trumpet);
        // номенклатура "drums", которая не предусмотрена на складе (для проверки работы исключения)
        //order.put("drums",new Integer(1));
        // проверка нет ли в заказе номенклатуры, которой не предусмотрено на складе (свое исключение)
        validatorNomenclatures.Validate(order);
        // проверка количества номенклатуры в заказе (=0 и <0)
        validatorNumbers.Validate(order);
        // попытка списания Заказа №1
        boolean statusOrder1 = new Warehouse().getInsruments(order);
        if (statusOrder1) {
            System.out.println("Order #1 is executed (piano=" + piano + ", guitar=" + guitar + ", trumpet=" + trumpet + ");");
        } else {
            try {
                throw new ArithmeticException();
            } catch (ArithmeticException e) {
                System.out.println("Exception: order #1 is NOT executed, insufficient number, (try piano=" + piano + ", guitar=" + guitar + ", trumpet=" + trumpet + ");");
            } finally {
                return;
            }
        }

        // order#2
        piano = 1;
        guitar = 0;
        trumpet = 0;
        order.clear();
        order.put("piano",piano);
        order.put("guitar",guitar);
        order.put("trumpet",trumpet);
        // номенклатура "drums", которая не предусмотрена на складе (для проверки работы исключения)
        //order.put("drums",new Integer(1));
        // проверка нет ли в заказе номенклатуры, которой не предусмотрено на складе (свое исключение)
        validatorNomenclatures.Validate(order);
        // проверка количества номенклатуры в заказе (=0 и <0)
        validatorNumbers.Validate(order);
        // попытка списания Заказа №2
        boolean statusOrder2 = new Warehouse().getInsruments(order);
        if (statusOrder2) {
            System.out.println("Order #2 is executed (piano=" + piano + ", guitar=" + guitar + ", trumpet=" + trumpet + ");");
        } else {
            try {
                throw new ArithmeticException();
            } catch (ArithmeticException e) {
                System.out.println("Exception: order #2 is NOT executed, insufficient number, (try piano=" + piano + ", guitar=" + guitar + ", trumpet=" + trumpet + ");");
            } finally {
                return;
            }
        }

        // order#3
        piano = 1;
        guitar = 8;
        trumpet = 6;
        order.clear();
        order.put("piano",piano);
        order.put("guitar",guitar);
        order.put("trumpet",trumpet);
        // номенклатура "drums", которая не предусмотрена на складе (для проверки работы исключения)
        //order.put("drums",new Integer(1));
        // проверка нет ли в заказе номенклатуры, которой не предусмотрено на складе (свое исключение)
        validatorNomenclatures.Validate(order);
        // проверка количества номенклатуры в заказе (=0 и <0)
        validatorNumbers.Validate(order);
        // попытка списания Заказа №3
        boolean statusOrder3 = new Warehouse().getInsruments(order);
        if (statusOrder3) {
            System.out.println("Order #3 is executed (piano=" + piano + ", guitar=" + guitar + ", trumpet=" + trumpet + ");");
        } else {
            try {
                throw new ArithmeticException();
            } catch (ArithmeticException e) {
                System.out.println("Exception: order #3 is NOT executed, insufficient number, (try piano=" + piano + ", guitar=" + guitar + ", trumpet=" + trumpet + ");");
            } finally {
                return;
            }
        }
    }
}
