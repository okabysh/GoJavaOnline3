package ua.GoIT.JavaEnterprise.Module01;

import java.util.HashMap;

public class Results {
    private HashMap<TypeCollections, Double> resultArrayList = new HashMap<TypeCollections, Double>();

    public void saveResult(TypeCollections typeCollections, Double result) {
        this.resultArrayList.put(typeCollections, result);
    }

    public Double loadResult(TypeCollections typeCollections) {
        return resultArrayList.get(typeCollections);
    }
}
