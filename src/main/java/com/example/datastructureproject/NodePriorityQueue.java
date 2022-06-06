package com.example.datastructureproject;

//this Node was created for Priority Queue.
public class NodePriorityQueue {
    public Person person;
    public int priority;
    public NodePriorityQueue next;

    public NodePriorityQueue(Person person, int priority) {
        this.person = person;
        this.priority = priority;
        this.next = null;
    }
}
