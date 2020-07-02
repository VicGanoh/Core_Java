package networking_;

import java.io.*;
import java.net.*;

public class MyClient {

    public static void main(String[] args)  {

        try {
            Socket socket = new Socket("localhost", 1234);

            ObjectOutputStream obj = new ObjectOutputStream(socket.getOutputStream());
            obj.writeUTF("Hello my Server");
            obj.flush();
            obj.close();
            socket.close();
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
