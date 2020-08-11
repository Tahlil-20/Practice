package com.datastructure.tree;

public class BinarySearchTree {

    NodeForBST root;

    public void insertIntoBST(int key){
        root = insertRec(root, key);
    }

    public void inorderTraversal(){
        inorderRec(root);
    }
    public void preorderTraversal(){
        preorderRec(root);
    }
    public void postorderTraversal(){
        postorderRec(root);
    }

    public NodeForBST insertRec(NodeForBST root, int key){
        if(root == null){
            NodeForBST node = new NodeForBST(key);
            return node;
        }else{
            if(key<root.key){
                root.left = insertRec(root.left, key);
            }else if(key>root.key){
                root.right = insertRec(root.right, key);
            }
        }
        return root;
    }

    public void inorderRec(NodeForBST root){
        if(root != null){
            inorderRec(root.left);
            System.out.println(root.key);
            inorderRec(root.right);
        }
    }
    public void postorderRec(NodeForBST root){
        if(root != null) {
            postorderRec(root.left);
            postorderRec(root.right);
            System.out.println(root.key);
        }
    }
    public void preorderRec(NodeForBST root){
        if(root != null) {
            System.out.println(root.key);
            preorderRec(root.left);
            preorderRec(root.right);
        }
    }
}
