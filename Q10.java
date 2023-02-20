 class Pair<T, U>
 {
    private T first;
    private U second;

    public Pair(T e1, U e2) {
        first = e1;
        second = e2;
    }

    public T getFirst() {
        return first;
    }

    public void setFirst(T e1) {
        first = e1;
    }

    public U getSecond() {
        return second;
    }

    public void setSecond(U e2) {
        second = e2;
    }

    @Override
    public String toString() {
        return "(" + first + ", " + second + ")";
    }
}

public class Q10
{
    public static void main(String[] args) {
        Pair<String, Integer> myPair = new Pair<>("Hello", 42);
        Pair<Integer, Integer> myPair2 = new Pair<>(32, 42);
        System.out.println(myPair.toString());
        System.out.println(myPair2.toString());

    }
}