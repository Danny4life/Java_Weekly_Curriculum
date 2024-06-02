package week_7.week_7_task.refactor;

import week_7.week_7_task.refactor.service.impl.HttpServerServiceImpl;

import static week_7.week_7_task.refactor.common.SimpleHttpServer.PORT;

public class Main {
    public static void main(String[] args) {
        // HttpServer server = new HttpServer(8080);

        HttpServerServiceImpl service = new HttpServerServiceImpl();

        service.start(PORT);

    }
}
