package main;

import implementation.Stack;

public class main{
    public static void main(String[] args) {
//        Stack myStack = new Stack(4);
//
//        myStack.getTop();
//        myStack.getHeight();
//        myStack.print();
//        myStack.push(1);
//        myStack.print();
//        myStack.pop();
//        myStack.print();
        int[] numeros = {5, 4, 3, 2, 1};
        inverter(numeros);
    }
        private static void inverter(final int[] numeros){
            Stack stack = new Stack(numeros[0]);
            for (int i=1;i < numeros.length;i++){
                stack.push(numeros[i]);
            }
            var node = stack.pop();
            while (node != null){
                System.out.println(node.getValue());
                node = stack.pop();
            }



    }
}
