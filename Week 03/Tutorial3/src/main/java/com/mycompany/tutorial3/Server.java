package com.mycompany.tutorial3;

import java.io.*;
import java.net.*;

public class Server {

    public static void main(String[] args) {

        final int portNumber = 12345;

        try (ServerSocket socket = new ServerSocket(portNumber)) {

            System.out.println("Server is listening on port " + portNumber);

            while (true) {

                Socket clientSocket = socket.accept();

                System.out.println("Client connected: " + clientSocket.getInetAddress());

                BufferedReader input = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

                PrintWriter output = new PrintWriter(clientSocket.getOutputStream(), true);
                
                String clientMessage = input.readLine();

                System.out.println("Received from client: " + clientMessage);
                
                output.println(clientMessage);
                
                clientSocket.close();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
