/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week6;

import java.util.Stack;



/**
 *
 * @author Edmundo Dela Cruz
 */
public class stackSample {
    public static void main(String[] args){
        
        Stack stack = new Stack();
        stack.push("Ed");
        stack.push(25);
        stack.push(true);
        stack.push("Ed");
        stack.push(25);
        stack.push(true);
        stack.push("Ed");
        stack.push(25);
        stack.push(true);
        stack.push(true);
        
        System.out.println("Stack "+stack);
        
        System.out.println("Capacity" +stack.capacity());
        
        System.out.println("First element is "+stack.peek());
        System.out.println("Stack 1 "+stack);
        
        System.out.println("First element to remove is "+stack.pop());
        System.out.println("Stack 2 "+stack);
        
        System.out.println("Capacity" +stack.capacity());
        
        Stack stack1 = new Stack();
        stack1.push("Ed");
        stack1.push(25);
        stack1.push(true);
        
        Stack stack2 = new Stack();
        stack2.push("Ed");
        stack2.push(25);
        stack2.push(true);
        
        System.out.println("Equals "+stack1.equals(stack2));
        
    }
    
}
