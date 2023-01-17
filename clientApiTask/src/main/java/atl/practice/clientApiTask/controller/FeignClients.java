package atl.practice.clientApiTask.controller;

import atl.practice.clientApiTask.response.Dog;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "dog-api", url = "https://dog.ceo/api/breeds/image/random")
public interface FeignClients {
    @GetMapping()
    Dog getResponse();



}
