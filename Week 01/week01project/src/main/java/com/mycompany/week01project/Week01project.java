/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.week01project;

import java.util.logging.Logger;
import java.util.logging.Handler;
import java.util.logging.ConsoleHandler;
import java.util.logging.Level;

public class Week01project {
    private static final Logger logger = Logger.getLogger(Week01project.class.getName());

    public static void main(String[] args) {
        configureLogger();

        Sender s1 = new Sender();
        Receiver r1 = new Receiver();

        Message m1 = s1.createMessage("This is a demo Message");
        s1.sendMessage(m1, r1);
    }

    private static void configureLogger() {
        try {
            Logger globalLogger = Logger.getLogger("");
            Handler[] handlers = globalLogger.getHandlers();

            for (Handler handler : handlers) {
                globalLogger.removeHandler(handler);
            }

            ConsoleHandler consoleHandler = new ConsoleHandler();
            consoleHandler.setLevel(Level.ALL);
            globalLogger.addHandler(consoleHandler);
            globalLogger.setLevel(Level.ALL);
        } catch (Exception e) {
            Logger.getGlobal().log(Level.SEVERE, "Error configuring logger: " + e.getMessage(), e);
        }
    }
}
