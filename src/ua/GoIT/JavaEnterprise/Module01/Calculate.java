package ua.GoIT.JavaEnterprise.Module01;

import static ua.GoIT.JavaEnterprise.Module01.Constants.*;

public class Calculate {
    private Results results;
    private Methods methods;

    public Calculate() {
        this.results = new Results();
        this.methods = new Methods();
    }

    public void calculateArrayList() {
        double currentTime = 0;

        // add() function in ArrayList<>
        currentTime = methods.addMethodInArrayList(VALUE_10k);
        results.saveResult(TypeCollections.ArrayListAdd_10k, currentTime);
        currentTime = methods.addMethodInArrayList(VALUE_100k);
        results.saveResult(TypeCollections.ArrayListAdd_100k, currentTime);
        currentTime = methods.addMethodInArrayList(VALUE_1M);
        results.saveResult(TypeCollections.ArrayListAdd_1M, currentTime);

        // get() function in ArrayList<>
        currentTime = methods.getMethodInArrayList(VALUE_10k);
        results.saveResult(TypeCollections.ArrayListGet_10k, currentTime);
        currentTime = methods.getMethodInArrayList(VALUE_100k);
        results.saveResult(TypeCollections.ArrayListGet_100k, currentTime);
        currentTime = methods.getMethodInArrayList(VALUE_1M);
        results.saveResult(TypeCollections.ArrayListGet_1M, currentTime);

        // remove() function in ArrayList<>
        currentTime = methods.removeMethodInArrayList(VALUE_10k);
        results.saveResult(TypeCollections.ArrayListRemove_10k, currentTime);
        currentTime = methods.removeMethodInArrayList(VALUE_100k);
        results.saveResult(TypeCollections.ArrayListRemove_100k, currentTime);
        currentTime = methods.removeMethodInArrayList(VALUE_1M);
        results.saveResult(TypeCollections.ArrayListRemove_1M, currentTime);

        // containts() function in ArrayList<>
        currentTime = methods.containtsMethodInArrayList(VALUE_10k);
        results.saveResult(TypeCollections.ArrayListContaints_10k, currentTime);
        currentTime = methods.containtsMethodInArrayList(VALUE_100k);
        results.saveResult(TypeCollections.ArrayListContaints_100k, currentTime);
        currentTime = methods.containtsMethodInArrayList(VALUE_1M);
        results.saveResult(TypeCollections.ArrayListContaints_1M, currentTime);

        // populate function in ArrayList<>
        currentTime = methods.populateMethodInArrayList(VALUE_10k);
        results.saveResult(TypeCollections.ArrayListPopulate_10k, currentTime);
        currentTime = methods.populateMethodInArrayList(VALUE_100k);
        results.saveResult(TypeCollections.ArrayListPopulate_100k, currentTime);
        currentTime = methods.populateMethodInArrayList(VALUE_1M);
        results.saveResult(TypeCollections.ArrayListPopulate_1M, currentTime);

         //iteratorAdd() function in ArrayList<>
        currentTime = methods.iteratorAddMethodInArrayList(VALUE_10k);
        results.saveResult(TypeCollections.ArrayListIteratorAdd_10k, currentTime);
        currentTime = methods.iteratorAddMethodInArrayList(VALUE_100k);
        results.saveResult(TypeCollections.ArrayListIteratorAdd_100k, currentTime);
        currentTime = methods.iteratorAddMethodInArrayList(VALUE_1M);
        results.saveResult(TypeCollections.ArrayListIteratorAdd_1M, currentTime);

         //iteratorRemove() function in ArrayList<>
        currentTime = methods.iteratorRemoveMethodInArrayList(VALUE_10k);
        results.saveResult(TypeCollections.ArrayListIteratorRemove_10k, currentTime);
        currentTime = methods.iteratorRemoveMethodInArrayList(VALUE_100k);
        results.saveResult(TypeCollections.ArrayListIteratorRemove_100k, currentTime);
        currentTime = methods.iteratorRemoveMethodInArrayList(VALUE_1M);
        results.saveResult(TypeCollections.ArrayListIteratorRemove_1M, currentTime);
    }

    public void calculateLinkedList() {
        double currentTime = 0;

        // add() function in LinkedList<>
        currentTime = methods.addMethodInLinkedList(VALUE_10k);
        results.saveResult(TypeCollections.LinkedListAdd_10k, currentTime);
        currentTime = methods.addMethodInLinkedList(VALUE_100k);
        results.saveResult(TypeCollections.LinkedListAdd_100k, currentTime);
        currentTime = methods.addMethodInLinkedList(VALUE_1M);
        results.saveResult(TypeCollections.LinkedListAdd_1M, currentTime);

        // get() function in LinkedList<>
        currentTime = methods.getMethodInLinkedList(VALUE_10k);
        results.saveResult(TypeCollections.LinkedListGet_10k, currentTime);
        currentTime = methods.getMethodInLinkedList(VALUE_100k);
        results.saveResult(TypeCollections.LinkedListGet_100k, currentTime);
        currentTime = methods.getMethodInLinkedList(VALUE_1M);
        results.saveResult(TypeCollections.LinkedListGet_1M, currentTime);

        // remove() function in ArrayList<>
        currentTime = methods.removeMethodInLinkedList(VALUE_10k);
        results.saveResult(TypeCollections.LinkedListRemove_10k, currentTime);
        currentTime = methods.removeMethodInLinkedList(VALUE_100k);
        results.saveResult(TypeCollections.LinkedListRemove_100k, currentTime);
        currentTime = methods.removeMethodInLinkedList(VALUE_1M);
        results.saveResult(TypeCollections.LinkedListRemove_1M, currentTime);

        // containts() function in LinkedList<>
        currentTime = methods.containtsMethodInLinkedList(VALUE_10k);
        results.saveResult(TypeCollections.LinkedListContaints_10k, currentTime);
        currentTime = methods.containtsMethodInLinkedList(VALUE_100k);
        results.saveResult(TypeCollections.LinkedListContaints_100k, currentTime);
        currentTime = methods.containtsMethodInLinkedList(VALUE_1M);
        results.saveResult(TypeCollections.LinkedListContaints_1M, currentTime);

        // populate function in LinkedList<>
        currentTime = methods.populateMethodInLinkedList(VALUE_10k);
        results.saveResult(TypeCollections.LinkedListPopulate_10k, currentTime);
        currentTime = methods.populateMethodInLinkedList(VALUE_100k);
        results.saveResult(TypeCollections.LinkedListPopulate_100k, currentTime);
        currentTime = methods.populateMethodInLinkedList(VALUE_1M);
        results.saveResult(TypeCollections.LinkedListPopulate_1M, currentTime);

        // iteratorAdd() function in LinkedList<>
        currentTime = methods.iteratorAddMethodInLinkedList(VALUE_10k);
        results.saveResult(TypeCollections.LinkedListIteratorAdd_10k, currentTime);
        currentTime = methods.iteratorAddMethodInLinkedList(VALUE_100k);
        results.saveResult(TypeCollections.LinkedListIteratorAdd_100k, currentTime);
        currentTime = methods.iteratorAddMethodInLinkedList(VALUE_1M);
        results.saveResult(TypeCollections.LinkedListIteratorAdd_1M, currentTime);

        // iteratorRemove() function in LinkedList<>
        currentTime = methods.iteratorRemoveMethodInLinkedList(VALUE_10k);
        results.saveResult(TypeCollections.LinkedListIteratorRemove_10k, currentTime);
        currentTime = methods.iteratorRemoveMethodInLinkedList(VALUE_100k);
        results.saveResult(TypeCollections.LinkedListIteratorRemove_100k, currentTime);
        currentTime = methods.iteratorRemoveMethodInLinkedList(VALUE_1M);
        results.saveResult(TypeCollections.LinkedListIteratorRemove_1M, currentTime);
    }

    public void calculateHashSet() {
        double currentTime = 0;

        // add() function in HashSet<>
        currentTime = methods.addMethodInHashSet(VALUE_10k);
        results.saveResult(TypeCollections.HashSetAdd_10k, currentTime);
        currentTime = methods.addMethodInHashSet(VALUE_100k);
        results.saveResult(TypeCollections.HashSetAdd_100k, currentTime);
        currentTime = methods.addMethodInHashSet(VALUE_1M);
        results.saveResult(TypeCollections.HashSetAdd_1M, currentTime);

        // get() function in HashSet<>
        currentTime = methods.getMethodInHashSet(VALUE_10k);
        results.saveResult(TypeCollections.HashSetGet_10k, currentTime);
        currentTime = methods.getMethodInHashSet(VALUE_100k);
        results.saveResult(TypeCollections.HashSetGet_100k, currentTime);
        currentTime = methods.getMethodInHashSet(VALUE_1M);
        results.saveResult(TypeCollections.HashSetGet_1M, currentTime);

        // remove() function in HashSet<>
        currentTime = methods.removeMethodInHashSet(VALUE_10k);
        results.saveResult(TypeCollections.HashSetRemove_10k, currentTime);
        currentTime = methods.removeMethodInHashSet(VALUE_100k);
        results.saveResult(TypeCollections.HashSetRemove_100k, currentTime);
        currentTime = methods.removeMethodInHashSet(VALUE_1M);
        results.saveResult(TypeCollections.HashSetRemove_1M, currentTime);

        // containts() function in HashSet<>
        currentTime = methods.containtsMethodInHashSet(VALUE_10k);
        results.saveResult(TypeCollections.HashSetContaints_10k, currentTime);
        currentTime = methods.containtsMethodInHashSet(VALUE_100k);
        results.saveResult(TypeCollections.HashSetContaints_100k, currentTime);
        currentTime = methods.containtsMethodInHashSet(VALUE_1M);
        results.saveResult(TypeCollections.HashSetContaints_1M, currentTime);

        // populate function in HashSet<>
        currentTime = methods.populateMethodInHashSet(VALUE_10k);
        results.saveResult(TypeCollections.HashSetPopulate_10k, currentTime);
        currentTime = methods.populateMethodInHashSet(VALUE_100k);
        results.saveResult(TypeCollections.HashSetPopulate_100k, currentTime);
        currentTime = methods.populateMethodInHashSet(VALUE_1M);
        results.saveResult(TypeCollections.HashSetPopulate_1M, currentTime);

        // iteratorAdd() function in HashSet<>
        currentTime = methods.iteratorAddMethodInHashSet(VALUE_10k);
        results.saveResult(TypeCollections.HashSetIteratorAdd_10k, currentTime);
        currentTime = methods.iteratorAddMethodInHashSet(VALUE_100k);
        results.saveResult(TypeCollections.HashSetIteratorAdd_100k, currentTime);
        currentTime = methods.iteratorAddMethodInHashSet(VALUE_1M);
        results.saveResult(TypeCollections.HashSetIteratorAdd_1M, currentTime);

        // iteratorRemove() function in HashSet<>
        currentTime = methods.iteratorRemoveMethodInHashSet(VALUE_10k);
        results.saveResult(TypeCollections.HashSetIteratorRemove_10k, currentTime);
        currentTime = methods.iteratorRemoveMethodInHashSet(VALUE_100k);
        results.saveResult(TypeCollections.HashSetIteratorRemove_100k, currentTime);
        currentTime = methods.iteratorRemoveMethodInHashSet(VALUE_1M);
        results.saveResult(TypeCollections.HashSetIteratorRemove_1M, currentTime);
    }

    public void calculateTreeSet() {
        double currentTime = 0;

        // add() function in TreeSet<>
        currentTime = methods.addMethodInTreeSet(VALUE_10k);
        results.saveResult(TypeCollections.TreeSetAdd_10k, currentTime);
        currentTime = methods.addMethodInTreeSet(VALUE_100k);
        results.saveResult(TypeCollections.TreeSetAdd_100k, currentTime);
        currentTime = methods.addMethodInTreeSet(VALUE_1M);
        results.saveResult(TypeCollections.TreeSetAdd_1M, currentTime);

        // get() function in TreeSet<>
        currentTime = methods.getMethodInTreeSet(VALUE_10k);
        results.saveResult(TypeCollections.TreeSetGet_10k, currentTime);
        currentTime = methods.getMethodInTreeSet(VALUE_100k);
        results.saveResult(TypeCollections.TreeSetGet_100k, currentTime);
        currentTime = methods.getMethodInTreeSet(VALUE_1M);
        results.saveResult(TypeCollections.TreeSetGet_1M, currentTime);

        // remove() function in TreeSet<>
        currentTime = methods.removeMethodInTreeSet(VALUE_10k);
        results.saveResult(TypeCollections.TreeSetRemove_10k, currentTime);
        currentTime = methods.removeMethodInTreeSet(VALUE_100k);
        results.saveResult(TypeCollections.TreeSetRemove_100k, currentTime);
        currentTime = methods.removeMethodInTreeSet(VALUE_1M);
        results.saveResult(TypeCollections.TreeSetRemove_1M, currentTime);

        // containts() function in TreeSet<>
        currentTime = methods.containtsMethodInTreeSet(VALUE_10k);
        results.saveResult(TypeCollections.TreeSetContaints_10k, currentTime);
        currentTime = methods.containtsMethodInTreeSet(VALUE_100k);
        results.saveResult(TypeCollections.TreeSetContaints_100k, currentTime);
        currentTime = methods.containtsMethodInTreeSet(VALUE_1M);
        results.saveResult(TypeCollections.TreeSetContaints_1M, currentTime);

        // populate function in TreeSet<>
        currentTime = methods.populateMethodInTreeSet(VALUE_10k);
        results.saveResult(TypeCollections.TreeSetPopulate_10k, currentTime);
        currentTime = methods.populateMethodInTreeSet(VALUE_100k);
        results.saveResult(TypeCollections.TreeSetPopulate_100k, currentTime);
        currentTime = methods.populateMethodInTreeSet(VALUE_1M);
        results.saveResult(TypeCollections.TreeSetPopulate_1M, currentTime);

        // iteratorAdd() function in TreeSet<>
        currentTime = methods.iteratorAddMethodInTreeSet(VALUE_10k);
        results.saveResult(TypeCollections.TreeSetIteratorAdd_10k, currentTime);
        currentTime = methods.iteratorAddMethodInTreeSet(VALUE_100k);
        results.saveResult(TypeCollections.TreeSetIteratorAdd_100k, currentTime);
        currentTime = methods.iteratorAddMethodInTreeSet(VALUE_1M);
        results.saveResult(TypeCollections.TreeSetIteratorAdd_1M, currentTime);

        // iteratorRemove() function in TreeSet<>
        currentTime = methods.iteratorRemoveMethodInTreeSet(VALUE_10k);
        results.saveResult(TypeCollections.TreeSetIteratorRemove_10k, currentTime);
        currentTime = methods.iteratorRemoveMethodInTreeSet(VALUE_100k);
        results.saveResult(TypeCollections.TreeSetIteratorRemove_100k, currentTime);
        currentTime = methods.iteratorRemoveMethodInTreeSet(VALUE_1M);
        results.saveResult(TypeCollections.TreeSetIteratorRemove_1M, currentTime);
    }

}
