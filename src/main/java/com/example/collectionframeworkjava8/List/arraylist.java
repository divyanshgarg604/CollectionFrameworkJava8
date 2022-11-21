package com.example.CollectionFrameworkJava8.list;

import java.util.*;

public class arraylist extends ArrayList<Integer> {
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
        arr.forEach(number -> {
            System.out.println("Number = " + number);
        });
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


        /**
         * Increases the capacity of this ArrayList instance, if necessary,
         * to ensure that it can hold at least the number of elements specified by the minimum capacity
         * argument.
         */
        try {

            // ensure that the ArrayList
            // can hold upto 5000 elements
            // using ensureCapacity() method
            arr.ensureCapacity(5000);

            // Print
            System.out.println("ArrayList can now surely store upto 5000 elements.");
        } catch (NullPointerException e) {
            System.out.println("Exception thrown : " + e);
        }

        /**
         *  forEach() Performs the given action for each element of the Iterable until all elements
         *  have been processed or the action throws an exception.
         */

        arr.forEach(number -> {
            System.out.println("Number = " + number);
        });

        /**
         * Returns the element at the specified position in this list.
         */
        System.out.println("the element at index 2 is: "+arr.get(2));

        /**
         * The index the first occurrence of a specific element is either returned,
         * or -1 in case the element is not in the list.
         */
        // using indexOf() to find index of 3
        int pos =arr.indexOf(3);
        System.out.println("The element 3 is at index : " + pos);

        /**
         * Returns true if this list contains no elements.
         */
        // check if the list is empty or not using function
        boolean result = arr.isEmpty();
        if (result) {
            System.out.println("The ArrayList is empty");
        }
        else {
            System.out.println("The ArrayList is not empty");
        }

        /**
         *The index of the last occurrence of a specific element is either returned or -1
         * in case the element is not in the list.
         */

        int element = arr.lastIndexOf(30);
        if (element != -1) {
            System.out.println("the lastIndexof of 30 is " + element);
        }
        else {
            System.out.println("30 is not present in the list");
        }

        /**
         * Returns a list iterator over the elements in this list (in proper sequence).
         */
        try {
            // Creating object of ListIterator<String>
            // using listIterator() method
            ListIterator<Integer> iterator = arr.listIterator();

            // Printing the iterated value
            while (iterator.hasNext()) {
                System.out.println("Value is : " + iterator.next());
            }
        }catch (NullPointerException e){
            System.out.println("Exception thrown : " + e);
        }
        /**
         * Returns a list iterator over the elements in this list (in proper sequence),
         * starting at the specified position in the list.
         */
        try {

            // getting iterated value starting from index 2
            // using listIterator() method
            ListIterator<Integer> iterator = arr.listIterator(2);

            // Printing the iterated value
            System.out.println("Using ListIterator from Index 2:");
            while (iterator.hasNext()) {
                System.out.println("Value is : " + iterator.next());
            }
        }catch (IndexOutOfBoundsException e){
            System.out.println("Exception thrown : " + e);
        }

        /**
         * remove?(int index)--> Removes the element at the specified position in this list.
         * remove?(Object o)--> Removes the first occurrence of the specified element from this list, if it is present.
         */
        System.out.println("Unmodified List");
        arr.forEach(number -> {
            System.out.println("Number = " + number);
        });

        arr.remove(1);

        System.out.println("Modified List");
        arr.forEach(number -> {
            System.out.println("Number = " + number);
        });

        /**
         * removeAll?(Collection c)-->Removes from this list all of its elements that are contained
         * in the specified collection.
         */

        System.out.println("Unmodified arr1  List");
        arr.forEach(number -> {
            System.out.println("Number = " + number);
        });

        System.out.println("Unmodified arr2  List");
        arr2.forEach(number -> {
            System.out.println("Number = " + number);
        });

        arr.removeAll(arr2);

        System.out.println("Modified List");
        arr.forEach(number -> {
            System.out.println("Number = " + number);
        });

        /**
         * removeIf?(Predicate filter)-->Removes all of the elements of this collection
         * that satisfy the given predicate.
         */

        arr.add(23);
        arr.add(32);
        arr.add(45);
        arr.add(63);

        System.out.println("Unmodified arr  List");
        arr.forEach(number -> {
            System.out.println("Number = " + number);
        });

        // apply removeIf() method
        // we are going to remove numbers divisible by 3
        arr.removeIf(n -> (n % 3 == 0));

        System.out.println("Modified List");
        arr.forEach(number -> {
            System.out.println("Number = " + number);
        });

        /**
         * removeRange?(int fromIndex, int toIndex)-->Removes from this list all the elements
         * whose index is between fromIndex, inclusive, and toIndex, exclusive.
         *
         *  Note : removeRange(int fromIndex, int toIndex) method is protected method in ArrayList.
         *  A protected method is accessed in class, subclasses and in a package, but not public.
         *  Therefore, we extend the class to arraylist.
         */
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(12);
        arr.add(9);
        arr.add(13);

//        System.out.println("Unmodified arr  List");
//        arr.forEach(number -> {
//            System.out.println("Number = " + number);
//        });
//
//        // removing range of 1st and 2nd elements
//        arr.removeRange(0,2);
//        System.out.println("Modified List");
//        arr.forEach(number -> {
//            System.out.println("Number = " + number);
//        });


        /**
         * Retains only the elements in this list that are contained in the specified collection.
         */

        System.out.println("Unmodified arr1  List");
        arr.forEach(number -> {
            System.out.println("Number = " + number);
        });

        System.out.println("Unmodified arr2  List");
        arr2.forEach(number -> {
            System.out.println("Number = " + number);
        });

        arr.retainAll(arr2);

        System.out.println("Modified List");
        arr.forEach(number -> {
            System.out.println("Number = " + number);
        });

        /**
         * Replaces the element at the specified position in this list with the specified element.
         */
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(12);
        arr.add(9);
        arr.add(13);
        System.out.println("Unmodified List");
        arr.forEach(number -> {
            System.out.println("Number = " + number);
        });

        arr.set(0,4);

        System.out.println("Modified List");
        arr.forEach(number -> {
            System.out.println("Number = " + number);
        });

        /**
         * Returns the number of elements in this list.
         */
        System.out.println("arr size(): "+arr.size());


        /**
         * Creates a late-binding and fail-fast Spliterator over the elements in this list.
         *
         * Note:Spliterator.forEachRemaining() method works in the same way as ArrayList.foreach()
         * but it provides better performance.
         */
        // create an ArrayList which contains
        // emails for a group of people
        ArrayList<String> list = new ArrayList<String>();

        // Add emails to list
        list.add("divyansh.garg@geminisoltuions.com");
        list.add("divyansh.garg@geminisoltuions.com");
        list.add("divyansh.garg@geminisoltuions.com");
        list.add("divyansh.garg@geminisoltuions.com");
        list.add("divyansh.garg@geminisoltuions.com");

        // create Spliterator of ArrayList
        // using spliterator() method
        Spliterator<String> emails = list.spliterator();

        // print result from Spliterator
        System.out.println("list of Emails:");

        // forEachRemaining method of Spliterator
        emails.forEachRemaining((n) -> System.out.println(n));

        /**
         *Returns a view of the portion of this list between the specified
         *  fromIndex, inclusive, and toIndex, exclusive.
         */

        System.out.println("Original List");
        arr.forEach(number -> {
            System.out.println("Number = " + number);
        });
        try {

            // getting the subList
            // using subList() method
            List<Integer> arrlist2 = arr.subList(2, 4);


            System.out.println("Sublist of arr List");
            arrlist2.forEach(number -> {
                System.out.println("Number = " + number);
            });
        } catch (IndexOutOfBoundsException | IllegalArgumentException e) {
            System.out.println("Exception is "+e);
        }

        /**
         * 	toArray()-->This method is used to return an array containing all the elements
         * 	in the list in the correct order.
         */
        Integer[] arr3 = new Integer[arr.size()];
        arr3 = arr.toArray(arr3);
        Arrays.stream(arr3).forEach(number -> {
            System.out.println("Number = " + number);
        });


        // ArrayList to Array Conversion of primitive int type
        int[] arr4 = arr.stream().mapToInt(i -> i).toArray();
        Arrays.stream(arr4).forEach(number -> {
            System.out.println("Number = " + number);
        });

        /**
         * trimToSize()-->This method is used to trim the capacity of the instance of the ArrayList
         * to the list’s current size.
         */
        // creating an Empty Integer ArrayList
        ArrayList<Integer> arr5 = new ArrayList<Integer>(9);

        // using add(), add 5 values
        arr5.add(2);
        arr5.add(4);
        arr5.add(5);
        arr5.add(6);
        arr5.add(11);

        // trims the size to the number of elements
        arr5.trimToSize();

        System.out.println("The List elements are:");

        // prints all the elements
        arr5.forEach(number -> {
            System.out.println("Number = " + number);
        });


    }

}
