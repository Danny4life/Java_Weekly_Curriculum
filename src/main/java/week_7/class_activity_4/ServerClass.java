package week_7.class_activity_4;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerClass {
    public static void main(String[] args) throws IOException {
        // Create a server socket on port 12345
        ServerSocket server = new ServerSocket(12345);

        System.out.println("server waiting for client...");

        // Accept client connections
        Socket clentSocket = server.accept();

        System.out.println("Client connected");

        // read only Create input and output streams for communication : start commenting out from here

//        BufferedReader input = new BufferedReader(new InputStreamReader(clentSocket.getInputStream()));
//        PrintWriter output = new PrintWriter(clentSocket.getOutputStream(), true);

        // read only Read data from the client and print it : comment here out

//        String message = input.readLine();
//        System.out.println("Client : " + message);

        // read only Send a response back to the client : comment here out

       // output.println("Hello from server!");

        // read only Close the streams and sockets : comment here out
//        input.close();
//        output.close();
//        clentSocket.close();
//        server.close();

        // 5A Read and Write from both ends
        DataInputStream input = new DataInputStream(clentSocket.getInputStream());
        DataOutputStream outputStream = new DataOutputStream(clentSocket.getOutputStream());
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String message1 = "";
        String message2 = "";

        while (!message1.equalsIgnoreCase("stop")){
            message1 = input.readUTF();
            System.out.println("Client says : " + message1);
            message2 = br.readLine();
            outputStream.writeUTF(message2);

        }
        input.close();
        server.close();
        clentSocket.close();
    }
}
