package com.example.collectionframeworkjava8.List;

public class ArrayList1 {
    public static void main(String[] args) {

        // create an empty array list with an initial capacity
        ArrayList1 arrlist = new ArrayList1;

        // use add() method to add elements in the list
        arrlist.add(15);
        arrlist.add(20);
        arrlist.add(25);

        // prints all the elements available in list
        for (Integer number : arrlist) {
            System.out.println("Number = " + number);
        }
    }

}
