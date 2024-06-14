package main;

import dataStructure.LinkedList;

public class main {

    public void main(String[] args){
        LinkedList list = new LinkedList("Elemento 1");
        list.append("Elemento 2");
        list.append("Elemento 3");
        list.getHead();
        list.getTail();
        list.getLength();
        list.print();
    }
}
