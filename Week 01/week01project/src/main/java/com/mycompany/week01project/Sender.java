/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.week01project;

import java.util.logging.Logger;
import java.util.logging.Level;

public class Sender {
    private static final Logger logger = Logger.getLogger(Sender.class.getName());

    public Message createMessage(String content) {
        logger.info("Message has been created");
        return new Message(content);
    }

    public void sendMessage(Message message, Receiver receiver) {
        logger.info("Message is being sent to the receiver");
        receiver.receiveMessage(message);
    }
}
