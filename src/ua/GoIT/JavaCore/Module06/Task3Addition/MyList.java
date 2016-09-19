package src.Module06.Task3Addition;

public class MyList {
    public static void main(String[] args) {
        MyArrayList myArrayList = new MyArrayListImpl();
        myArrayList.add("Name 1");
        myArrayList.add("Name 2");
        myArrayList.add("Name 3");
        myArrayList.add("Name 4");
        myArrayList.add("Name 5");

        System.out.println("Size: " + myArrayList.size());
        System.out.println("Is empty: " + myArrayList.isEmpty());
    }
}
