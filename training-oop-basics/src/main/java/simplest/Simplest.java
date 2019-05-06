package simplest;

import java.util.ArrayList;
import java.util.List;

public class Simplest {

    public static int value = 10;
    private final MyClass myReference;

    private static List<Integer> DEFAULT_VALUES = new ArrayList<Integer>();

    private static Simplest a = null;

    static  {
       System.out.println("static init");
       DEFAULT_VALUES.add(10);
       DEFAULT_VALUES.add(8);
       a = new Simplest(2, null);
    }

    private Simplest(int value, MyClass myReference) {
        this.value = value;
        this.myReference = myReference;
    }

    public static Simplest createOneInstanceOfMyself(){
        return new Simplest(1, new MyClass());
    }

    public int getValue() {
        return this.value;
    }

    public MyClass getMyReference() {
        return this.myReference;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Simplest was destroyed");
    }
}
