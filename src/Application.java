import java.util.ArrayList;
import java.util.List;

/**
 * Created by aziarkash on 14-1-2016.
 */
public class Application {

    public static void main(String[] args) {

        stringMethods();

        oneDimensionalArrays();

        multiDimensionalArrays();

        arrayListMethods();

    }

    private static void arrayListMethods(){

        // ArrayList methods to remember for OCA Exam:
        // - add(element)
        // - add(element, index)
        // - clear()
        // - contains()
        // - get(index)
        // - indexOf()
        // - remove(index)
        // - remove(object)
        // - size()

        int xx = 12;
        String s = "s";
        List list = new ArrayList<>();
        list.add(xx);
        list.add(s);
        list.add(29);
        list.add(1, "Quasar");
        System.out.println("ArrayList content\t:\t" + list);

        boolean bool = list.contains("Quasar");
        System.out.println("Does the list contain 'Quasar'\t:\t" + bool);

        addSeparator();
    }

    private static void multiDimensionalArrays(){
        String[][] myNewStrings = new String[3][2];
        myNewStrings[0][0] = "a";
        myNewStrings[1][0] = "b";
        myNewStrings[2][0] = "c";
        System.out.println("Reversed order of the multi dimension array\t:\t" + myNewStrings[2][0] + myNewStrings[1][0] + myNewStrings[0][0]);

        Animal[][][] anotherArray = new Animal[][][]{{{new Animal(), new Dog(), new Dog()}}};

        Animal[][][][] animals = {{{new Dog[]{new Dog(), new Dog()}}}};

        addSeparator();
    }

    private static void oneDimensionalArrays(){
        String[] myStrings = new String[3];
        myStrings[0] = "a";
        myStrings[1] = "b";
        myStrings[2] = "c";
        System.out.println("Values in myString[] array\t:\t[" + myStrings[0] + myStrings[1] + myStrings[2] + "]");

        String[] myStringsArr = new String[]{"a","b","c"};

        String[] myStringsArr1 = {"a","b","c"};

        addSeparator();
    }

    private static void stringMethods(){

        // String methods to remember for OCA Exam
        // - charAt()               - concat()
        // - equalsIgnoreCase()     - length()
        // - replace()              - substring()
        // - toLowerCase()          - toUpperCase()
        // - toString()             - trim()

        String helloWorld = "  Hello World  ";
        System.out.println("String BEFORE using trim method\t:" + helloWorld);

        String trimmedHelloWorld = helloWorld.trim();
        System.out.println("String AFTER using trim method\t:" + trimmedHelloWorld);

        String subString = trimmedHelloWorld.substring(2, 5);
        System.out.println("Show me the string from index 2 to 5(exclusive)\t:\t" + subString);

        String replacedHello = trimmedHelloWorld.replaceAll("Hello", "Quasar");
        System.out.println("Replace Hello with Quasar using replaceAllMethod()\t:\t" + replacedHello);

        addSeparator();
    }

    private static void addSeparator(){
        System.out.println("----------------------------------------------------------------------------------------------------------");
    }
}

class Animal {

}

class Dog extends Animal {

}