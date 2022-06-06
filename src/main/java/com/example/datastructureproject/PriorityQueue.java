package com.example.datastructureproject;

/*
This Priority Queue was created for keeping informations
about employees and it sorts employees who has more score.
 */
public class PriorityQueue {
    NodePriorityQueue head;

    public void insert(Person person, int score){
        NodePriorityQueue temp = head;
        if (head == null){
            head = new NodePriorityQueue(person,score);
        }
        else {
            NodePriorityQueue newNode = new NodePriorityQueue(person,score);
            if (head.priority < newNode.priority){
                newNode.next = head;
                head = newNode;
            }
            else {
                while (temp.next != null && temp.next.priority > newNode.priority) {
                    temp = temp.next;
                }
                newNode.next = temp.next;
                temp.next = newNode;
            }
        }
    }

    public Person remove() {
        Person person = head.person;
        head = head.next;
        return person;
    }

    public void printQueue(){
        NodePriorityQueue temp = head;
        while (temp != null){
            System.out.print(temp.person.toString()+"\n");
            temp = temp.next;
        }
        System.out.println("------------------------------");
    }

    /*
    This method reads bonuses from the stack and assigns bonuses to employees.
    this reading part happens with "stack.pop()" method.
     */
    public void giveBonus(BonusStack stack){
        NodePriorityQueue temp = head;
        while (temp != null){
            temp.person.setBonus(stack.pop());
            temp = temp.next;
        }
    }
}
