/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Week7and8;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

/**
 *
 * @author Edmundo Dela Cruz
 */
public class QueueSample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Queue q = new ArrayBlockingQueue<>(3);
        System.out.println("Customer added to queue "+q.offer("Ed"));
        System.out.println("Customer added to queue "+q.offer("DC"));
        System.out.println("Customer added to queue "+q.offer("Test"));
        
        System.out.println("Customer added to queue "+q.offer("DSA"));
        
        Queue q1 = new ArrayBlockingQueue<>(3);
        System.out.println("Customer added to queue "+q1.add("Ed"));
        System.out.println("Customer added to queue "+q1.add("DC"));
        System.out.println("Customer added to queue "+q1.add("Test"));
        
        System.out.println("Customer added to queue "+q1.add("DSA"));
        
        Queue q3 = new LinkedList<>();
    }
    
}
