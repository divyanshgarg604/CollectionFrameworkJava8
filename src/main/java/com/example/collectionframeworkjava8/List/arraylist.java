package com.example.collectionframeworkjava8.List;

import java.util.ArrayList;

public class arraylist {
    public static void main(String[] args) {

        // create an empty array list with an initial capacity
        ArrayList<Integer> arr = new ArrayList<>(5);

        /**
         * boolean add(Object o) : This method appends the specified element to the end of this list.
         */
        arr.add(15);
        arr.add(20);
        arr.add(25);

        // prints all the elements available in list
        for (Integer number : arr) {
            System.out.println("Number = " + number);
        }

        /**
         * void add(int index, Object element) : This method inserts the specified element E
         * at the specified position in this list.It shifts the element currently at that position
         * (if any) and any subsequent elements to the right (will add one to their indices).
         */

        arr.add(3, 35);
        // let us print all the elements available in list
        arr.forEach(number -> {
            System.out.println("Number = " + number);
        });

        /**
         * boolean addAll(Collection c) : This method appends all the elements in the specified collection to the end of this list,
         * in the order that they are returned by the specified collection’s Iterator.
         * The behavior of this operation is undefined if the specified collection is modified while the operation is in progress
         * (implies that the behavior of this call is undefined if the specified collection is this list, and this list is nonempty).
         */
        ArrayList<Integer> arr2 = new ArrayList<>(5);

        // use add() method to add elements in list2
        arr2.add(25);
        arr2.add(30);
        arr2.add(31);
        arr2.add(35);

        // inserting all elements of list2 at third
        // position
        arr.addAll(2, arr2);

        System.out.println("Printing all the elements");

        // prints all the elements available in list1
        arr.forEach(number -> {
            System.out.println("Number = " + number);
        });

        /**
         * The clear() method of ArrayList in Java is used to remove all the elements from a list.
         */

        // Clearing off elements
        // using clear() method
        arr.clear();

        // Displaying ArrayList elements
        // after using clear() method
        System.out.println(
                "The list after using clear() method: " + arr);

        /**
         * This method is used to return a shallow copy of an ArrayList.
         */
        arr= (ArrayList<Integer>) arr2.clone();

        // prints all the elements available in list1 which are cloned from list2
        arr.forEach(number -> {
            System.out.println("Number = " + number);
        });


        /**
         * 	Returns true if this list contains the specified element.
         */

        // use contains() to check if the element
        // 30 exits or not
        boolean ans = arr.contains(30);

        if (ans) {
            System.out.println("The list contains 30");
        }
        else {
            System.out.println("The list does not contains 30");
        }



    }

}
