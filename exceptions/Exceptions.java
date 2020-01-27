import java.util.ArrayList;
import java.util.List;

/**
 * Exceptions
 */
public class Exceptions {

    public static void main(String[] args) {
        List<Object> myList = new ArrayList<>();
        myList.add("13");
        myList.add("hello world");
        myList.add(48);
        myList.add("Goodbye World!");

        for (int i = 0; i < myList.size(); i++) {
            try {
                Integer castedValue = (Integer) myList.get(i);
                System.out.println(castedValue);
            } catch (ClassCastException cce) {
                System.err.println(cce.getMessage() + " for index " + i + " with value " + myList.get(i));
            }
        }
    }
}