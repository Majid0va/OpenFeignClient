package atl.practice.clientApiTask.controller;

import atl.practice.clientApiTask.response.Breed;
import atl.practice.clientApiTask.response.CatFact;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "catFact-api", url = "https://catfact.ninja")
public interface FeignClientsCat {
    @GetMapping("/breeds")
    List<Breed> getBreed();

    @GetMapping("/facts")
    List<CatFact> getFacts();

    @GetMapping("/fact")
    CatFact getRandom();


}
