package Module08.Lecture;

import java.util.ArrayList;
import java.util.Arrays;

public class CollectionExample {
    public static void main(String[] args) {
        Integer[] intArray = {5, -7, 10};
        ArrayList<Integer> arrayList = new ArrayList(Arrays.asList(intArray));
        arrayList.add(100);

        for (Integer element: arrayList) {
            System.out.println("Element: " + element);
        }
        System.out.println("Array size: " + arrayList.size());


    }
}
