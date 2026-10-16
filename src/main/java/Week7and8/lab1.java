/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week7and8;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;
import javax.swing.*;

/**
 *
 * @author Edmundo Dela Cruz
 */
public class lab1 extends JFrame implements ActionListener{
    
    private JTextField txtInput;
    private DefaultListModel<String> listModel;
    private JList<String> listTask;
    private JScrollPane scrollPane;
    private JButton btnAdd, btnRemove, btnCompleted, btnClear;
    private LinkedList<String> linkedList;
    
   
    lab1(){
        setTitle("lab 1 Activity");
        setSize(500, 500);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //Add of components
        txtInput = new JTextField();
        txtInput.setBounds(100, 50, 300, 30);
        add(txtInput);
        
        listModel = new DefaultListModel<>(); //FE
        linkedList = new LinkedList(); //BE
        
        listTask = new JList<>(listModel);
        scrollPane = new JScrollPane(listTask);
        scrollPane.setBounds(100, 100, 300, 200);
        add(scrollPane);
        
        btnAdd = new JButton("Add");
        btnAdd.setBounds(100, 350, 60, 30);
        add(btnAdd);
        
        btnRemove = new JButton("Remove");
        btnRemove.setBounds(180, 350, 60, 30);
        add(btnRemove);
        
        btnCompleted = new JButton("Completed");
        btnCompleted.setBounds(260, 350, 60, 30);
        add(btnCompleted);
        
        btnClear = new JButton("Clear");
        btnClear.setBounds(340, 350, 60, 30);
        add(btnClear);
        
        //Add actionlistener
        btnAdd.addActionListener(this);
        btnRemove.addActionListener(this);
        btnCompleted.addActionListener(this);
        btnClear.addActionListener(this);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == btnAdd){
            String task = txtInput.getText().trim();
            
            if(!task.isEmpty()){
                //Gagawin ko to kapag may laman ang text field
                linkedList.add(task); //BE
                listModel.addElement(task);
                txtInput.setText("");
                
            }else{
                //Gagawin ko to kapat walang laman ang text field
                JOptionPane.showMessageDialog(this, "Enter task first before adding", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }else if(e.getSource() == btnRemove){
            int indexSelected = listTask.getSelectedIndex();
            
            if(indexSelected != -1){
                //Gagawin ko to kapag mag nakaselect sa Jlist ko
                linkedList.remove(indexSelected); // BE
                listModel.removeElementAt(indexSelected); //FE
                
            }else{
                //Gagawin ko to kapag walang ni select sa Jlist ko
                 JOptionPane.showMessageDialog(this, "Select a task first before removing", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }else if(e.getSource() == btnCompleted){
            int indexSelected = listTask.getSelectedIndex();
            
            if(indexSelected != -1){
                String completedTask = listTask.getSelectedValue() + " (Completed)";
                listModel.set(indexSelected, completedTask);
                listTask.setSelectedIndex(-1);
            }else{
                 JOptionPane.showMessageDialog(this, "Select a task first before completing", "Error", JOptionPane.ERROR_MESSAGE);
            }
            
        }else if(e.getSource() == btnClear){
            listModel.clear();
            linkedList.clear();
        }
    }
    
}
