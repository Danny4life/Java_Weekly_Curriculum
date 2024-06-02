package week_7.class_activity_4;

import java.io.*;
import java.net.Socket;

public class ClientClass {
    public static void main(String[] args) throws IOException {
        // Create a client socket and connect to the server socket on port 12345
        Socket socket = new Socket("localhost", 12345);

        // for read only
        // for read and write only start commenting from here
        // Create input and output streams for communication : comment here out

//        PrintWriter output = new PrintWriter(socket.getOutputStream(), true);
//        BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));

        // for read only Send a message to the server : comment here out

       // output.println("Hello from client!");

        // for read only Read the response from the server and print it : comment here out

//        String response = input.readLine();
//        System.out.println("Server : " + response);

        // for read only Close the streams and socket : comment here out

//        input.close();
//        output.close();
//        socket.close();


        // 5A Read and write from both ends
        DataInputStream input = new DataInputStream(socket.getInputStream());
        DataOutputStream outputStream = new DataOutputStream(socket.getOutputStream());
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String message1 = "";
        String message2 = "";

        while (!message1.equalsIgnoreCase("stop")){
            message1 = br.readLine();
            outputStream.writeUTF(message1);
            message2 = input.readUTF();
            System.out.println("Server says : " + message2);

        }
        input.close();
        outputStream.close();


    }
}
