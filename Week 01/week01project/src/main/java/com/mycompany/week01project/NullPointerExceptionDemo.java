/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.week01project;

/**
 *
 * @author thili
 */

public class NullPointerExceptionDemo {
    public static void main(String[] args) {
        String randomString = "";

        try {
            System.out.println("length: " + randomString.length());
        } catch (NullPointerException e) {
            System.out.println("Caught a NullPointerException!");
            System.out.println("Message: " + e.getMessage()); 
        }
    }
}

