package atl.practice.clientApiTask.controller;

import atl.practice.clientApiTask.response.Breed;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/feign2")
public class FeignCatController1 {

    private final FeignClientsCat feignClientsCat;

    @GetMapping("/breeds")
    List<Breed> getAll() {
        return feignClientsCat.getBreed();
    }
}
