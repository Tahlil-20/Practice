package com.datastructure.linkedlist;

public class LinkedList {
    Node head;

    public void insertAtBeginning(LinkedList list, int data){
        if(list == null){
            return;
        }else{
            Node newNode = new Node(data);
            newNode.nextNode = list.head;
            list.head = newNode;
        }
        printList(list);
    }

    public void insertAtEnd(LinkedList list, int data){
        if(list == null){
            return;
        }else{
            Node lastNode = list.head;
            while(lastNode.nextNode != null){
                lastNode = lastNode.nextNode;
            }
            lastNode.nextNode= new Node(data);
        }
        printList(list);
    }

    public void deleteFirstOccurance(LinkedList list, int data){
        Node currNode = list.head;
        Node prevNode = null;
        if(currNode != null && currNode.data ==data){
            list.head = currNode.nextNode;
        }else {
            while (currNode != null && currNode.data != data) {
                prevNode = currNode;
                currNode = currNode.nextNode;
            }
            if (currNode != null) {
                prevNode.nextNode = currNode.nextNode;
            }else{
                System.out.println("Data not found");
            }

        }
        printList(list);
    }

    public void printList(LinkedList list){
        Node currnode = list.head;
        while (currnode != null){
            System.out.println(currnode.data);
            currnode = currnode.nextNode;
        }
    }

    public void reverseLinkedList(LinkedList list){
        Node currNode = list.head;
        Node prevNode = null;
        Node nextNode;
        if(currNode.nextNode!= null){
            while(currNode != null){
                nextNode = currNode.nextNode;
                currNode.nextNode = prevNode;
                prevNode = currNode;
                currNode = nextNode;
                }
            currNode.nextNode = prevNode;
            list.head = currNode;
            }

        }

        public void addTwoLinkedList(LinkedList l1, LinkedList l2){
        Node node1 = l1.head;
        Node node2 = l2.head;
        LinkedList resList = null;
        Node prev = null;
        while(node1 != null && node2 != null){
           Node tmp = new Node(node1.data + node2.data);
            if(resList == null){
                resList = new LinkedList();
                resList.head = tmp;
            }else{
                prev.nextNode = tmp;
            }
            prev = tmp;
            if (node1 != null) {
                node1 = node1.nextNode;
            }
            if (node2 != null) {
                node2 = node2.nextNode;
            }
        }
        printList(resList);

        }

    }

