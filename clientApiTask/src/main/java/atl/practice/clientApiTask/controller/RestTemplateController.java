package atl.practice.clientApiTask.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/rest")
public class RestTemplateController {
    private static final String BREEDS_API = "https://catfact.ninja";

    @GetMapping("/breeds")
    public ResponseEntity<?> findAll() {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForEntity(BREEDS_API+"/breeds", List.class);

    }
}
