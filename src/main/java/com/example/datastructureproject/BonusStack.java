package com.example.datastructureproject;

/*This stack was created for bonus distribution
 and keeps bonuses inside the structure
 */
public class BonusStack {
    Node head;

    //For adding bonus into the stack
    public void push(int data){
        Node oldHead = head;
        head = new Node(data);
        head.data = data;
        head.next = oldHead;
    }

    //For removing bonus from stack
    public int pop(){
        if (head != null){
            int data = head.data;
            head = head.next;
            return data;
        }
        else {
            return 0;
        }
    }

    //for printing bonuses from reading stack
    public void printStack(){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data+",");
            temp = temp.next;
        }
        System.out.println();
    }
}
