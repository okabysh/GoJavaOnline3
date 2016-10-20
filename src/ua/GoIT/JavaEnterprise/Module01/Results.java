package ua.GoIT.JavaEnterprise.Module01;

import java.util.ArrayList;
import java.util.HashMap;

import static ua.GoIT.JavaEnterprise.Module01.Constants.*;

public class Results {
    public static HashMap<TypeCollections, Double> resultMap = new HashMap<TypeCollections, Double>();

    public void saveResult(TypeCollections typeCollections, Double result) {
        this.resultMap.put(typeCollections, result);
    }

    public Double loadResult(TypeCollections typeCollections) {
        return resultMap.get(typeCollections);
    }

    // get results of all the collection methods
    public ArrayList getResults(TypeCollections typeCollections, int sizeCollection) {
        ArrayList resultToArray = new ArrayList();

        if (typeCollections.equals(TypeCollections.ArrayList) && sizeCollection == VALUE_10k) {
            resultToArray.add(resultMap.get(TypeCollections.ArrayListAdd_10k));
            resultToArray.add(resultMap.get(TypeCollections.ArrayListGet_10k));
            resultToArray.add(resultMap.get(TypeCollections.ArrayListRemove_10k));
            resultToArray.add(resultMap.get(TypeCollections.ArrayListContaints_10k));
            resultToArray.add(resultMap.get(TypeCollections.ArrayListPopulate_10k));
            resultToArray.add(resultMap.get(TypeCollections.ArrayListIteratorAdd_10k));
            resultToArray.add(resultMap.get(TypeCollections.ArrayListIteratorRemove_10k));
            return resultToArray;

        } else if (typeCollections.equals(TypeCollections.ArrayList) && sizeCollection == VALUE_100k) {
            resultToArray.add(resultMap.get(TypeCollections.ArrayListAdd_100k));
            resultToArray.add(resultMap.get(TypeCollections.ArrayListGet_100k));
            resultToArray.add(resultMap.get(TypeCollections.ArrayListRemove_100k));
            resultToArray.add(resultMap.get(TypeCollections.ArrayListContaints_100k));
            resultToArray.add(resultMap.get(TypeCollections.ArrayListPopulate_100k));
            resultToArray.add(resultMap.get(TypeCollections.ArrayListIteratorAdd_100k));
            resultToArray.add(resultMap.get(TypeCollections.ArrayListIteratorRemove_100k));
            return resultToArray;

        } else if (typeCollections.equals(TypeCollections.ArrayList) && sizeCollection == VALUE_1M) {
            resultToArray.add(resultMap.get(TypeCollections.ArrayListAdd_1M));
            resultToArray.add(resultMap.get(TypeCollections.ArrayListGet_1M));
            resultToArray.add(resultMap.get(TypeCollections.ArrayListRemove_1M));
            resultToArray.add(resultMap.get(TypeCollections.ArrayListContaints_1M));
            resultToArray.add(resultMap.get(TypeCollections.ArrayListPopulate_1M));
            resultToArray.add(resultMap.get(TypeCollections.ArrayListIteratorAdd_1M));
            resultToArray.add(resultMap.get(TypeCollections.ArrayListIteratorRemove_1M));
            return resultToArray;

        } else if (typeCollections.equals(TypeCollections.LinkedList) && sizeCollection == VALUE_10k) {
            resultToArray.add(resultMap.get(TypeCollections.LinkedListAdd_10k));
            resultToArray.add(resultMap.get(TypeCollections.LinkedListGet_10k));
            resultToArray.add(resultMap.get(TypeCollections.LinkedListRemove_10k));
            resultToArray.add(resultMap.get(TypeCollections.LinkedListContaints_10k));
            resultToArray.add(resultMap.get(TypeCollections.LinkedListPopulate_10k));
            resultToArray.add(resultMap.get(TypeCollections.LinkedListIteratorAdd_10k));
            resultToArray.add(resultMap.get(TypeCollections.LinkedListIteratorRemove_10k));
            return resultToArray;

        } else if (typeCollections.equals(TypeCollections.LinkedList) && sizeCollection == VALUE_100k) {
            resultToArray.add(resultMap.get(TypeCollections.LinkedListAdd_100k));
            resultToArray.add(resultMap.get(TypeCollections.LinkedListGet_100k));
            resultToArray.add(resultMap.get(TypeCollections.LinkedListRemove_100k));
            resultToArray.add(resultMap.get(TypeCollections.LinkedListContaints_100k));
            resultToArray.add(resultMap.get(TypeCollections.LinkedListPopulate_100k));
            resultToArray.add(resultMap.get(TypeCollections.LinkedListIteratorAdd_100k));
            resultToArray.add(resultMap.get(TypeCollections.LinkedListIteratorRemove_100k));
            return resultToArray;

        } else if (typeCollections.equals(TypeCollections.LinkedList) && sizeCollection == VALUE_1M) {
            resultToArray.add(resultMap.get(TypeCollections.LinkedListAdd_1M));
            resultToArray.add(resultMap.get(TypeCollections.LinkedListGet_1M));
            resultToArray.add(resultMap.get(TypeCollections.LinkedListRemove_1M));
            resultToArray.add(resultMap.get(TypeCollections.LinkedListContaints_1M));
            resultToArray.add(resultMap.get(TypeCollections.LinkedListPopulate_1M));
            resultToArray.add(resultMap.get(TypeCollections.LinkedListIteratorAdd_1M));
            resultToArray.add(resultMap.get(TypeCollections.LinkedListIteratorRemove_1M));
            return resultToArray;

        } else if (typeCollections.equals(TypeCollections.HashSet) && sizeCollection == VALUE_10k) {
            resultToArray.add(resultMap.get(TypeCollections.HashSetAdd_10k));
            resultToArray.add(resultMap.get(TypeCollections.HashSetGet_10k));
            resultToArray.add(resultMap.get(TypeCollections.HashSetRemove_10k));
            resultToArray.add(resultMap.get(TypeCollections.HashSetContaints_10k));
            resultToArray.add(resultMap.get(TypeCollections.HashSetPopulate_10k));
            resultToArray.add(resultMap.get(TypeCollections.HashSetIteratorAdd_10k));
            resultToArray.add(resultMap.get(TypeCollections.HashSetIteratorRemove_10k));
            return resultToArray;

        } else if (typeCollections.equals(TypeCollections.HashSet) && sizeCollection == VALUE_100k) {
            resultToArray.add(resultMap.get(TypeCollections.HashSetAdd_100k));
            resultToArray.add(resultMap.get(TypeCollections.HashSetGet_100k));
            resultToArray.add(resultMap.get(TypeCollections.HashSetRemove_100k));
            resultToArray.add(resultMap.get(TypeCollections.HashSetContaints_100k));
            resultToArray.add(resultMap.get(TypeCollections.HashSetPopulate_100k));
            resultToArray.add(resultMap.get(TypeCollections.HashSetIteratorAdd_100k));
            resultToArray.add(resultMap.get(TypeCollections.HashSetIteratorRemove_100k));
            return resultToArray;

        } else if (typeCollections.equals(TypeCollections.HashSet) && sizeCollection == VALUE_1M) {
            resultToArray.add(resultMap.get(TypeCollections.HashSetAdd_1M));
            resultToArray.add(resultMap.get(TypeCollections.HashSetGet_1M));
            resultToArray.add(resultMap.get(TypeCollections.HashSetRemove_1M));
            resultToArray.add(resultMap.get(TypeCollections.HashSetContaints_1M));
            resultToArray.add(resultMap.get(TypeCollections.HashSetPopulate_1M));
            resultToArray.add(resultMap.get(TypeCollections.HashSetIteratorAdd_1M));
            resultToArray.add(resultMap.get(TypeCollections.HashSetIteratorRemove_1M));
            return resultToArray;

        } else if (typeCollections.equals(TypeCollections.TreeSet) && sizeCollection == VALUE_10k) {
            resultToArray.add(resultMap.get(TypeCollections.TreeSetAdd_10k));
            resultToArray.add(resultMap.get(TypeCollections.TreeSetGet_10k));
            resultToArray.add(resultMap.get(TypeCollections.TreeSetRemove_10k));
            resultToArray.add(resultMap.get(TypeCollections.TreeSetContaints_10k));
            resultToArray.add(resultMap.get(TypeCollections.TreeSetPopulate_10k));
            resultToArray.add(resultMap.get(TypeCollections.TreeSetIteratorAdd_10k));
            resultToArray.add(resultMap.get(TypeCollections.TreeSetIteratorRemove_10k));
            return resultToArray;

        } else if (typeCollections.equals(TypeCollections.TreeSet) && sizeCollection == VALUE_100k) {
            resultToArray.add(resultMap.get(TypeCollections.TreeSetAdd_100k));
            resultToArray.add(resultMap.get(TypeCollections.TreeSetGet_100k));
            resultToArray.add(resultMap.get(TypeCollections.TreeSetRemove_100k));
            resultToArray.add(resultMap.get(TypeCollections.TreeSetContaints_100k));
            resultToArray.add(resultMap.get(TypeCollections.TreeSetPopulate_100k));
            resultToArray.add(resultMap.get(TypeCollections.TreeSetIteratorAdd_100k));
            resultToArray.add(resultMap.get(TypeCollections.TreeSetIteratorRemove_100k));
            return resultToArray;

        } else if (typeCollections.equals(TypeCollections.TreeSet) && sizeCollection == VALUE_1M) {
            resultToArray.add(resultMap.get(TypeCollections.TreeSetAdd_1M));
            resultToArray.add(resultMap.get(TypeCollections.TreeSetGet_1M));
            resultToArray.add(resultMap.get(TypeCollections.TreeSetRemove_1M));
            resultToArray.add(resultMap.get(TypeCollections.TreeSetContaints_1M));
            resultToArray.add(resultMap.get(TypeCollections.TreeSetPopulate_1M));
            resultToArray.add(resultMap.get(TypeCollections.TreeSetIteratorAdd_1M));
            resultToArray.add(resultMap.get(TypeCollections.TreeSetIteratorRemove_1M));
            return resultToArray;

        }
        return null;
    }
}
