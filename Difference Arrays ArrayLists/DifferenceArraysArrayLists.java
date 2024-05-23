//import java.util.Arrays;
import java.util.ArrayList;

/*
 * Design one new project called Difference-Arrays-ArrayLists (in your IDE),
 * design and add java codes in this project to demonstrate these differences.
 * Add comments in your source code to demonstrate the differences between array and ArrayList.  
 */

public class DifferenceArraysArrayLists 
{
    public static void main(String[] args)
    {
        // Initializes array1 with 5 values, cannot be done using arraylists
        int[] array1 = {2, 4, 6, 8, 10}; 
        // used to keep track of how many elements are filled.
        int array1CurrentSize = 5;

        // initializes array2 with a size of 5
        int[] array2 = new int[6]; 
        // Used to keep track of how many elements are filled
        int array2CurrentSize = 0;

        // Filling the array with values. Use [] operator to locate the element to be filled witht the value
        // Can only add 5 values since the array size is 5
        array2[0] = 1;
        array2CurrentSize++;
        array2[1] = 3;
        array2CurrentSize++;
        array2[2] = 5;
        array2CurrentSize++;
        array2[3] = 7;
        array2CurrentSize++;
        array2[4] = 9;
        array2CurrentSize++;
        array2[5] = 11;
        array2CurrentSize++;

        // initializing to partially fill
        int[] array3 = new int[10];

        // counter for the partial array to see how many elements are filled.
        int array3CurrentSize = 0;
        // Algorithm to partially fill the array.
        for(int i = 0; i <= 5; i++)
        {
            array3[i] = i + 1;
            array3CurrentSize++;
        }
    

        // Using wrapping to initialize an array list with integers.
        // Cannot initialze with values already in place
        ArrayList<Integer> arrayList1 = new ArrayList<Integer>();

        // Filling the array list with values, use add method. can add as many values as I need
        // Parentheses are used instread of braces.
        arrayList1.add(10);
        arrayList1.add(8);
        arrayList1.add(6);
        arrayList1.add(4);
        arrayList1.add(2);

        ArrayList<Integer> arrayList2 = new ArrayList<Integer>();

        for(int i = 0; i <= 10; i++)
        {
            arrayList2.add(i + 5);
        }

        System.out.println("Printing the contents of the arrays\n");

        // Arrays
        System.out.println("Array 1");
        for(int values1 : array1)
        {
            System.out.print(values1 + ", ");
        }

        System.out.println("\n\nArray 2");
        for(int values2 : array2)
        {
            System.out.print(values2 + ", ");
        }

        System.out.println("\n\nArray 3");
        for(int values3 : array3)
        {
            System.out.print(values3 + ", ");
        }

        System.out.println("\n\nPrinting the values of the array lists");

        // Array lists
        System.out.println("\nArray list 1");
        for(int values4 : arrayList1)
        {
            System.out.print(values4 + ", ");
        }

        System.out.println("\n\nArray list2");
        for(int values5 : arrayList2)
        {
            System.out.print(values5 + ", ");
        }

        System.out.println("\nPrinting the size of the arrays and arraylists");

        // Use .length tp get the size of an array
        System.out.println("\n Arrays use .length to get it's size");
        System.out.println("  The size of array 1 is: " + array1.length);
        System.out.println("  The size of array 2 is: " + array2.length);
        System.out.println("  The size of array 3 is: " + array3.length);

        // Use size method to get the size of an array list
        System.out.println("\n Array lists use size() to get its size");
        System.out.println("  The size of array list 1 is: " + arrayList1.size());
        System.out.println("  The size of array list 2 is : " + arrayList2.size());

        System.out.println("\nPrinting the third element of the arrays and array lists");

        // Pring the third element of each array using [] operators
        System.out.println("\n Arrays use the [] operator to access a specific element");
        System.out.println("  The value of the third element of array 1 is: " + array1[2]);
        System.out.println("  The value of the third element of array 2 is: " + array2[2]);
        System.out.println("  The value of the third element of array 3 is: " + array3[2]);

        // Print the third element of the array list useing the get method
        System.out.println("\n Array lists use get() to access a specific element");
        System.out.println("  The value of the third element of array list 1 is: " + arrayList1.get(2));
        System.out.println("  The value of the third element of array list 2 is: " + arrayList2.get(2));

        System.out.println("\nPrinting the number of filled elements in the arrays and array lists");

        // To get the number of filled elements in an array use a companion variable
        System.out.println("\n Arrays use a companion variable to count filled elements");
        System.out.println("  Array 1 has " + array1CurrentSize + " out of " + array1.length + " elements filled");
        System.out.println("  Array 2 has " + array2CurrentSize + " out of " + array2.length + " elements filled");
        System.out.println("  Array 3 has " + array3CurrentSize + " out of " + array3.length + " elements filled");

        // To get the number of filled elements in an array list use size method beacuse the number of filled elements is the same as the size
        System.out.println("\n Array lists use size() to get the number of filled variables");
        System.out.println("  Array list 1 has " + arrayList1.size() + " elements filled which is the same as its size");
        System.out.println("  Array list 2 has " + arrayList2.size() + " elements filled which is the same as its size");
        
    }
}
