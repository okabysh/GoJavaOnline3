package ua.GoIT.JavaEnterprise.Module01;

import java.util.HashMap;

import static ua.GoIT.JavaEnterprise.Module01.Constants.*;

public class Results {
    private HashMap<Integer, Integer> resultArrayListAdd_10k = new HashMap<Integer, Integer>();
    private HashMap<Integer, Integer> resultArrayListAdd_100k = new HashMap<Integer, Integer>();
    private HashMap<Integer, Integer> resultArrayListAdd_1M = new HashMap<Integer, Integer>();
    private int resultArrayListTotalAdd_10k = 0;
    private int resultArrayListTotalAdd_100k = 0;
    private int resultArrayListTotalAdd_1M = 0;

    private HashMap<Integer, Integer> resultArrayListGet_10k = new HashMap<Integer, Integer>();
    private HashMap<Integer, Integer> resultArrayListGet_100k = new HashMap<Integer, Integer>();
    private HashMap<Integer, Integer> resultArrayListGet_1M = new HashMap<Integer, Integer>();
    private int resultArrayListTotalGet_10k = 0;
    private int resultArrayListTotalGet_100k = 0;
    private int resultArrayListTotalGet_1M = 0;

    private HashMap<Integer, Integer> resultArrayListRemove_10k = new HashMap<Integer, Integer>();
    private HashMap<Integer, Integer> resultArrayListRemove_100k = new HashMap<Integer, Integer>();
    private HashMap<Integer, Integer> resultArrayListRemove_1M = new HashMap<Integer, Integer>();
    private int resultArrayListTotalRemove_10k = 0;
    private int resultArrayListTotalRemove_100k = 0;
    private int resultArrayListTotalRemove_1M = 0;

    private HashMap<Integer, Integer> resultArrayListContaints_10k = new HashMap<Integer, Integer>();
    private HashMap<Integer, Integer> resultArrayListContaints_100k = new HashMap<Integer, Integer>();
    private HashMap<Integer, Integer> resultArrayListContaints_1M = new HashMap<Integer, Integer>();
    private int resultArrayListTotalContaints_10k = 0;
    private int resultArrayListTotalContaints_100k = 0;
    private int resultArrayListTotalContaints_1M = 0;

    public void saveResult(TypeCollections typeCollections, Integer value, Integer index, Integer result) {
        if (typeCollections == TypeCollections.ArrayListAdd && value == VALUE_10k) {
            this.resultArrayListAdd_10k.put(index, result);
            this.resultArrayListTotalAdd_10k = this.resultArrayListTotalAdd_10k + result;
        } else if (typeCollections == TypeCollections.ArrayListAdd && value == VALUE_100k) {
            this.resultArrayListAdd_100k.put(index, result);
            this.resultArrayListTotalAdd_100k = this.resultArrayListTotalAdd_100k + result;
        } else if (typeCollections == TypeCollections.ArrayListAdd && value == VALUE_1M) {
            this.resultArrayListAdd_1M.put(index, result);
            this.resultArrayListTotalAdd_1M = this.resultArrayListTotalAdd_1M + result;
        }
          else if (typeCollections == TypeCollections.ArrayListGet && value == VALUE_10k) {
            this.resultArrayListGet_10k.put(index, result);
            this.resultArrayListTotalGet_10k = this.resultArrayListTotalGet_10k + result;
        } else if (typeCollections == TypeCollections.ArrayListGet && value == VALUE_100k) {
            this.resultArrayListGet_100k.put(index, result);
            this.resultArrayListTotalGet_100k = this.resultArrayListTotalGet_100k + result;
        } else if (typeCollections == TypeCollections.ArrayListGet && value == VALUE_1M) {
            this.resultArrayListGet_1M.put(index, result);
            this.resultArrayListTotalGet_1M = this.resultArrayListTotalGet_1M + result;
        }
          else if (typeCollections == TypeCollections.ArrayListRemove && value == VALUE_10k) {
            this.resultArrayListRemove_10k.put(index, result);
            this.resultArrayListTotalRemove_10k = this.resultArrayListTotalRemove_10k + result;
        } else if (typeCollections == TypeCollections.ArrayListRemove && value == VALUE_100k) {
            this.resultArrayListRemove_100k.put(index, result);
            this.resultArrayListTotalRemove_100k = this.resultArrayListTotalRemove_100k + result;
        } else if (typeCollections == TypeCollections.ArrayListRemove && value == VALUE_1M) {
            this.resultArrayListRemove_1M.put(index, result);
            this.resultArrayListTotalRemove_1M = this.resultArrayListTotalRemove_1M + result;
        }
        else if (typeCollections == TypeCollections.ArrayListContaints && value == VALUE_10k) {
            this.resultArrayListContaints_10k.put(index, result);
            this.resultArrayListTotalContaints_10k = this.resultArrayListTotalContaints_10k + result;
        } else if (typeCollections == TypeCollections.ArrayListContaints && value == VALUE_100k) {
            this.resultArrayListContaints_100k.put(index, result);
            this.resultArrayListTotalContaints_100k = this.resultArrayListTotalContaints_100k + result;
        } else if (typeCollections == TypeCollections.ArrayListContaints && value == VALUE_1M) {
            this.resultArrayListContaints_1M.put(index, result);
            this.resultArrayListTotalContaints_1M = this.resultArrayListTotalContaints_1M + result;
        }
          else if (typeCollections == TypeCollections.LinkedList) {

        } else if (typeCollections == TypeCollections.HashSet) {

        } else if (typeCollections == TypeCollections.TreeSet) {

        }
    }

    public int AverageResult(TypeCollections typeCollections, Integer value) {
        if (typeCollections == TypeCollections.ArrayListAdd && value == VALUE_10k) {
            if (this.resultArrayListAdd_10k.size() != 0) {
                return resultArrayListTotalAdd_10k/this.resultArrayListAdd_10k.size();
            }
        } else if (typeCollections == TypeCollections.ArrayListAdd && value == VALUE_100k) {
            if (this.resultArrayListAdd_100k.size() != 0) {
                return resultArrayListTotalAdd_100k/this.resultArrayListAdd_100k.size();
            }
        } else if (typeCollections == TypeCollections.ArrayListAdd && value == VALUE_1M) {
            if (this.resultArrayListAdd_1M.size() != 0) {
                return resultArrayListTotalAdd_1M/this.resultArrayListAdd_1M.size();
            }
        }
        return 0;
    }

}
