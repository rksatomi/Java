package main;

import implementation.Stack;

public class main{
    public static void main(String[] args) {
        Stack myStack = new Stack(4);

        myStack.getTop();
        myStack.getHeight();
        myStack.print();
        myStack.push(1);
        myStack.print();
        myStack.pop();
        myStack.print();
    }
}
