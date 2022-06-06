package com.example.datastructureproject;

//This Node was created for Binary Search Tree.
public class NodeBST {
    public int data; //it keeps positions of employees
    public String value; //it keeps other informations of employees(name-surname..)
    public NodeBST left;
    public NodeBST right;

    public NodeBST(int data, String value) {
        this.data = data;
        this.value = value;
        this.left = null;
        this.right = null;
    }
}
