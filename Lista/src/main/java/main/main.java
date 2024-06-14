package main;

import dataStructure.LinkedList;

public class main {

    public void main(String[] args){
        LinkedList list = new LinkedList("Elemento 1");
        list.append("Elemento 2");
        list.append("Elemento 3");
        list.prePend("Elemento novo");
        list.insert(3, "elemento 2,5");
        list.remove(2);

//        System.out.println(list.removeFirst());
//        System.out.println(list.removeLast());
//        list.getHead();
//        list.getTail();
//        list.getLength();
 //       System.out.println(list.get(2));
 //       list.set(1,"elemento 0.5");
        list.print();
    }
}
