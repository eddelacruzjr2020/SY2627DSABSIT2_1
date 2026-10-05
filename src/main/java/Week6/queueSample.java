/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Week6;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.PriorityBlockingQueue;

/**
 *
 * @author Edmundo Dela Cruz
 */
public class queueSample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Queue q = new PriorityBlockingQueue();
        q.add("Ed");
        q.add(25);
        q.add(true);
        q.add(null);
        
        System.out.println("Queue "+q);
        
        while(!q.isEmpty()){
            System.out.println(q.poll());
        }
        
        
        System.out.println("Element to remove "+q.poll());
        System.out.println("Queue "+q);
        
        
    }
    
}
