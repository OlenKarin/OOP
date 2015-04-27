package Mittevajalik;

import javafx.scene.Node;

/**
 * Created by merka on 21.04.2015.
 */
public class DoublyLinkedList<Object> {

    private Node first;
    private Node last;
    private int size;
    private Node element;

    public DoublyLinkedList() {
        size = 0;
    }

    private class Node {
        Object element;
        Node next;
        Node prev;

        public Node(Object element, Node next, Node prev) {
            this.element = element;
            this.next = next;
            this.prev = prev;
        }
        public Node(Object o) {
            element = o;
        }



    }

    public int size() { return size; }

    public  Node element(){
        return element;

    }

    public void addLast(Object element) {

        Node tmp = new Node(element, null, last);
        if(last != null) {last.next = tmp;}
        last = tmp;
        if(first == null) { first = tmp;}
        size++;

    }

    public void forward(){


        Node tmp = first;
        while(tmp != null){
            tmp = tmp.next;
        }
    }


    public void backward(){
        Node tmp = last;
        while(tmp != null){
            tmp = tmp.prev;
        }
    }




}

