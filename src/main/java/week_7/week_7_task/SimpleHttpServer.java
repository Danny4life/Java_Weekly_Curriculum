package week_7.week_7_task;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class SimpleHttpServer {
    private static final int PORT = 8080;
    private static final String HTML_FILE_PATH = "index.html";
    private static final String JSON_FILE_PATH = "data.json";

    public static void main(String[] args) {
        //  System.out.println("Current Directory: " + System.getProperty("user.dir"));

        // server socket starts the connection
        try(ServerSocket serverSocket = new ServerSocket(PORT)){
            System.out.println("Server started on port  " + PORT);

            while (true){
                // socket accept the connection from the client
                Socket socket = serverSocket.accept();
                System.out.println("New Connection established");

                // Create a new thread to handle each request using lambda expression
                Thread thread = new Thread(()-> handleRequest(socket));
                thread.start();
            }
        }catch (IOException e){
            e.printStackTrace();

        }
    }

    private static void handleRequest(Socket socket){
        try(BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true)) {
            String request = in.readLine();

            if(request != null){
                String[] parts = request.split("\\s+");
                if(parts.length >= 2 && parts[0].equals("GET")){
                    String path = parts[1];
                    if(path.equals("/") || path.equals("/index.html")){
                        sendHtmlResponse(out);
                    } else if (path.equals("/json")) {
                        sendJsonResponse(out);
                    }else {
                        sendNotFoundResponse(out);
                    }
                }
            }
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try{
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void sendHtmlResponse(PrintWriter out)throws IOException{
        File file = new File(HTML_FILE_PATH);
//        System.out.println("HTML File Path: " + new File(HTML_FILE_PATH).getAbsolutePath());
//        System.out.println("HTML File exists: " + file.exists());

        if(file.exists()){
            out.println("HTTP/1.1 200 OK");
            out.println("Content-Type: text/html");
            out.println();

            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line;

            while ((line = reader.readLine()) != null){
                out.println(line);
                System.out.println(line);
            }
            reader.close();
        }else {
            sendNotFoundResponse(out);
        }
    }

    public static void sendJsonResponse(PrintWriter out) throws IOException {
        File file = new File(JSON_FILE_PATH);
//        System.out.println("JSON File Path: " + new File(JSON_FILE_PATH).getAbsolutePath());
//        System.out.println("JSON File exists: " + file.exists());

        if(file.exists()){
            out.println("HTTP/1.1 200 OK");
            out.println("Content-Type: application/json");
            out.println();

            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line;

            while ((line = reader.readLine()) != null){
                out.println(line);
                System.out.println(line);
            }
            reader.close();
        }else {
            sendNotFoundResponse(out);
        }
    }

    private static void sendNotFoundResponse(PrintWriter out){
        out.println("HTTP/1.1 404 Not Found");
        out.println("Content-Type: text/plain");
        out.println();
        out.println("404 Not Found - The requested resource was not found on this server.");
    }
}
