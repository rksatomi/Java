package implementation;

public class Queue {
    private  Node first;
    private  Node last;
    private int length;
    public class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }
        public Queue(int value){
            Node newNode = new Node(value);
            first = newNode;
            last = newNode;
            length++;
        }

        public void getFirst(){
            if (first !=null){
                System.out.println("First:  " + first.value);
            }else {
                System.out.println("Fila está vazia");
            }
        }
        public void getLast(){
            if (last !=null){
                System.out.println("Last:  " + last.value);
            }else {
                System.out.println("Fila está vazia");
            }
        }

        public void getLenght(){
                System.out.println("Lenght:  " + length);
        }
        public void print(){
            Node temp = first;
            System.out.println("###########");
            while (temp !=null) {
                System.out.println(temp.value);
                temp = temp.next;
            }
            System.out.println("###########");
        }

        public void enqueue(int value){
            Node newNode = new Node(value);
            if (length == 0){
                first = newNode;
                last = newNode;
            }else {
                last.next = newNode;
                last = newNode;
            }
            length++;
        }

        public Node dequeue(){
            if (length == 0) return null;
            Node temp = first;
            if (length == 1) {
                first = null;
                last = null;
            }else{
                first = first.next;
                temp.next=null;
            }
            length--;
            return temp;
        }




}
