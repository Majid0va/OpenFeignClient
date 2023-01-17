package atl.practice.clientApiTask.controller;

import atl.practice.clientApiTask.response.CatFact;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/feign1")
public class FeignCatController2 {
    private final FeignClientsCat feignClientsCat;

    @GetMapping("/facts")
    List<CatFact> getAll() {
        return feignClientsCat.getFacts();
    }


    @GetMapping("/fact")
    CatFact getRandom() {
        return feignClientsCat.getRandom();
    }
}
