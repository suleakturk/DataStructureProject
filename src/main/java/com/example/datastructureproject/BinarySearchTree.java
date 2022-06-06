package com.example.datastructureproject;
import javafx.scene.control.TextArea;

/*
This Binary Search Tree was created for sorting employees
by position.
 */
public class BinarySearchTree {
    NodeBST root;

    void insert(int key, String value) {
        root = insertRec(root, key, value);
    }
    NodeBST insertRec(NodeBST root, int key, String value)
    {
        if (root == null) {
            root = new NodeBST(key, value);
            return root;
        }
        //left subtree
        if (key < root.data)
            root.left = insertRec(root.left, key, value);
        //rigth subtree
        else if (key > root.data)
            root.right = insertRec(root.right, key, value);

        return root;
    }

    //this method sorting employees with in-order traversing.
    public void inorder(NodeBST root, TextArea textArea){
        if (root != null)
        {
            inorder(root.left,textArea);
            /*This method is used for printing position and other informations about employees
            into the text area.
             */
            ShowBonusController.showPositionList(root.data,root.value,textArea);
            inorder(root.right,textArea);
        }
    }
}
