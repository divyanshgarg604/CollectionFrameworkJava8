package com.example.collectionframeworkjava8.List.LinkedList;

public class Linked {

    Node head;
    public class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    public void addFirst(String data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void addLast(String data) {
        Node newNode = new Node(data);

        if(head == null) {
            head = newNode;
            return;
        }

        Node lastNode = head;
        while(lastNode.next != null) {
            lastNode = lastNode.next;
        }

        lastNode.next = newNode;
    }

    public void printList() {
        Node currNode = head;

        while(currNode != null) {
            System.out.print(currNode.data+" -> ");
            currNode = currNode.next;
        }

        System.out.println("null");
    }

    public int getSize() {
        int size = 0;
        Node currNode = head;

        while(currNode != null) {
            currNode = currNode.next;
            size++;
        }

        return size;
    }

    public static void main(String args[]) {


        Linked list =new Linked();
        list.addLast("is");
        list.addLast("a");
        list.addLast("list");
        list.printList();

        list.addFirst("this");
        list.printList();
        System.out.println(list.getSize());

    }


    }
