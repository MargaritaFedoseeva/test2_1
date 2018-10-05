import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class MyClass {
    public static <E> void printArray(E[] elements) {
        for (E element : elements) {
            System.out.print(element+"; ");
        }
        System.out.println();
    }

    public static <E> void maxElementInArray(E[] elements) {
        ArrayList<E> arrayList = new ArrayList<>();
        for (E element : elements) arrayList.add(element);
        System.out.println("Максимальный элемент в массиве: " + Collections.max(arrayList, null));
    }

    public static void main(String args[]) {
        Integer[] intArray = {10, 20, 30, 40, 50};
        Double[] doubleArray = {10.1, 10.2, 30.1, 30.2, 21.001};
        Character[] charArray = {'J', 'A', 'V', 'A', 'T', 'P', 'O', 'I', 'N', 'T'};
        String[] stringArray = {"Наташа", "Женя", "Лера", "Глеб", "Галя"};
        System.out.println("Printing Integer Array");
        printArray(intArray);
        maxElementInArray(intArray);
        System.out.println("Printing Double Array");
        printArray(doubleArray);
        maxElementInArray(doubleArray);
        System.out.println("Printing Character Array");
        printArray(charArray);
        maxElementInArray(charArray);
        System.out.println("Printing String Array");
        printArray(stringArray);
        maxElementInArray(stringArray);
    }
}
