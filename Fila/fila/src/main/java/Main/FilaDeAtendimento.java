package Main;

import implementation.Queue;

import java.util.Random;

public class FilaDeAtendimento {
    public static void main (String[] args){
        int n = 5;
        var randon = new Random();
        int cliente = randon.nextInt(101);
        Queue queue = new Queue(cliente);
        System.out.println("Chegou novo cliente" + cliente);
        for (int i = 2 ; i <= n ; i++){
            cliente = randon.nextInt(101);
            System.out.println("Chegou o cliente: " + cliente);
            queue.enqueue(cliente);
        }
        var node = queue.dequeue();
        while (node != null){
            System.out.println("Atendimento do cliente: " + node.getValue());
            node = queue.dequeue();
        }
    }


}
