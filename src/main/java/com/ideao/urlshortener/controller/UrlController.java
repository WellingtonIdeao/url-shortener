package com.ideao.urlshortener.controller;

import com.ideao.urlshortener.domain.url.UrlRequestDTO;
import com.ideao.urlshortener.domain.url.UrlResponseDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("shorten-url")
public class UrlController {


    @PostMapping
    public ResponseEntity<UrlResponseDTO> createShortenUrl(@RequestBody UrlRequestDTO urlRequestDto) {
        UrlResponseDTO urlResponseDto = new UrlResponseDTO(urlRequestDto.url());
        return  ResponseEntity.ok(urlResponseDto);
    }
}
