package atl.practice.clientApiTask.controller;

import atl.practice.clientApiTask.response.Dog;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@RestController
@RequestMapping("/feign")
@RequiredArgsConstructor
public class FeignDogController {
    private final FeignClients feignClients;
    private final Path root = Paths.get("uploads");

    public void init() {
        try {
            Files.createDirectories(root);
        } catch (IOException e) {
            throw new RuntimeException("Could not initialize folder for upload!");
        }
    }

    @GetMapping()
    Dog getResponse() {
        return feignClients.getResponse();
    }

    @GetMapping("/image")
    String getImage() {
        init();
        return feignClients.getResponse().getMessage();

    }
}
