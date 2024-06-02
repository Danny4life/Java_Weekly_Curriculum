package week_7.week_7_task.refactor.utils;

import java.io.*;
import java.net.Socket;

import static week_7.week_7_task.refactor.common.SimpleHttpServer.HTML_FILE_PATHS;
import static week_7.week_7_task.refactor.common.SimpleHttpServer.JSON_FILE_PATHS;

public class HttpHandler extends Thread{
    //This socket help us represents a connection between the server and a client.
    private Socket socket;

    public HttpHandler(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        // handling multiple request
        try(BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter output = new PrintWriter(socket.getOutputStream(), true)) {

            // this will help us read the client HTTP request line by line from the input stream
            String request = input.readLine();

            if(request != null){
                String[] parts = request.split("\\s+");
                if(parts.length >= 2 && parts[0].equals("GET")){
                    String path = parts[1];
                    if(path.equals("/") || path.equals("index1.html")){
                        sendNewHtmlResponse(output);
                    } else if (path.equals("/json")) {
                        sendNewJsonResponse(output);
                    }else {
                        sendNewNotFoundResponse(output);
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



    //The sendNewHtmlResponse and sendNewJsonResponse methods are responsible for sending HTML and JSON responses, respectively.

    private void sendNewHtmlResponse(PrintWriter output) throws IOException {
        File file = new File(HTML_FILE_PATHS);

        if(file.exists()){
            sendResponse(output, file, "text/html");
        }else {
            sendNewNotFoundResponse(output);
        }
    }

    private void sendNewJsonResponse(PrintWriter output) throws IOException {
        File file = new File(JSON_FILE_PATHS);

        if(file.exists()){
            sendResponse(output, file, "application/json");
        }else {
            sendNewNotFoundResponse(output);
        }

    }


    private void sendNewNotFoundResponse(PrintWriter output) {
        output.println("HTTP/1.1 404 Not Found");
        output.println("Content-Type: text/plain");
        output.println();
        output.println("404 Not Found - The requested resource was not found on this server.");

    }


    //The sendResponse method is a helper method used by sendHtmlResponse and sendJsonResponse
    // to send generic responses with specified content type.

    private void sendResponse(PrintWriter output, File file, String contentType) throws IOException {
        output.println("HTTP/1.1 200 OK");
        output.println("Content-Type: " + contentType);
        output.println();

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                output.println(line);
                System.out.println(line);
            }
        }
    }
}
