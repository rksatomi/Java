package dataStructure;

public class LinkedList{

    private Node head;
    private Node tail;
    private int length;

    class Node{
        String data;
        Node next;
        Node(String data){
            this.data = data;
        }
    }

    public LinkedList(String data){
        length = 1;
        Node newNode = new Node(data);
        head = newNode;
        tail = newNode;
    }

    public void getHead(){
        if (this.head == null){
            System.out.println("Lista vazia");
        }else {
            System.out.println("Head: " + head.data);
        }
    }
    public void getTail(){
        if (this.tail == null){
            System.out.println("Lista vazia");
        }else {
            System.out.println("Tail: " + tail.data);
        }
    }
    public void getLength(){
        System.out.println("Length: " + this.length);
    }

    public void makeEmpty(){
        head = null;
        tail = null;
        length = 0;
    }

    public void print(){
        System.out.println("###########################################3");
        Node temp = this.head;
        while (temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
        System.out.println("###########################################3");
    }

    public void append(String data){
        Node newNode = new Node(data);
        if (length == 0){
            head = newNode;
            tail = newNode;
        }else {
            tail.next = newNode;
            tail = newNode;
        }
        length++;
    }

}






