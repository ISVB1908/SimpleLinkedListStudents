/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.classes;

/**
 *
 * @author vasqu
 */
public class Node {
    private Node next;
    private Student value;

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Student getValue() {
        return value;
    }

    public void setValue(Student value) {
        this.value = value;
    }
    
    public String showInformation(){
    return null;
    }
    
}
