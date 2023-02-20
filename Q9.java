import java.util.*;
import java.util.Iterator;

 class MyList {
    private List<Integer> elements = new ArrayList<>();

    public void addElement(int element) {
        elements.add(element);
    }

    public void removeElement(int element) {
        elements.remove(element);
    }

    public int getSize() {
        return elements.size();
    }

    public boolean contains(int element) {
        return elements.contains(element);
    }

    public Integer getElement(int i) {
        return elements.get(i);
    }
}

class Myset
{
    private Set<Integer> elements = new HashSet<Integer>();
    public void addElement(Integer element) {
        elements.add(element);
    }

    public void removeElement(Integer element) {
        elements.remove(element);
    }

    public int getSize() {
        return elements.size();
    }

    public boolean contains(Integer element) {
        return elements.contains(element);
    }


}


 class MyMap {
    private Map<String, Integer> elements = new HashMap<>();

    public void addElement(String key, int value) {
        elements.put(key, value);
    }

    public void removeElement(String key) {
        elements.remove(key);
    }

    public int getSize() {
        return elements.size();
    }

    public boolean containsKey(String key) {
        return elements.containsKey(key);
    }

    public int getElement(String key) {
        return elements.get(key);
    }

    public void getValues(){
        System.out.println(elements.values());
    }
}

public class Q9
{
    public static void main(String a[]) {

        //LISTS
        MyList obj = new MyList();
        obj.addElement(2);
        obj.addElement(3);
        obj.addElement(4);
        obj.addElement(25);
        //removing element at index 2
        obj.removeElement(2);
        //travesring the list
        System.out.println("is 3 present in the list"+obj.contains(3));
        for(int i=0;i< obj.getSize();i++)
        System.out.println(obj.getElement(i));



        //SETS
        Myset obj1 = new Myset();
        obj1.addElement(2);
        obj1.addElement(3);
        obj1.addElement(4);
        obj1.addElement(25);
        //removing element at index 2
        obj1.removeElement(2);
        //checking for element
        System.out.println("is 3 present in the set"+obj1.contains(3));

        //MAPS
        MyMap obj2 = new MyMap();
        obj2.addElement("teja",3);
        obj2.addElement("adarsh",7);
        obj2.addElement("sunny",4);
        obj2.addElement("sastry",25);
        //removing element at index 2
        obj2.removeElement("sunny");
        //travesring the map
        System.out.println("is teja present in the map"+obj2.containsKey("teja"));
        //Printing values
        obj2.getValues();


    }
}