package networking_;

import java.io.*;
import java.net.*;

public class MyServer {

    public static void main(String[] args){

        try {
            ServerSocket serverSocket = new ServerSocket(1234);
            Socket socket = serverSocket.accept();  //establish connection

            ObjectInputStream obj = new ObjectInputStream(socket.getInputStream());
            String str = (String) obj.readUTF();

            System.out.println("Message: " + str);

            serverSocket.close();
        }
        catch (Exception e ){
            System.out.println(e);
        }
    }
}
