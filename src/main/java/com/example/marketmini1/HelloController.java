package com.example.marketmini1;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class HelloController {

    @Operation(summary = "test hello", description = "hello api example")
    @GetMapping("/hello")
    public ResponseEntity<String> hello(@Parameter(description = "이름", required = false)  String name) {
        System.out.println("hi");
        return ResponseEntity.ok("hello " + name);
    }
}