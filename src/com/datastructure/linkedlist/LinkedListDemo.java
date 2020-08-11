package com.datastructure.linkedlist;

public class LinkedListDemo {
    public static void main(String [] args){
        LinkedList list = new LinkedList();
        list.insertAtBeginning(list, 1);
        list.insertAtBeginning(list, 89);
        list.insertAtBeginning(list, 99);
        list.insertAtBeginning(list,22);
        list.insertAtEnd(list, 46);
        //list.deleteFirstOccurance(list, 46);
        //list.reverseLinkedList(list);
        System.out.println("Reversed List");
        list.printList(list);
        LinkedList list2 = new LinkedList();
        list2.insertAtBeginning(list2, 60);
        list2.insertAtBeginning(list2, 39);
        list2.insertAtBeginning(list2, 28);
        list2.insertAtBeginning(list2,19);
        list2.insertAtEnd(list2, 33);
        System.out.println("Sum of List");
        list.addTwoLinkedList(list, list2);
    }
}
