package com.datastructure.tree;

public class BinarySearchTreeDemo {

    public static void main(String [] args){
        BinarySearchTree bst = new BinarySearchTree();
        bst.insertIntoBST(5);
        bst.insertIntoBST(39);
        bst.insertIntoBST(26);
        bst.insertIntoBST(66);
        bst.insertIntoBST(11);
        bst.preorderTraversal();
    }

}
