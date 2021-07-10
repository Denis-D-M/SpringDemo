package com.test.resource;

import com.test.MyBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

@RestController
@Scope("singleton")
public class MyTestController {

    private final HttpClient client = HttpClient.newBuilder().build();
    private static final Logger LOGGER = LoggerFactory.getLogger(MyTestController.class);

    @GetMapping("/")
    public String mainPage() throws IOException, InterruptedException {
//        HttpRequest request = HttpRequest.newBuilder()
//                .GET()
//                .uri(URI.create("http://localhost:8081/"))
//                .build();
//        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
//        LOGGER.info(("Ответ с " + request.uri().toString() + " получен."));
//        return response.body();
        return "Видал чему научился? Сосат, Антошка) \n У меня теперь свой EC2 есть, спасибо индусам.";
    }

    @GetMapping("/hello")
    public String hello() {
        return "Hello!";
    }

}
