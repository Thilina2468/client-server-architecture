/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.week01project;

import java.util.logging.Logger;

public class Receiver {
    private static final Logger logger = Logger.getLogger(Receiver.class.getName());

    public void receiveMessage(Message message) {
        logger.info("Message has been received");
        logger.info("Content: " + message.getContent());
    }
}
