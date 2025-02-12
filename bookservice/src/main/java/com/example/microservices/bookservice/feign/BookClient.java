package com.example.microservices.bookservice.feign;

import com.example.microservices.bookservice.dto.GenreDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(name = "APIGateway", url = "http://localhost:8089")
public interface BookClient {
    @GetMapping("/genre/quotes")
    List<GenreDTO> getQuotesByBookName(@RequestParam("bookName") String bookName);

}
