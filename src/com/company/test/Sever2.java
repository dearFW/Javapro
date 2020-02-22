package com.company.test;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

/**
 * Created by heystephen on 2020/2/22.
 */
public class Sever2 {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost",3307);
            System.out.println("客户端连接");
            Scanner scanner = new Scanner(System.in);
            OutputStream os = socket.getOutputStream();
            //可转成字节流输出
            PrintStream pw = new PrintStream(os);
            while (true){
                String computer1=scanner.nextLine();
                pw.println(computer1);
                pw.flush();
                /*
                os.write(computer1.getBytes());

                os.flush();
                os.close();
                */
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
