import java.util.ArrayList;
import java.util.Arrays;

public class ArrayVsArrayList {

    public static void main(String[] args) {

        String[] strarr1 = new String[5];
        String[] strarr2 = {"Ayan","Ashwani","Karthik","Basu","Anik"};

        for (int i=0; i< 5;i++){
            System.out.println("Element in the Array: "+strarr2[i]);
        }

        ArrayList<String> arrlist1 = new ArrayList<>();
        ArrayList<String> arrlist2 = new ArrayList<>(Arrays.asList("Ayan","Ashwani","Karthik","Basu","Anik"));

        //Arrays can hold primitive or objects
        //ArrayList can hold only Objects
        //Need to use get to access arraylist

        for (int i=0; i< 5;i++){
            System.out.println("Element in the Array: "+arrlist2.get(i));
        }

        //Get Size.
        System.out.println("Length of array: "+strarr2.length);
        System.out.println("Length of array: "+arrlist2.size());

        //Add Element
        //You can not add elements to Array but can do to arraylist
        arrlist2.add("Roger");

        //Replacing Element
        strarr2[1] = "Bisley";
        System.out.println(strarr2[1]);

        arrlist2.set(1,"Bisley");
        System.out.println(arrlist2.set(1,"Bisley"));

        //Remove an element
        //Array Fixed Size can not remove

        arrlist2.remove(1);
        System.out.println(arrlist2.get(1));
    }
}
