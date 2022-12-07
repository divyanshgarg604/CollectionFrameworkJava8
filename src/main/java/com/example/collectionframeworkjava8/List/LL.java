package com.example.collectionframeworkjava8.List;

import java.util.*;

public class LL{

    public static void main(String args[])
    {

        // Creating an empty LinkedList of String type
        LinkedList<String> list =new LinkedList();

        // Adding elements in the list
        // using add() method

        list.add("Good");
        list.add("Bad");
        list.add("Akash");

        // Printing the elements of current LinkedList
        list.forEach(name -> {
            System.out.println("Name = " + name);
        });

//   -------------------------------------------------------

        // Adding element at a particular index
        // by passing as an argument
        list.add(2, "Java");

        list.forEach(name -> {
            System.out.println("Name = " + name);
        });

//   -------------------------------------------------------

        Collection<String> collect = new ArrayList<String>();
        collect.add("A");
        collect.add("Computer");
        collect.add("Portal");
        collect.add("for");
        collect.add("Geeks");

        // Displaying the list
        collect.forEach(name -> {
            System.out.println("Name = " + name);
        });

        // Appending the collection to the list
        list.addAll(collect);

        // Clearing the list using clear() and displaying
        list.forEach(name -> {
            System.out.println("Name = " + name);
        });

//   -------------------------------------------------------

        // Adding new elements at the beginning
        list.addFirst("First");
        list.addFirst("At");

        list.forEach(name -> {
            System.out.println("Name = " + name);
        });


//   -------------------------------------------------------

        // Adding new elements at the end
        list.addLast("At");
        list.addLast("Last");

        list.forEach(name -> {
            System.out.println("Name = " + name);
        });


//   -------------------------------------------------------

        // Clearing the list
        list.clear();

        list.forEach(name -> {
            System.out.println("Name = " + name);
        });


//   -------------------------------------------------------

        // Check if the list contains "Hello"
        list.add("Good");
        list.add("Bad");
        list.add("Akash");

        boolean check = list.contains("Akash");

        System.out.println("Does the List contains 'Hello': " + check);

//   -------------------------------------------------------

        // set Iterator as descending
        // using descendingIterator() method
        Iterator x = list.descendingIterator();

        while (x.hasNext()) {
            System.out.println("Value is : " + x.next());
        }

//   -------------------------------------------------------

        // Setting the ListIterator at a specified position
        ListIterator list_Iter = list.listIterator(2);

        // Iterating through the created list from the position
        System.out.println("The list is as follows:");
        while(list_Iter.hasNext()){
            System.out.println(list_Iter.next());
        }


//   -------------------------------------------------------

        // peek at the head of the list
        // Prints 1st element, "Good"
        String result = list.peek();
        System.out.println("Head of the list : " + result);


//   -------------------------------------------------------


        // Displaying the size of the list
        int length =list.size();
        System.out.println("The size of the linked list is: " + length);

//   -------------------------------------------------------



    }


}
