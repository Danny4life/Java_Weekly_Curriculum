package week_7.week_7_task.refactor.service.impl;

import week_7.week_7_task.refactor.service.HttpServerService;
import week_7.week_7_task.refactor.utils.HttpHandler;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import static week_7.week_7_task.refactor.common.SimpleHttpServer.PORT;

public class HttpServerServiceImpl implements HttpServerService {
    @Override
    public void start(int port) {
        try(ServerSocket serverSocket = new ServerSocket(PORT)){
            System.out.println("Server started on port " + port);

            while (true){
                Socket socket = serverSocket.accept();
                System.out.println("New connection established");

                new HttpHandler(socket).start();
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
