package com.mycompany.network_group_project.routers;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

public class Router5 {
    private static ServerSocket serverSocket;
    private static Socket socket;
    private static int port1=1401,port2 = 42365,port3=14011;
    private static String packet;

    public static void main(String[] args) {



        try {

            ServerSocket serverSocket = new ServerSocket(port1);
            socket = serverSocket.accept();
            DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
            DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
            packet = dataInputStream.readUTF();
            System.out.println("Packet token from client "+packet);
            serverSocket.close();
            socket.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            socket = new Socket(InetAddress.getByName("localhsot"), port2);


            DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
            dataOutputStream.writeUTF(packet);
            serverSocket.close();
            socket.close();

        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


        try {

            ServerSocket serverSocket = new ServerSocket(port1);
            socket = serverSocket.accept();
            DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
            DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
            packet = dataInputStream.readUTF();
            System.out.println("Packet token from client "+packet);
            serverSocket.close();
            socket.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            socket = new Socket(InetAddress.getByName("localhsot"), port3);


            DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
            dataOutputStream.writeUTF(packet);
            serverSocket.close();
            socket.close();

        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
