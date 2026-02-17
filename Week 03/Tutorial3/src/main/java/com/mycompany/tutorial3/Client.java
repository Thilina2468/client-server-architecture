package com.mycompany.tutorial3;

/* TODO 14: Import necessary I/O classes (BufferedReader, InputStreamReader, PrintWriter) */
/* TODO 15: Import java.net.Socket */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {

    public static void main(String[] args) {

        final String serverAddress = "localhost";
        final int serverPort = 12345;

        try (Socket clientSocket = new Socket(serverAddress, serverPort)) {

            PrintWriter output = new PrintWriter(clientSocket.getOutputStream(), true);
            
            BufferedReader input = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            
            output.println("Hello From the Client");
            
            String serverResponse = input.readLine();

            System.out.println("Received from server: " + serverResponse);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
