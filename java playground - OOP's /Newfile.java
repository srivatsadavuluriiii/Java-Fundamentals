/*
Write a program to create a data streams for the following operations
a)Reading primitive data from a file
b)Write primitive data to a file.
 */

import java.io.*;


public class Newfile {
    public static void main(String[] args) {
        try {
            DataOutputStream dos = new DataOutputStream(new FileOutputStream("/Users/srivatsadavuluri/Downloads/input.txt"));
            dos.writeInt(10);
            dos.writeDouble(10.5);
            dos.writeChar('A');
            dos.writeBoolean(true);
            dos.writeUTF("Hello");
            dos.close();
            DataInputStream dis = new DataInputStream(new FileInputStream("/Users/srivatsadavuluri/Downloads/input.txt"));
            System.out.println(dis.readInt());
            System.out.println(dis.readDouble());
            System.out.println(dis.readChar());
            System.out.println(dis.readBoolean());
            System.out.println(dis.readUTF());
            dis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
