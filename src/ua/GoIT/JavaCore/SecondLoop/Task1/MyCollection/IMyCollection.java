package ua.GoIT.JavaCore.SecondLoop.Task1.MyCollection;

public interface IMyCollection {

    public void populateCollection();

    public void addFirst(Integer value);

    public void addByIndex(int index, Integer value);

    public void addLast(Integer value);

    public void removeByIndex(int index);

    public void removeByValue(Integer value);

    public Integer get(int index);

    public Integer size();

}
